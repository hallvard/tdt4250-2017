/**
 */
package no.hal.pg.config.viewmodel.impl;

import no.hal.pg.config.viewmodel.BooleanComboRendererConfig;
import no.hal.pg.config.viewmodel.ViewmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecp.view.spi.model.impl.VAttachmentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Combo Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.config.viewmodel.impl.BooleanComboRendererConfigImpl#getTrueFalseLabels <em>True False Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanComboRendererConfigImpl extends VAttachmentImpl implements BooleanComboRendererConfig {
	/**
	 * The default value of the '{@link #getTrueFalseLabels() <em>True False Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueFalseLabels()
	 * @generated
	 * @ordered
	 */
	protected static final String TRUE_FALSE_LABELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrueFalseLabels() <em>True False Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueFalseLabels()
	 * @generated
	 * @ordered
	 */
	protected String trueFalseLabels = TRUE_FALSE_LABELS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanComboRendererConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewmodelPackage.Literals.BOOLEAN_COMBO_RENDERER_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrueFalseLabels() {
		return trueFalseLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrueFalseLabels(String newTrueFalseLabels) {
		String oldTrueFalseLabels = trueFalseLabels;
		trueFalseLabels = newTrueFalseLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewmodelPackage.BOOLEAN_COMBO_RENDERER_CONFIG__TRUE_FALSE_LABELS, oldTrueFalseLabels, trueFalseLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewmodelPackage.BOOLEAN_COMBO_RENDERER_CONFIG__TRUE_FALSE_LABELS:
				return getTrueFalseLabels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ViewmodelPackage.BOOLEAN_COMBO_RENDERER_CONFIG__TRUE_FALSE_LABELS:
				setTrueFalseLabels((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ViewmodelPackage.BOOLEAN_COMBO_RENDERER_CONFIG__TRUE_FALSE_LABELS:
				setTrueFalseLabels(TRUE_FALSE_LABELS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ViewmodelPackage.BOOLEAN_COMBO_RENDERER_CONFIG__TRUE_FALSE_LABELS:
				return TRUE_FALSE_LABELS_EDEFAULT == null ? trueFalseLabels != null : !TRUE_FALSE_LABELS_EDEFAULT.equals(trueFalseLabels);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (trueFalseLabels: ");
		result.append(trueFalseLabels);
		result.append(')');
		return result.toString();
	}

} //BooleanComboConfigImpl
