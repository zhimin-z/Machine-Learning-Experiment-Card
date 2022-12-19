/**
 */
package mlam;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mlam.MlamFactory
 * @model kind="package"
 * @generated
 */
public interface MlamPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mlam";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cisc835.org/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MlamPackage eINSTANCE = mlam.impl.MlamPackageImpl.init();

	/**
	 * The meta object id for the '{@link mlam.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.ProjectImpl
	 * @see mlam.impl.MlamPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CREATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LAST_UPDATE_DATE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Experiment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__EXPERIMENT = 5;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mlam.impl.ExperimentImpl <em>Experiment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.ExperimentImpl
	 * @see mlam.impl.MlamPackageImpl#getExperiment()
	 * @generated
	 */
	int EXPERIMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__CREATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__LAST_UPDATE_DATE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Run</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__RUN = 5;

	/**
	 * The number of structural features of the '<em>Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mlam.impl.RunImpl <em>Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.RunImpl
	 * @see mlam.impl.MlamPackageImpl#getRun()
	 * @generated
	 */
	int RUN = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__CREATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__LAST_UPDATE_DATE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__ASSET = 5;

	/**
	 * The number of structural features of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mlam.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.AssetImpl
	 * @see mlam.impl.MlamPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__NAME = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CREATION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__LAST_UPDATE_DATE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mlam.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.CodeImpl
	 * @see mlam.impl.MlamPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__VERSION = ASSET__VERSION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CREATION_DATE = ASSET__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__LAST_UPDATE_DATE = ASSET__LAST_UPDATE_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__DEPENDENCY = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__SOURCE_FILE = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mlam.impl.ProductionCodeImpl <em>Production Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.ProductionCodeImpl
	 * @see mlam.impl.MlamPackageImpl#getProductionCode()
	 * @generated
	 */
	int PRODUCTION_CODE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_CODE__ID = CODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_CODE__NAME = CODE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_CODE__VERSION = CODE__VERSION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_CODE__CREATION_DATE = CODE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_CODE__LAST_UPDATE_DATE = CODE__LAST_UPDATE_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_CODE__DESCRIPTION = CODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_CODE__DEPENDENCY = CODE__DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Source File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_CODE__SOURCE_FILE = CODE__SOURCE_FILE;

	/**
	 * The feature id for the '<em><b>Orchestration Script</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_CODE__ORCHESTRATION_SCRIPT = CODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Production Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_CODE_FEATURE_COUNT = CODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Production Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_CODE_OPERATION_COUNT = CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mlam.impl.ConfigurationFileImpl <em>Configuration File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.ConfigurationFileImpl
	 * @see mlam.impl.MlamPackageImpl#getConfigurationFile()
	 * @generated
	 */
	int CONFIGURATION_FILE = 6;

	/**
	 * The feature id for the '<em><b>Dtype</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FILE__DTYPE = 0;

	/**
	 * The number of structural features of the '<em>Configuration File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Configuration File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mlam.impl.SourceFileImpl <em>Source File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.SourceFileImpl
	 * @see mlam.impl.MlamPackageImpl#getSourceFile()
	 * @generated
	 */
	int SOURCE_FILE = 7;

	/**
	 * The feature id for the '<em><b>Dtype</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__DTYPE = 0;

	/**
	 * The number of structural features of the '<em>Source File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Source File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mlam.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.DependencyImpl
	 * @see mlam.impl.MlamPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 8;

	/**
	 * The feature id for the '<em><b>Dtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DTYPE = 0;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mlam.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.ModelImpl
	 * @see mlam.impl.MlamPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VERSION = ASSET__VERSION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CREATION_DATE = ASSET__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LAST_UPDATE_DATE = ASSET__LAST_UPDATE_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PARAMETER = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hyperparameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__HYPERPARAMETER = ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Neural Architecture</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NEURAL_ARCHITECTURE = ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = ASSET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mlam.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.ParameterImpl
	 * @see mlam.impl.MlamPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Dtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DTYPE = 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mlam.impl.HyperparameterImpl <em>Hyperparameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.HyperparameterImpl
	 * @see mlam.impl.MlamPackageImpl#getHyperparameter()
	 * @generated
	 */
	int HYPERPARAMETER = 11;

	/**
	 * The feature id for the '<em><b>Dtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERPARAMETER__DTYPE = 0;

	/**
	 * The number of structural features of the '<em>Hyperparameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERPARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Hyperparameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERPARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mlam.impl.NeuralArchitectureImpl <em>Neural Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.NeuralArchitectureImpl
	 * @see mlam.impl.MlamPackageImpl#getNeuralArchitecture()
	 * @generated
	 */
	int NEURAL_ARCHITECTURE = 12;

	/**
	 * The feature id for the '<em><b>Dtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEURAL_ARCHITECTURE__DTYPE = 0;

	/**
	 * The number of structural features of the '<em>Neural Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEURAL_ARCHITECTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Neural Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEURAL_ARCHITECTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mlam.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.DataImpl
	 * @see mlam.impl.MlamPackageImpl#getData()
	 * @generated
	 */
	int DATA = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__VERSION = ASSET__VERSION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__CREATION_DATE = ASSET__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__LAST_UPDATE_DATE = ASSET__LAST_UPDATE_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DATASET = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__FEATURE = ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generated Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__GENERATED_ARTIFACT = ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__LOG = ASSET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = ASSET_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mlam.impl.DatasetImpl <em>Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.DatasetImpl
	 * @see mlam.impl.MlamPackageImpl#getDataset()
	 * @generated
	 */
	int DATASET = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__VERSION = DATA__VERSION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__CREATION_DATE = DATA__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__LAST_UPDATE_DATE = DATA__LAST_UPDATE_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__DESCRIPTION = DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__DATASET = DATA__DATASET;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__FEATURE = DATA__FEATURE;

	/**
	 * The feature id for the '<em><b>Generated Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__GENERATED_ARTIFACT = DATA__GENERATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__LOG = DATA__LOG;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__DATA = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mlam.impl.TrainDataImpl <em>Train Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.TrainDataImpl
	 * @see mlam.impl.MlamPackageImpl#getTrainData()
	 * @generated
	 */
	int TRAIN_DATA = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_DATA__ID = DATASET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_DATA__NAME = DATASET__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_DATA__VERSION = DATASET__VERSION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_DATA__CREATION_DATE = DATASET__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_DATA__LAST_UPDATE_DATE = DATASET__LAST_UPDATE_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_DATA__DESCRIPTION = DATASET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_DATA__DATASET = DATASET__DATASET;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_DATA__FEATURE = DATASET__FEATURE;

	/**
	 * The feature id for the '<em><b>Generated Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_DATA__GENERATED_ARTIFACT = DATASET__GENERATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_DATA__LOG = DATASET__LOG;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_DATA__DATA = DATASET__DATA;

	/**
	 * The number of structural features of the '<em>Train Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_DATA_FEATURE_COUNT = DATASET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Train Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_DATA_OPERATION_COUNT = DATASET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mlam.impl.TestDataImpl <em>Test Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.TestDataImpl
	 * @see mlam.impl.MlamPackageImpl#getTestData()
	 * @generated
	 */
	int TEST_DATA = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA__ID = DATASET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA__NAME = DATASET__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA__VERSION = DATASET__VERSION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA__CREATION_DATE = DATASET__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA__LAST_UPDATE_DATE = DATASET__LAST_UPDATE_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA__DESCRIPTION = DATASET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA__DATASET = DATASET__DATASET;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA__FEATURE = DATASET__FEATURE;

	/**
	 * The feature id for the '<em><b>Generated Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA__GENERATED_ARTIFACT = DATASET__GENERATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA__LOG = DATASET__LOG;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA__DATA = DATASET__DATA;

	/**
	 * The number of structural features of the '<em>Test Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_FEATURE_COUNT = DATASET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Test Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DATA_OPERATION_COUNT = DATASET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mlam.impl.EvalDataImpl <em>Eval Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.EvalDataImpl
	 * @see mlam.impl.MlamPackageImpl#getEvalData()
	 * @generated
	 */
	int EVAL_DATA = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_DATA__ID = TRAIN_DATA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_DATA__NAME = TRAIN_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_DATA__VERSION = TRAIN_DATA__VERSION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_DATA__CREATION_DATE = TRAIN_DATA__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_DATA__LAST_UPDATE_DATE = TRAIN_DATA__LAST_UPDATE_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_DATA__DESCRIPTION = TRAIN_DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_DATA__DATASET = TRAIN_DATA__DATASET;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_DATA__FEATURE = TRAIN_DATA__FEATURE;

	/**
	 * The feature id for the '<em><b>Generated Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_DATA__GENERATED_ARTIFACT = TRAIN_DATA__GENERATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_DATA__LOG = TRAIN_DATA__LOG;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_DATA__DATA = TRAIN_DATA__DATA;

	/**
	 * The number of structural features of the '<em>Eval Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_DATA_FEATURE_COUNT = TRAIN_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eval Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_DATA_OPERATION_COUNT = TRAIN_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mlam.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.DocumentationImpl
	 * @see mlam.impl.MlamPackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__VERSION = DATA__VERSION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__CREATION_DATE = DATA__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__LAST_UPDATE_DATE = DATA__LAST_UPDATE_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__DESCRIPTION = DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__DATASET = DATA__DATASET;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__FEATURE = DATA__FEATURE;

	/**
	 * The feature id for the '<em><b>Generated Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__GENERATED_ARTIFACT = DATA__GENERATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__LOG = DATA__LOG;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mlam.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.SpecificationImpl
	 * @see mlam.impl.MlamPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ID = DOCUMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME = DOCUMENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__VERSION = DOCUMENTATION__VERSION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CREATION_DATE = DOCUMENTATION__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__LAST_UPDATE_DATE = DOCUMENTATION__LAST_UPDATE_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DESCRIPTION = DOCUMENTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DATASET = DOCUMENTATION__DATASET;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__FEATURE = DOCUMENTATION__FEATURE;

	/**
	 * The feature id for the '<em><b>Generated Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__GENERATED_ARTIFACT = DOCUMENTATION__GENERATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__LOG = DOCUMENTATION__LOG;

	/**
	 * The feature id for the '<em><b>Problem Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__PROBLEM_DEFINITION = DOCUMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Observation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__OBSERVATION = DOCUMENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DECISION = DOCUMENTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__METRICS = DOCUMENTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = DOCUMENTATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_OPERATION_COUNT = DOCUMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mlam.impl.LogImpl <em>Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.LogImpl
	 * @see mlam.impl.MlamPackageImpl#getLog()
	 * @generated
	 */
	int LOG = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__ID = DOCUMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__NAME = DOCUMENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__VERSION = DOCUMENTATION__VERSION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__CREATION_DATE = DOCUMENTATION__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__LAST_UPDATE_DATE = DOCUMENTATION__LAST_UPDATE_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__DESCRIPTION = DOCUMENTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__DATASET = DOCUMENTATION__DATASET;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__FEATURE = DOCUMENTATION__FEATURE;

	/**
	 * The feature id for the '<em><b>Generated Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__GENERATED_ARTIFACT = DOCUMENTATION__GENERATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__LOG = DOCUMENTATION__LOG;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__METRICS = DOCUMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Execution Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__EXECUTION_DATA = DOCUMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_FEATURE_COUNT = DOCUMENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_OPERATION_COUNT = DOCUMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mlam.impl.RandomSeedImpl <em>Random Seed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.RandomSeedImpl
	 * @see mlam.impl.MlamPackageImpl#getRandomSeed()
	 * @generated
	 */
	int RANDOM_SEED = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_SEED__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_SEED__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_SEED__VERSION = DATA__VERSION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_SEED__CREATION_DATE = DATA__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_SEED__LAST_UPDATE_DATE = DATA__LAST_UPDATE_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_SEED__DESCRIPTION = DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_SEED__DATASET = DATA__DATASET;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_SEED__FEATURE = DATA__FEATURE;

	/**
	 * The feature id for the '<em><b>Generated Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_SEED__GENERATED_ARTIFACT = DATA__GENERATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_SEED__LOG = DATA__LOG;

	/**
	 * The feature id for the '<em><b>Dtype</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_SEED__DTYPE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Random Seed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_SEED_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Random Seed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_SEED_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mlam.impl.ExecutionDataImpl <em>Execution Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.ExecutionDataImpl
	 * @see mlam.impl.MlamPackageImpl#getExecutionData()
	 * @generated
	 */
	int EXECUTION_DATA = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DATA__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DATA__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DATA__VERSION = DATA__VERSION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DATA__CREATION_DATE = DATA__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DATA__LAST_UPDATE_DATE = DATA__LAST_UPDATE_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DATA__DESCRIPTION = DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DATA__DATASET = DATA__DATASET;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DATA__FEATURE = DATA__FEATURE;

	/**
	 * The feature id for the '<em><b>Generated Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DATA__GENERATED_ARTIFACT = DATA__GENERATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DATA__LOG = DATA__LOG;

	/**
	 * The feature id for the '<em><b>Dtype</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DATA__DTYPE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execution Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Execution Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mlam.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.FeatureImpl
	 * @see mlam.impl.MlamPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = EXECUTION_DATA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = EXECUTION_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VERSION = EXECUTION_DATA__VERSION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CREATION_DATE = EXECUTION_DATA__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__LAST_UPDATE_DATE = EXECUTION_DATA__LAST_UPDATE_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = EXECUTION_DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DATASET = EXECUTION_DATA__DATASET;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURE = EXECUTION_DATA__FEATURE;

	/**
	 * The feature id for the '<em><b>Generated Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__GENERATED_ARTIFACT = EXECUTION_DATA__GENERATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__LOG = EXECUTION_DATA__LOG;

	/**
	 * The feature id for the '<em><b>Dtype</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DTYPE = EXECUTION_DATA__DTYPE;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = EXECUTION_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = EXECUTION_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mlam.impl.ExplainableImpl <em>Explainable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.ExplainableImpl
	 * @see mlam.impl.MlamPackageImpl#getExplainable()
	 * @generated
	 */
	int EXPLAINABLE = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABLE__ID = EXECUTION_DATA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABLE__NAME = EXECUTION_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABLE__VERSION = EXECUTION_DATA__VERSION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABLE__CREATION_DATE = EXECUTION_DATA__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABLE__LAST_UPDATE_DATE = EXECUTION_DATA__LAST_UPDATE_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABLE__DESCRIPTION = EXECUTION_DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABLE__DATASET = EXECUTION_DATA__DATASET;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABLE__FEATURE = EXECUTION_DATA__FEATURE;

	/**
	 * The feature id for the '<em><b>Generated Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABLE__GENERATED_ARTIFACT = EXECUTION_DATA__GENERATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABLE__LOG = EXECUTION_DATA__LOG;

	/**
	 * The feature id for the '<em><b>Dtype</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABLE__DTYPE = EXECUTION_DATA__DTYPE;

	/**
	 * The number of structural features of the '<em>Explainable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABLE_FEATURE_COUNT = EXECUTION_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Explainable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABLE_OPERATION_COUNT = EXECUTION_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mlam.impl.MetricsImpl <em>Metrics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.MetricsImpl
	 * @see mlam.impl.MlamPackageImpl#getMetrics()
	 * @generated
	 */
	int METRICS = 25;

	/**
	 * The feature id for the '<em><b>Dtype</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS__DTYPE = 0;

	/**
	 * The number of structural features of the '<em>Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mlam.impl.GeneratedArtifactImpl <em>Generated Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.impl.GeneratedArtifactImpl
	 * @see mlam.impl.MlamPackageImpl#getGeneratedArtifact()
	 * @generated
	 */
	int GENERATED_ARTIFACT = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ARTIFACT__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ARTIFACT__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ARTIFACT__VERSION = DATA__VERSION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ARTIFACT__CREATION_DATE = DATA__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ARTIFACT__LAST_UPDATE_DATE = DATA__LAST_UPDATE_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ARTIFACT__DESCRIPTION = DATA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ARTIFACT__DATASET = DATA__DATASET;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ARTIFACT__FEATURE = DATA__FEATURE;

	/**
	 * The feature id for the '<em><b>Generated Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ARTIFACT__GENERATED_ARTIFACT = DATA__GENERATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ARTIFACT__LOG = DATA__LOG;

	/**
	 * The feature id for the '<em><b>Dtype</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ARTIFACT__DTYPE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generated Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ARTIFACT_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generated Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_ARTIFACT_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mlam.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlam.DataType
	 * @see mlam.impl.MlamPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 27;


	/**
	 * Returns the meta object for class '{@link mlam.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see mlam.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Project#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mlam.Project#getId()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Id();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mlam.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Project#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see mlam.Project#getCreationDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Project#getLastUpdateDate <em>Last Update Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Update Date</em>'.
	 * @see mlam.Project#getLastUpdateDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_LastUpdateDate();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Project#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mlam.Project#getDescription()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link mlam.Project#getExperiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experiment</em>'.
	 * @see mlam.Project#getExperiment()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Experiment();

	/**
	 * Returns the meta object for class '{@link mlam.Experiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment</em>'.
	 * @see mlam.Experiment
	 * @generated
	 */
	EClass getExperiment();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Experiment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mlam.Experiment#getId()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_Id();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Experiment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mlam.Experiment#getName()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_Name();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Experiment#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see mlam.Experiment#getCreationDate()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Experiment#getLastUpdateDate <em>Last Update Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Update Date</em>'.
	 * @see mlam.Experiment#getLastUpdateDate()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_LastUpdateDate();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Experiment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mlam.Experiment#getDescription()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link mlam.Experiment#getRun <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Run</em>'.
	 * @see mlam.Experiment#getRun()
	 * @see #getExperiment()
	 * @generated
	 */
	EReference getExperiment_Run();

	/**
	 * Returns the meta object for class '{@link mlam.Run <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run</em>'.
	 * @see mlam.Run
	 * @generated
	 */
	EClass getRun();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Run#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mlam.Run#getId()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_Id();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Run#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mlam.Run#getName()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_Name();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Run#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see mlam.Run#getCreationDate()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Run#getLastUpdateDate <em>Last Update Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Update Date</em>'.
	 * @see mlam.Run#getLastUpdateDate()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_LastUpdateDate();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Run#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mlam.Run#getDescription()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link mlam.Run#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asset</em>'.
	 * @see mlam.Run#getAsset()
	 * @see #getRun()
	 * @generated
	 */
	EReference getRun_Asset();

	/**
	 * Returns the meta object for class '{@link mlam.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see mlam.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Asset#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mlam.Asset#getId()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Id();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Asset#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mlam.Asset#getName()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Name();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Asset#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mlam.Asset#getVersion()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Version();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Asset#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see mlam.Asset#getCreationDate()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Asset#getLastUpdateDate <em>Last Update Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Update Date</em>'.
	 * @see mlam.Asset#getLastUpdateDate()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_LastUpdateDate();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Asset#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mlam.Asset#getDescription()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Description();

	/**
	 * Returns the meta object for class '{@link mlam.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see mlam.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for the containment reference list '{@link mlam.Code#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see mlam.Code#getDependency()
	 * @see #getCode()
	 * @generated
	 */
	EReference getCode_Dependency();

	/**
	 * Returns the meta object for the containment reference list '{@link mlam.Code#getSourceFile <em>Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source File</em>'.
	 * @see mlam.Code#getSourceFile()
	 * @see #getCode()
	 * @generated
	 */
	EReference getCode_SourceFile();

	/**
	 * Returns the meta object for class '{@link mlam.ProductionCode <em>Production Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production Code</em>'.
	 * @see mlam.ProductionCode
	 * @generated
	 */
	EClass getProductionCode();

	/**
	 * Returns the meta object for the containment reference list '{@link mlam.ProductionCode#getOrchestrationScript <em>Orchestration Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orchestration Script</em>'.
	 * @see mlam.ProductionCode#getOrchestrationScript()
	 * @see #getProductionCode()
	 * @generated
	 */
	EReference getProductionCode_OrchestrationScript();

	/**
	 * Returns the meta object for class '{@link mlam.ConfigurationFile <em>Configuration File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration File</em>'.
	 * @see mlam.ConfigurationFile
	 * @generated
	 */
	EClass getConfigurationFile();

	/**
	 * Returns the meta object for the attribute list '{@link mlam.ConfigurationFile#getDtype <em>Dtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dtype</em>'.
	 * @see mlam.ConfigurationFile#getDtype()
	 * @see #getConfigurationFile()
	 * @generated
	 */
	EAttribute getConfigurationFile_Dtype();

	/**
	 * Returns the meta object for class '{@link mlam.SourceFile <em>Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source File</em>'.
	 * @see mlam.SourceFile
	 * @generated
	 */
	EClass getSourceFile();

	/**
	 * Returns the meta object for the attribute list '{@link mlam.SourceFile#getDtype <em>Dtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dtype</em>'.
	 * @see mlam.SourceFile#getDtype()
	 * @see #getSourceFile()
	 * @generated
	 */
	EAttribute getSourceFile_Dtype();

	/**
	 * Returns the meta object for class '{@link mlam.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see mlam.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Dependency#getDtype <em>Dtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtype</em>'.
	 * @see mlam.Dependency#getDtype()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Dtype();

	/**
	 * Returns the meta object for class '{@link mlam.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see mlam.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link mlam.Model#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see mlam.Model#getParameter()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link mlam.Model#getHyperparameter <em>Hyperparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hyperparameter</em>'.
	 * @see mlam.Model#getHyperparameter()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Hyperparameter();

	/**
	 * Returns the meta object for the containment reference list '{@link mlam.Model#getNeuralArchitecture <em>Neural Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Neural Architecture</em>'.
	 * @see mlam.Model#getNeuralArchitecture()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_NeuralArchitecture();

	/**
	 * Returns the meta object for class '{@link mlam.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see mlam.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Parameter#getDtype <em>Dtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtype</em>'.
	 * @see mlam.Parameter#getDtype()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Dtype();

	/**
	 * Returns the meta object for class '{@link mlam.Hyperparameter <em>Hyperparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hyperparameter</em>'.
	 * @see mlam.Hyperparameter
	 * @generated
	 */
	EClass getHyperparameter();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Hyperparameter#getDtype <em>Dtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtype</em>'.
	 * @see mlam.Hyperparameter#getDtype()
	 * @see #getHyperparameter()
	 * @generated
	 */
	EAttribute getHyperparameter_Dtype();

	/**
	 * Returns the meta object for class '{@link mlam.NeuralArchitecture <em>Neural Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neural Architecture</em>'.
	 * @see mlam.NeuralArchitecture
	 * @generated
	 */
	EClass getNeuralArchitecture();

	/**
	 * Returns the meta object for the attribute '{@link mlam.NeuralArchitecture#getDtype <em>Dtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtype</em>'.
	 * @see mlam.NeuralArchitecture#getDtype()
	 * @see #getNeuralArchitecture()
	 * @generated
	 */
	EAttribute getNeuralArchitecture_Dtype();

	/**
	 * Returns the meta object for class '{@link mlam.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see mlam.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the containment reference list '{@link mlam.Data#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataset</em>'.
	 * @see mlam.Data#getDataset()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Dataset();

	/**
	 * Returns the meta object for the containment reference list '{@link mlam.Data#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see mlam.Data#getFeature()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Feature();

	/**
	 * Returns the meta object for the containment reference list '{@link mlam.Data#getGeneratedArtifact <em>Generated Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generated Artifact</em>'.
	 * @see mlam.Data#getGeneratedArtifact()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_GeneratedArtifact();

	/**
	 * Returns the meta object for the containment reference list '{@link mlam.Data#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log</em>'.
	 * @see mlam.Data#getLog()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Log();

	/**
	 * Returns the meta object for class '{@link mlam.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset</em>'.
	 * @see mlam.Dataset
	 * @generated
	 */
	EClass getDataset();

	/**
	 * Returns the meta object for the attribute list '{@link mlam.Dataset#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data</em>'.
	 * @see mlam.Dataset#getData()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_Data();

	/**
	 * Returns the meta object for class '{@link mlam.TrainData <em>Train Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Data</em>'.
	 * @see mlam.TrainData
	 * @generated
	 */
	EClass getTrainData();

	/**
	 * Returns the meta object for class '{@link mlam.TestData <em>Test Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Data</em>'.
	 * @see mlam.TestData
	 * @generated
	 */
	EClass getTestData();

	/**
	 * Returns the meta object for class '{@link mlam.EvalData <em>Eval Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eval Data</em>'.
	 * @see mlam.EvalData
	 * @generated
	 */
	EClass getEvalData();

	/**
	 * Returns the meta object for class '{@link mlam.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see mlam.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for class '{@link mlam.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see mlam.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the attribute '{@link mlam.Specification#getProblemDefinition <em>Problem Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Problem Definition</em>'.
	 * @see mlam.Specification#getProblemDefinition()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_ProblemDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link mlam.Specification#getObservation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Observation</em>'.
	 * @see mlam.Specification#getObservation()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_Observation();

	/**
	 * Returns the meta object for the attribute list '{@link mlam.Specification#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Decision</em>'.
	 * @see mlam.Specification#getDecision()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_Decision();

	/**
	 * Returns the meta object for the attribute list '{@link mlam.Specification#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Metrics</em>'.
	 * @see mlam.Specification#getMetrics()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_Metrics();

	/**
	 * Returns the meta object for class '{@link mlam.Log <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log</em>'.
	 * @see mlam.Log
	 * @generated
	 */
	EClass getLog();

	/**
	 * Returns the meta object for the containment reference list '{@link mlam.Log#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see mlam.Log#getMetrics()
	 * @see #getLog()
	 * @generated
	 */
	EReference getLog_Metrics();

	/**
	 * Returns the meta object for the containment reference list '{@link mlam.Log#getExecutionData <em>Execution Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execution Data</em>'.
	 * @see mlam.Log#getExecutionData()
	 * @see #getLog()
	 * @generated
	 */
	EReference getLog_ExecutionData();

	/**
	 * Returns the meta object for class '{@link mlam.RandomSeed <em>Random Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Seed</em>'.
	 * @see mlam.RandomSeed
	 * @generated
	 */
	EClass getRandomSeed();

	/**
	 * Returns the meta object for the attribute list '{@link mlam.RandomSeed#getDtype <em>Dtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dtype</em>'.
	 * @see mlam.RandomSeed#getDtype()
	 * @see #getRandomSeed()
	 * @generated
	 */
	EAttribute getRandomSeed_Dtype();

	/**
	 * Returns the meta object for class '{@link mlam.ExecutionData <em>Execution Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Data</em>'.
	 * @see mlam.ExecutionData
	 * @generated
	 */
	EClass getExecutionData();

	/**
	 * Returns the meta object for the attribute list '{@link mlam.ExecutionData#getDtype <em>Dtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dtype</em>'.
	 * @see mlam.ExecutionData#getDtype()
	 * @see #getExecutionData()
	 * @generated
	 */
	EAttribute getExecutionData_Dtype();

	/**
	 * Returns the meta object for class '{@link mlam.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see mlam.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for class '{@link mlam.Explainable <em>Explainable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Explainable</em>'.
	 * @see mlam.Explainable
	 * @generated
	 */
	EClass getExplainable();

	/**
	 * Returns the meta object for class '{@link mlam.Metrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metrics</em>'.
	 * @see mlam.Metrics
	 * @generated
	 */
	EClass getMetrics();

	/**
	 * Returns the meta object for the attribute list '{@link mlam.Metrics#getDtype <em>Dtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dtype</em>'.
	 * @see mlam.Metrics#getDtype()
	 * @see #getMetrics()
	 * @generated
	 */
	EAttribute getMetrics_Dtype();

	/**
	 * Returns the meta object for class '{@link mlam.GeneratedArtifact <em>Generated Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generated Artifact</em>'.
	 * @see mlam.GeneratedArtifact
	 * @generated
	 */
	EClass getGeneratedArtifact();

	/**
	 * Returns the meta object for the attribute list '{@link mlam.GeneratedArtifact#getDtype <em>Dtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dtype</em>'.
	 * @see mlam.GeneratedArtifact#getDtype()
	 * @see #getGeneratedArtifact()
	 * @generated
	 */
	EAttribute getGeneratedArtifact_Dtype();

	/**
	 * Returns the meta object for enum '{@link mlam.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see mlam.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MlamFactory getMlamFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mlam.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.ProjectImpl
		 * @see mlam.impl.MlamPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ID = eINSTANCE.getProject_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__CREATION_DATE = eINSTANCE.getProject_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Last Update Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__LAST_UPDATE_DATE = eINSTANCE.getProject_LastUpdateDate();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DESCRIPTION = eINSTANCE.getProject_Description();

		/**
		 * The meta object literal for the '<em><b>Experiment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__EXPERIMENT = eINSTANCE.getProject_Experiment();

		/**
		 * The meta object literal for the '{@link mlam.impl.ExperimentImpl <em>Experiment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.ExperimentImpl
		 * @see mlam.impl.MlamPackageImpl#getExperiment()
		 * @generated
		 */
		EClass EXPERIMENT = eINSTANCE.getExperiment();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__ID = eINSTANCE.getExperiment_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__NAME = eINSTANCE.getExperiment_Name();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__CREATION_DATE = eINSTANCE.getExperiment_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Last Update Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__LAST_UPDATE_DATE = eINSTANCE.getExperiment_LastUpdateDate();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__DESCRIPTION = eINSTANCE.getExperiment_Description();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT__RUN = eINSTANCE.getExperiment_Run();

		/**
		 * The meta object literal for the '{@link mlam.impl.RunImpl <em>Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.RunImpl
		 * @see mlam.impl.MlamPackageImpl#getRun()
		 * @generated
		 */
		EClass RUN = eINSTANCE.getRun();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__ID = eINSTANCE.getRun_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__NAME = eINSTANCE.getRun_Name();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__CREATION_DATE = eINSTANCE.getRun_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Last Update Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__LAST_UPDATE_DATE = eINSTANCE.getRun_LastUpdateDate();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__DESCRIPTION = eINSTANCE.getRun_Description();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN__ASSET = eINSTANCE.getRun_Asset();

		/**
		 * The meta object literal for the '{@link mlam.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.AssetImpl
		 * @see mlam.impl.MlamPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__ID = eINSTANCE.getAsset_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__NAME = eINSTANCE.getAsset_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__VERSION = eINSTANCE.getAsset_Version();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__CREATION_DATE = eINSTANCE.getAsset_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Last Update Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__LAST_UPDATE_DATE = eINSTANCE.getAsset_LastUpdateDate();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__DESCRIPTION = eINSTANCE.getAsset_Description();

		/**
		 * The meta object literal for the '{@link mlam.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.CodeImpl
		 * @see mlam.impl.MlamPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE__DEPENDENCY = eINSTANCE.getCode_Dependency();

		/**
		 * The meta object literal for the '<em><b>Source File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE__SOURCE_FILE = eINSTANCE.getCode_SourceFile();

		/**
		 * The meta object literal for the '{@link mlam.impl.ProductionCodeImpl <em>Production Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.ProductionCodeImpl
		 * @see mlam.impl.MlamPackageImpl#getProductionCode()
		 * @generated
		 */
		EClass PRODUCTION_CODE = eINSTANCE.getProductionCode();

		/**
		 * The meta object literal for the '<em><b>Orchestration Script</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_CODE__ORCHESTRATION_SCRIPT = eINSTANCE.getProductionCode_OrchestrationScript();

		/**
		 * The meta object literal for the '{@link mlam.impl.ConfigurationFileImpl <em>Configuration File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.ConfigurationFileImpl
		 * @see mlam.impl.MlamPackageImpl#getConfigurationFile()
		 * @generated
		 */
		EClass CONFIGURATION_FILE = eINSTANCE.getConfigurationFile();

		/**
		 * The meta object literal for the '<em><b>Dtype</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_FILE__DTYPE = eINSTANCE.getConfigurationFile_Dtype();

		/**
		 * The meta object literal for the '{@link mlam.impl.SourceFileImpl <em>Source File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.SourceFileImpl
		 * @see mlam.impl.MlamPackageImpl#getSourceFile()
		 * @generated
		 */
		EClass SOURCE_FILE = eINSTANCE.getSourceFile();

		/**
		 * The meta object literal for the '<em><b>Dtype</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_FILE__DTYPE = eINSTANCE.getSourceFile_Dtype();

		/**
		 * The meta object literal for the '{@link mlam.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.DependencyImpl
		 * @see mlam.impl.MlamPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Dtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__DTYPE = eINSTANCE.getDependency_Dtype();

		/**
		 * The meta object literal for the '{@link mlam.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.ModelImpl
		 * @see mlam.impl.MlamPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PARAMETER = eINSTANCE.getModel_Parameter();

		/**
		 * The meta object literal for the '<em><b>Hyperparameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__HYPERPARAMETER = eINSTANCE.getModel_Hyperparameter();

		/**
		 * The meta object literal for the '<em><b>Neural Architecture</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__NEURAL_ARCHITECTURE = eINSTANCE.getModel_NeuralArchitecture();

		/**
		 * The meta object literal for the '{@link mlam.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.ParameterImpl
		 * @see mlam.impl.MlamPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Dtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DTYPE = eINSTANCE.getParameter_Dtype();

		/**
		 * The meta object literal for the '{@link mlam.impl.HyperparameterImpl <em>Hyperparameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.HyperparameterImpl
		 * @see mlam.impl.MlamPackageImpl#getHyperparameter()
		 * @generated
		 */
		EClass HYPERPARAMETER = eINSTANCE.getHyperparameter();

		/**
		 * The meta object literal for the '<em><b>Dtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERPARAMETER__DTYPE = eINSTANCE.getHyperparameter_Dtype();

		/**
		 * The meta object literal for the '{@link mlam.impl.NeuralArchitectureImpl <em>Neural Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.NeuralArchitectureImpl
		 * @see mlam.impl.MlamPackageImpl#getNeuralArchitecture()
		 * @generated
		 */
		EClass NEURAL_ARCHITECTURE = eINSTANCE.getNeuralArchitecture();

		/**
		 * The meta object literal for the '<em><b>Dtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEURAL_ARCHITECTURE__DTYPE = eINSTANCE.getNeuralArchitecture_Dtype();

		/**
		 * The meta object literal for the '{@link mlam.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.DataImpl
		 * @see mlam.impl.MlamPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__DATASET = eINSTANCE.getData_Dataset();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__FEATURE = eINSTANCE.getData_Feature();

		/**
		 * The meta object literal for the '<em><b>Generated Artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__GENERATED_ARTIFACT = eINSTANCE.getData_GeneratedArtifact();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__LOG = eINSTANCE.getData_Log();

		/**
		 * The meta object literal for the '{@link mlam.impl.DatasetImpl <em>Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.DatasetImpl
		 * @see mlam.impl.MlamPackageImpl#getDataset()
		 * @generated
		 */
		EClass DATASET = eINSTANCE.getDataset();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__DATA = eINSTANCE.getDataset_Data();

		/**
		 * The meta object literal for the '{@link mlam.impl.TrainDataImpl <em>Train Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.TrainDataImpl
		 * @see mlam.impl.MlamPackageImpl#getTrainData()
		 * @generated
		 */
		EClass TRAIN_DATA = eINSTANCE.getTrainData();

		/**
		 * The meta object literal for the '{@link mlam.impl.TestDataImpl <em>Test Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.TestDataImpl
		 * @see mlam.impl.MlamPackageImpl#getTestData()
		 * @generated
		 */
		EClass TEST_DATA = eINSTANCE.getTestData();

		/**
		 * The meta object literal for the '{@link mlam.impl.EvalDataImpl <em>Eval Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.EvalDataImpl
		 * @see mlam.impl.MlamPackageImpl#getEvalData()
		 * @generated
		 */
		EClass EVAL_DATA = eINSTANCE.getEvalData();

		/**
		 * The meta object literal for the '{@link mlam.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.DocumentationImpl
		 * @see mlam.impl.MlamPackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '{@link mlam.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.SpecificationImpl
		 * @see mlam.impl.MlamPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Problem Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__PROBLEM_DEFINITION = eINSTANCE.getSpecification_ProblemDefinition();

		/**
		 * The meta object literal for the '<em><b>Observation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__OBSERVATION = eINSTANCE.getSpecification_Observation();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__DECISION = eINSTANCE.getSpecification_Decision();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__METRICS = eINSTANCE.getSpecification_Metrics();

		/**
		 * The meta object literal for the '{@link mlam.impl.LogImpl <em>Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.LogImpl
		 * @see mlam.impl.MlamPackageImpl#getLog()
		 * @generated
		 */
		EClass LOG = eINSTANCE.getLog();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG__METRICS = eINSTANCE.getLog_Metrics();

		/**
		 * The meta object literal for the '<em><b>Execution Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG__EXECUTION_DATA = eINSTANCE.getLog_ExecutionData();

		/**
		 * The meta object literal for the '{@link mlam.impl.RandomSeedImpl <em>Random Seed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.RandomSeedImpl
		 * @see mlam.impl.MlamPackageImpl#getRandomSeed()
		 * @generated
		 */
		EClass RANDOM_SEED = eINSTANCE.getRandomSeed();

		/**
		 * The meta object literal for the '<em><b>Dtype</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_SEED__DTYPE = eINSTANCE.getRandomSeed_Dtype();

		/**
		 * The meta object literal for the '{@link mlam.impl.ExecutionDataImpl <em>Execution Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.ExecutionDataImpl
		 * @see mlam.impl.MlamPackageImpl#getExecutionData()
		 * @generated
		 */
		EClass EXECUTION_DATA = eINSTANCE.getExecutionData();

		/**
		 * The meta object literal for the '<em><b>Dtype</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_DATA__DTYPE = eINSTANCE.getExecutionData_Dtype();

		/**
		 * The meta object literal for the '{@link mlam.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.FeatureImpl
		 * @see mlam.impl.MlamPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '{@link mlam.impl.ExplainableImpl <em>Explainable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.ExplainableImpl
		 * @see mlam.impl.MlamPackageImpl#getExplainable()
		 * @generated
		 */
		EClass EXPLAINABLE = eINSTANCE.getExplainable();

		/**
		 * The meta object literal for the '{@link mlam.impl.MetricsImpl <em>Metrics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.MetricsImpl
		 * @see mlam.impl.MlamPackageImpl#getMetrics()
		 * @generated
		 */
		EClass METRICS = eINSTANCE.getMetrics();

		/**
		 * The meta object literal for the '<em><b>Dtype</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRICS__DTYPE = eINSTANCE.getMetrics_Dtype();

		/**
		 * The meta object literal for the '{@link mlam.impl.GeneratedArtifactImpl <em>Generated Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.impl.GeneratedArtifactImpl
		 * @see mlam.impl.MlamPackageImpl#getGeneratedArtifact()
		 * @generated
		 */
		EClass GENERATED_ARTIFACT = eINSTANCE.getGeneratedArtifact();

		/**
		 * The meta object literal for the '<em><b>Dtype</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATED_ARTIFACT__DTYPE = eINSTANCE.getGeneratedArtifact_Dtype();

		/**
		 * The meta object literal for the '{@link mlam.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlam.DataType
		 * @see mlam.impl.MlamPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

	}

} //MlamPackage
