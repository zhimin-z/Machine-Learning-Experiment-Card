/**
 */
package mlam.provider;


import java.util.Collection;
import java.util.List;

import mlam.Data;
import mlam.MlamFactory;
import mlam.MlamPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mlam.Data} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataItemProvider extends AssetItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(MlamPackage.Literals.DATA__DATASET);
			childrenFeatures.add(MlamPackage.Literals.DATA__FEATURE);
			childrenFeatures.add(MlamPackage.Literals.DATA__GENERATED_ARTIFACT);
			childrenFeatures.add(MlamPackage.Literals.DATA__LOG);
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
	 * This returns Data.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Data"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Data)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Data_type") :
			getString("_UI_Data_type") + " " + label;
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

		switch (notification.getFeatureID(Data.class)) {
			case MlamPackage.DATA__DATASET:
			case MlamPackage.DATA__FEATURE:
			case MlamPackage.DATA__GENERATED_ARTIFACT:
			case MlamPackage.DATA__LOG:
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
				(MlamPackage.Literals.DATA__DATASET,
				 MlamFactory.eINSTANCE.createDataset()));

		newChildDescriptors.add
			(createChildParameter
				(MlamPackage.Literals.DATA__DATASET,
				 MlamFactory.eINSTANCE.createTrainData()));

		newChildDescriptors.add
			(createChildParameter
				(MlamPackage.Literals.DATA__DATASET,
				 MlamFactory.eINSTANCE.createTestData()));

		newChildDescriptors.add
			(createChildParameter
				(MlamPackage.Literals.DATA__DATASET,
				 MlamFactory.eINSTANCE.createEvalData()));

		newChildDescriptors.add
			(createChildParameter
				(MlamPackage.Literals.DATA__FEATURE,
				 MlamFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(MlamPackage.Literals.DATA__GENERATED_ARTIFACT,
				 MlamFactory.eINSTANCE.createGeneratedArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(MlamPackage.Literals.DATA__LOG,
				 MlamFactory.eINSTANCE.createLog()));
	}

}
