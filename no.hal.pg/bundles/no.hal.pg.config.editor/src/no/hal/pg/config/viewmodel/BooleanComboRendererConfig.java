/**
 */
package no.hal.pg.config.viewmodel;

import org.eclipse.emf.ecp.view.spi.model.VAttachment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Combo Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.config.viewmodel.BooleanComboRendererConfig#getTrueFalseLabels <em>True False Labels</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.config.viewmodel.ViewmodelPackage#getBooleanComboRendererConfig()
 * @model
 * @generated
 */
public interface BooleanComboRendererConfig extends VAttachment {
	/**
	 * Returns the value of the '<em><b>True False Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True False Labels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True False Labels</em>' attribute.
	 * @see #setTrueFalseLabels(String)
	 * @see no.hal.pg.config.viewmodel.ViewmodelPackage#getBooleanComboRendererConfig_TrueFalseLabels()
	 * @model
	 * @generated
	 */
	String getTrueFalseLabels();

	/**
	 * Sets the value of the '{@link no.hal.pg.config.viewmodel.BooleanComboRendererConfig#getTrueFalseLabels <em>True False Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True False Labels</em>' attribute.
	 * @see #getTrueFalseLabels()
	 * @generated
	 */
	void setTrueFalseLabels(String value);

} // BooleanComboConfig
