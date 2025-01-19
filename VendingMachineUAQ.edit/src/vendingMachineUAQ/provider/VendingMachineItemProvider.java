/**
 */
package vendingMachineUAQ.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import vendingMachineUAQ.VendingMachine;
import vendingMachineUAQ.VendingMachineUAQFactory;
import vendingMachineUAQ.VendingMachineUAQPackage;

/**
 * This is the item provider adapter for a {@link vendingMachineUAQ.VendingMachine} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VendingMachineItemProvider extends NamedEntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendingMachineItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HasId_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HasId_id_feature", "_UI_HasId_type"),
				 VendingMachineUAQPackage.Literals.HAS_ID__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(VendingMachineUAQPackage.Literals.VENDING_MACHINE__LOCATION);
			childrenFeatures.add(VendingMachineUAQPackage.Literals.VENDING_MACHINE__STATE);
			childrenFeatures.add(VendingMachineUAQPackage.Literals.VENDING_MACHINE__KEYPAD);
			childrenFeatures.add(VendingMachineUAQPackage.Literals.VENDING_MACHINE__PAYMENT_PROCESSOR);
			childrenFeatures.add(VendingMachineUAQPackage.Literals.VENDING_MACHINE__ITEM_PROCESSOR);
			childrenFeatures.add(VendingMachineUAQPackage.Literals.VENDING_MACHINE__INVENTORY);
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
	 * This returns VendingMachine.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VendingMachine"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((VendingMachine)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_VendingMachine_type") :
			getString("_UI_VendingMachine_type") + " " + label;
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

		switch (notification.getFeatureID(VendingMachine.class)) {
			case VendingMachineUAQPackage.VENDING_MACHINE__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case VendingMachineUAQPackage.VENDING_MACHINE__LOCATION:
			case VendingMachineUAQPackage.VENDING_MACHINE__STATE:
			case VendingMachineUAQPackage.VENDING_MACHINE__KEYPAD:
			case VendingMachineUAQPackage.VENDING_MACHINE__PAYMENT_PROCESSOR:
			case VendingMachineUAQPackage.VENDING_MACHINE__ITEM_PROCESSOR:
			case VendingMachineUAQPackage.VENDING_MACHINE__INVENTORY:
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
				(VendingMachineUAQPackage.Literals.VENDING_MACHINE__LOCATION,
				 VendingMachineUAQFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(VendingMachineUAQPackage.Literals.VENDING_MACHINE__STATE,
				 VendingMachineUAQFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(VendingMachineUAQPackage.Literals.VENDING_MACHINE__KEYPAD,
				 VendingMachineUAQFactory.eINSTANCE.createKeypad()));

		newChildDescriptors.add
			(createChildParameter
				(VendingMachineUAQPackage.Literals.VENDING_MACHINE__PAYMENT_PROCESSOR,
				 VendingMachineUAQFactory.eINSTANCE.createPaymentProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(VendingMachineUAQPackage.Literals.VENDING_MACHINE__ITEM_PROCESSOR,
				 VendingMachineUAQFactory.eINSTANCE.createItemProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(VendingMachineUAQPackage.Literals.VENDING_MACHINE__INVENTORY,
				 VendingMachineUAQFactory.eINSTANCE.createInventory()));
	}

}
