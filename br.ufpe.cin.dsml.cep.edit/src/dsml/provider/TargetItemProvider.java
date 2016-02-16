/**
 */
package dsml.provider;


import dsml.DsmlFactory;
import dsml.DsmlPackage;
import dsml.Target;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dsml.Target} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetItemProvider extends PatternItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTargetAliasPropertyDescriptor(object);
			addIncomingTargetPropertyDescriptor(object);
			addOutgoingTargetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target Alias feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetAliasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Target_targetAlias_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Target_targetAlias_feature", "_UI_Target_type"),
				 DsmlPackage.Literals.TARGET__TARGET_ALIAS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incoming Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Target_incomingTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Target_incomingTarget_feature", "_UI_Target_type"),
				 DsmlPackage.Literals.TARGET__INCOMING_TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outgoing Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Target_outgoingTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Target_outgoingTarget_feature", "_UI_Target_type"),
				 DsmlPackage.Literals.TARGET__OUTGOING_TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DsmlPackage.Literals.TARGET__OPERATION_TYPES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Target.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Target"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Target)object).getTargetAlias();
		return label == null || label.length() == 0 ?
			getString("_UI_Target_type") :
			getString("_UI_Target_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Target.class)) {
			case DsmlPackage.TARGET__TARGET_ALIAS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DsmlPackage.TARGET__OPERATION_TYPES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.TARGET__OPERATION_TYPES,
				 DsmlFactory.eINSTANCE.createAggregation()));

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.TARGET__OPERATION_TYPES,
				 DsmlFactory.eINSTANCE.createConditionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.TARGET__OPERATION_TYPES,
				 DsmlFactory.eINSTANCE.createGroupbyCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.TARGET__OPERATION_TYPES,
				 DsmlFactory.eINSTANCE.createBringGroup()));

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.TARGET__OPERATION_TYPES,
				 DsmlFactory.eINSTANCE.createTarget()));

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.TARGET__OPERATION_TYPES,
				 DsmlFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.TARGET__OPERATION_TYPES,
				 DsmlFactory.eINSTANCE.createOperator()));

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.TARGET__OPERATION_TYPES,
				 DsmlFactory.eINSTANCE.createValueOperator()));

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.TARGET__OPERATION_TYPES,
				 DsmlFactory.eINSTANCE.createUnaryPattern()));

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.TARGET__OPERATION_TYPES,
				 DsmlFactory.eINSTANCE.createPatternTimer()));

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.TARGET__OPERATION_TYPES,
				 DsmlFactory.eINSTANCE.createRepeatPattern()));
	}

}
