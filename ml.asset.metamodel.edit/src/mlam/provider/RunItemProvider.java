/**
 */
package mlam.provider;


import java.util.Collection;
import java.util.List;

import mlam.MlamFactory;
import mlam.MlamPackage;
import mlam.Run;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mlam.Run} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RunItemProvider 
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
	public RunItemProvider(AdapterFactory adapterFactory) {
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
			addNamePropertyDescriptor(object);
			addCreationDatePropertyDescriptor(object);
			addLastUpdateDatePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
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
				 getString("_UI_Run_Id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_Id_feature", "_UI_Run_type"),
				 MlamPackage.Literals.RUN__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Run_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_Name_feature", "_UI_Run_type"),
				 MlamPackage.Literals.RUN__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Creation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Run_CreationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_CreationDate_feature", "_UI_Run_type"),
				 MlamPackage.Literals.RUN__CREATION_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Update Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastUpdateDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Run_LastUpdateDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_LastUpdateDate_feature", "_UI_Run_type"),
				 MlamPackage.Literals.RUN__LAST_UPDATE_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Run_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_Description_feature", "_UI_Run_type"),
				 MlamPackage.Literals.RUN__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(MlamPackage.Literals.RUN__ASSET);
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
	 * This returns Run.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Run"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Run)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Run_type") :
			getString("_UI_Run_type") + " " + label;
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

		switch (notification.getFeatureID(Run.class)) {
			case MlamPackage.RUN__ID:
			case MlamPackage.RUN__NAME:
			case MlamPackage.RUN__CREATION_DATE:
			case MlamPackage.RUN__LAST_UPDATE_DATE:
			case MlamPackage.RUN__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MlamPackage.RUN__ASSET:
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
				(MlamPackage.Literals.RUN__ASSET,
				 MlamFactory.eINSTANCE.createProductionCode()));

		newChildDescriptors.add
			(createChildParameter
				(MlamPackage.Literals.RUN__ASSET,
				 MlamFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(MlamPackage.Literals.RUN__ASSET,
				 MlamFactory.eINSTANCE.createDataset()));

		newChildDescriptors.add
			(createChildParameter
				(MlamPackage.Literals.RUN__ASSET,
				 MlamFactory.eINSTANCE.createTrainData()));

		newChildDescriptors.add
			(createChildParameter
				(MlamPackage.Literals.RUN__ASSET,
				 MlamFactory.eINSTANCE.createTestData()));

		newChildDescriptors.add
			(createChildParameter
				(MlamPackage.Literals.RUN__ASSET,
				 MlamFactory.eINSTANCE.createEvalData()));

		newChildDescriptors.add
			(createChildParameter
				(MlamPackage.Literals.RUN__ASSET,
				 MlamFactory.eINSTANCE.createSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(MlamPackage.Literals.RUN__ASSET,
				 MlamFactory.eINSTANCE.createLog()));

		newChildDescriptors.add
			(createChildParameter
				(MlamPackage.Literals.RUN__ASSET,
				 MlamFactory.eINSTANCE.createRandomSeed()));

		newChildDescriptors.add
			(createChildParameter
				(MlamPackage.Literals.RUN__ASSET,
				 MlamFactory.eINSTANCE.createExecutionData()));

		newChildDescriptors.add
			(createChildParameter
				(MlamPackage.Literals.RUN__ASSET,
				 MlamFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(MlamPackage.Literals.RUN__ASSET,
				 MlamFactory.eINSTANCE.createExplainable()));

		newChildDescriptors.add
			(createChildParameter
				(MlamPackage.Literals.RUN__ASSET,
				 MlamFactory.eINSTANCE.createGeneratedArtifact()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MlamEditPlugin.INSTANCE;
	}

}
