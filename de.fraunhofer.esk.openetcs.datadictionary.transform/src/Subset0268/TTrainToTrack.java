/**
 */
package Subset0268;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TTrain To Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Subset0268.TTrainToTrack#getGroup <em>Group</em>}</li>
 *   <li>{@link Subset0268.TTrainToTrack#getList <em>List</em>}</li>
 *   <li>{@link Subset0268.TTrainToTrack#getPacket <em>Packet</em>}</li>
 * </ul>
 * </p>
 *
 * @see Subset0268.Subset0268Package#getTTrainToTrack()
 * @model extendedMetaData="name='T_TrainToTrack' kind='elementOnly'"
 * @generated
 */
public interface TTrainToTrack extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see Subset0268.Subset0268Package#getTTrainToTrack_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference list.
	 * The list contents are of type {@link Subset0268.ListType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference list.
	 * @see Subset0268.Subset0268Package#getTTrainToTrack_List()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='List' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<ListType> getList();

	/**
	 * Returns the value of the '<em><b>Packet</b></em>' containment reference list.
	 * The list contents are of type {@link Subset0268.TPacket}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet</em>' containment reference list.
	 * @see Subset0268.Subset0268Package#getTTrainToTrack_Packet()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Packet' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<TPacket> getPacket();

} // TTrainToTrack
