package no.hal.pg.ui;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.TextActionHandler;
import org.eclipse.ui.part.ViewPart;

public abstract class AbstractSelectionView extends ViewPart implements IPartListener {

	protected IEditingDomainProvider editingDomainProvider;
	protected ISelectionProvider selectionProvider;
	
	@Override
	public void init(IViewSite site) throws PartInitException {
		super.init(site);
		getSite().getWorkbenchWindow().getPartService().addPartListener(this);
	}

	@Override
	public void dispose() {
		getSite().getWorkbenchWindow().getPartService().removePartListener(this);
		editingDomainProvider = null;
		super.dispose();
	}

	private ISelectionChangedListener selectionChangedListener = new ISelectionChangedListener(){
		@Override
		public void selectionChanged(SelectionChangedEvent event) {
			AbstractSelectionView.this.selectionChanged(event.getSelection());
		}
	};
	
	protected void setSelectionProvider(ISelectionProvider selectionProvider) {
		if (this.selectionProvider == selectionProvider) {
			return;
		}
		if (this.selectionProvider != null) {
			this.selectionProvider.removeSelectionChangedListener(selectionChangedListener);
		}
		this.selectionProvider = selectionProvider;
		if (this.selectionProvider != null) {
			this.selectionProvider.addSelectionChangedListener(selectionChangedListener);
		}
		selectionChanged(this.selectionProvider != null ? this.selectionProvider.getSelection() : StructuredSelection.EMPTY);
	}

	protected void setEditingDomainProvider(IEditingDomainProvider editingDomainProvider) {
		if (this.editingDomainProvider == editingDomainProvider) {
			return;
		}
		if (this.editingDomainProvider != null) {
		}
		this.editingDomainProvider = editingDomainProvider;
		if (this.editingDomainProvider != null) {
		}
		updateView();
	}

	protected void updateView() {
	}
	
	@Override
	public <T> T getAdapter(Class<T> type) {
		T t =  super.getAdapter(type);
		if (t == null && editingDomainProvider instanceof IAdaptable) {
			t = ((IAdaptable) editingDomainProvider).getAdapter(type);
		}
		return t;
	}

	protected EObject getContainer(EObject eObject, EClass eClass) {
		while (eObject != null) {
			if (eClass.isInstance(eObject)) {
				return eObject;
			}
			eObject = eObject.eContainer();
		}
		return null;
	}

	protected void setInputAndSelectFirst(ContentViewer contentViewer, Object input) {
		setInputAndSelectFirst(contentViewer, input, null);
	}
	protected void setInputAndSelectFirst(ContentViewer contentViewer, Object input, Class<? extends EObject> selectionClass) {
		contentViewer.setInput(input);
		IStructuredContentProvider contentProvider = (IStructuredContentProvider) contentViewer.getContentProvider();
		Object[] elements = contentProvider.getElements(input);
		for (int i = 0; i < elements.length; i++) {
			if (selectionClass == null || selectionClass.isInstance(elements[i])) {
				contentViewer.setSelection(new StructuredSelection(elements[i]));
			}
		}
	}

	private void updateProviders(IWorkbenchPart part) {
		if (part == this) {
			return;
		}
		ISelectionProvider selectionProvider = part.getSite().getSelectionProvider();
		if (selectionProvider == null) {
			selectionProvider = getAdapter(part, ISelectionProvider.class);
		}
		setSelectionProvider(selectionProvider);
		setEditingDomainProvider(getAdapter(part, IEditingDomainProvider.class));
	}

	protected <T> T getAdapter(IWorkbenchPart part, Class<T> c) {
//		IWorkbenchPage workbenchPage = getViewSite().getWorkbenchWindow().getActivePage();
//		if (workbenchPage == null) {
//			return null;
//		}
//		IEditorPart editorPart = workbenchPage.getActiveEditor();
		if (c.isInstance(part)) {
			return (T) part;
		}
		return (part != null ? (T) part.getAdapter(c) : null);
	}
	
	@Override
	public void partActivated(IWorkbenchPart part) {
		updateProviders(part);
	}
	@Override
	public void partBroughtToTop(IWorkbenchPart part) {
		updateProviders(part);
	}
	@Override
	public void partClosed(IWorkbenchPart part) {
		updateProviders(part);
	}
	@Override
	public void partDeactivated(IWorkbenchPart part) {
		updateProviders(part);
	}
	@Override
	public void partOpened(IWorkbenchPart part) {
		updateProviders(part);
	}

	private Object selection = null;
	
	protected Object getSelection() {
		return this.selection;
	}
	
	public void selectionChanged(SelectionChangedEvent event) {
		selectionChanged(event.getSelection());
	}
	protected void selectionChanged(ISelection selection) {
		Object oldSelection = getSelection();
		this.selection = null;
		if (selection == null || selection.isEmpty()) {
		} else if (selection instanceof IStructuredSelection) {
			Object o = ((IStructuredSelection)selection).getFirstElement();
			if (isValidSelection(o)) {
				this.selection = o;
			}
		}
		if (getSelection() != oldSelection) {
			updateView();
		}
	}
	protected boolean isValidSelection(Object o) {
		return true;
	}
	
	private TextActionHandler textActionHandler;
	
	void registerTextControl(final Text textControl) {
		textControl.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				textActionHandler.addText(textControl);
			}
			@Override
			public void focusLost(FocusEvent e) {
				textActionHandler.removeText(textControl);
			}
		});
	}

	@Override
	public void createPartControl(Composite parent) {
		textActionHandler = new TextActionHandler(getViewSite().getActionBars());
		createActions();
		createMenu();
		createToolbar();
	}
	protected Text createTextControl(Composite parent, int style) {
		Text textControl = new Text(parent, style);
		textActionHandler.addText(textControl);
		return textControl;
	}
	protected void disposeTextControl(Text textControl) {
		if (! textControl.isDisposed()) {
			textActionHandler.removeText(textControl);
			textControl.dispose();
		}
	}

	protected void createActions() {
	}

	private void createMenu() {
		createMenu(getViewSite().getActionBars().getMenuManager());
	}
	protected void createMenu(IMenuManager mgr) {
	}

	private void createToolbar() {
		createToolbar(getViewSite().getActionBars().getToolBarManager());
	}
	protected void createToolbar(IToolBarManager mgr) {
	}
}