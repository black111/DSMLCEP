/**
 */
package dsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Groupby</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.TargetGroupby#getTargetGroupby <em>Target Groupby</em>}</li>
 *   <li>{@link dsml.TargetGroupby#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getTargetGroupby()
 * @model annotation="gmf.node label='targetGroupby' figure='rounded' border.color='0,0,0'"
 * @generated
 */
public interface TargetGroupby extends Component {
	/**
	 * Returns the value of the '<em><b>Target Groupby</b></em>' attribute.
	 * The default value is <code>"TargetGroupby"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Groupby</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Groupby</em>' attribute.
	 * @see dsml.DsmlPackage#getTargetGroupby_TargetGroupby()
	 * @model default="TargetGroupby" changeable="false"
	 * @generated
	 */
	String getTargetGroupby();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link dsml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see dsml.DsmlPackage#getTargetGroupby_Attributes()
	 * @model
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // TargetGroupby
