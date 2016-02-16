/**
 */
package dsml.provider;


import dsml.DrawingArea;
import dsml.DsmlFactory;
import dsml.DsmlPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dsml.DrawingArea} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DrawingAreaItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawingAreaItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(DsmlPackage.Literals.DRAWING_AREA__RULE);
			childrenFeatures.add(DsmlPackage.Literals.DRAWING_AREA__EVENTS);
			childrenFeatures.add(DsmlPackage.Literals.DRAWING_AREA__PATTERNS);
			childrenFeatures.add(DsmlPackage.Literals.DRAWING_AREA__OUTPUT);
			childrenFeatures.add(DsmlPackage.Literals.DRAWING_AREA__WINDOWS);
			childrenFeatures.add(DsmlPackage.Literals.DRAWING_AREA__TARGET_GROUPBY);
			childrenFeatures.add(DsmlPackage.Literals.DRAWING_AREA__LINKS);
			childrenFeatures.add(DsmlPackage.Literals.DRAWING_AREA__LINK_PATTERN_TARGET);
			childrenFeatures.add(DsmlPackage.Literals.DRAWING_AREA__LINK_TAGET);
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
	 * This returns DrawingArea.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DrawingArea"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DrawingArea_type");
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

		switch (notification.getFeatureID(DrawingArea.class)) {
			case DsmlPackage.DRAWING_AREA__RULE:
			case DsmlPackage.DRAWING_AREA__EVENTS:
			case DsmlPackage.DRAWING_AREA__PATTERNS:
			case DsmlPackage.DRAWING_AREA__OUTPUT:
			case DsmlPackage.DRAWING_AREA__WINDOWS:
			case DsmlPackage.DRAWING_AREA__TARGET_GROUPBY:
			case DsmlPackage.DRAWING_AREA__LINKS:
			case DsmlPackage.DRAWING_AREA__LINK_PATTERN_TARGET:
			case DsmlPackage.DRAWING_AREA__LINK_TAGET:
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
				(DsmlPackage.Literals.DRAWING_AREA__RULE,
				 DsmlFactory.eINSTANCE.createRule()));

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.DRAWING_AREA__EVENTS,
				 DsmlFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.DRAWING_AREA__PATTERNS,
				 DsmlFactory.eINSTANCE.createEventPattern()));

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.DRAWING_AREA__OUTPUT,
				 DsmlFactory.eINSTANCE.createEventOutput()));

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.DRAWING_AREA__WINDOWS,
				 DsmlFactory.eINSTANCE.createWindow()));

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.DRAWING_AREA__TARGET_GROUPBY,
				 DsmlFactory.eINSTANCE.createTargetGroupby()));

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.DRAWING_AREA__LINKS,
				 DsmlFactory.eINSTANCE.createComparison()));

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.DRAWING_AREA__LINKS,
				 DsmlFactory.eINSTANCE.createArithmetic()));

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.DRAWING_AREA__LINKS,
				 DsmlFactory.eINSTANCE.createLogicalConnector()));

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.DRAWING_AREA__LINK_PATTERN_TARGET,
				 DsmlFactory.eINSTANCE.createLinkPatternTarget()));

		newChildDescriptors.add
			(createChildParameter
				(DsmlPackage.Literals.DRAWING_AREA__LINK_TAGET,
				 DsmlFactory.eINSTANCE.createLinkTarget()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DsmlEditPlugin.INSTANCE;
	}

}
