/**
 */
package mlam.impl;

import mlam.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MlamFactoryImpl extends EFactoryImpl implements MlamFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MlamFactory init() {
		try {
			MlamFactory theMlamFactory = (MlamFactory)EPackage.Registry.INSTANCE.getEFactory(MlamPackage.eNS_URI);
			if (theMlamFactory != null) {
				return theMlamFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MlamFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MlamFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MlamPackage.PROJECT: return createProject();
			case MlamPackage.EXPERIMENT: return createExperiment();
			case MlamPackage.RUN: return createRun();
			case MlamPackage.PRODUCTION_CODE: return createProductionCode();
			case MlamPackage.CONFIGURATION_FILE: return createConfigurationFile();
			case MlamPackage.SOURCE_FILE: return createSourceFile();
			case MlamPackage.DEPENDENCY: return createDependency();
			case MlamPackage.MODEL: return createModel();
			case MlamPackage.PARAMETER: return createParameter();
			case MlamPackage.HYPERPARAMETER: return createHyperparameter();
			case MlamPackage.NEURAL_ARCHITECTURE: return createNeuralArchitecture();
			case MlamPackage.DATASET: return createDataset();
			case MlamPackage.TRAIN_DATA: return createTrainData();
			case MlamPackage.TEST_DATA: return createTestData();
			case MlamPackage.EVAL_DATA: return createEvalData();
			case MlamPackage.SPECIFICATION: return createSpecification();
			case MlamPackage.LOG: return createLog();
			case MlamPackage.RANDOM_SEED: return createRandomSeed();
			case MlamPackage.EXECUTION_DATA: return createExecutionData();
			case MlamPackage.FEATURE: return createFeature();
			case MlamPackage.EXPLAINABLE: return createExplainable();
			case MlamPackage.METRICS: return createMetrics();
			case MlamPackage.GENERATED_ARTIFACT: return createGeneratedArtifact();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MlamPackage.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MlamPackage.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Experiment createExperiment() {
		ExperimentImpl experiment = new ExperimentImpl();
		return experiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Run createRun() {
		RunImpl run = new RunImpl();
		return run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionCode createProductionCode() {
		ProductionCodeImpl productionCode = new ProductionCodeImpl();
		return productionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFile createConfigurationFile() {
		ConfigurationFileImpl configurationFile = new ConfigurationFileImpl();
		return configurationFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFile createSourceFile() {
		SourceFileImpl sourceFile = new SourceFileImpl();
		return sourceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hyperparameter createHyperparameter() {
		HyperparameterImpl hyperparameter = new HyperparameterImpl();
		return hyperparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeuralArchitecture createNeuralArchitecture() {
		NeuralArchitectureImpl neuralArchitecture = new NeuralArchitectureImpl();
		return neuralArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dataset createDataset() {
		DatasetImpl dataset = new DatasetImpl();
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainData createTrainData() {
		TrainDataImpl trainData = new TrainDataImpl();
		return trainData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestData createTestData() {
		TestDataImpl testData = new TestDataImpl();
		return testData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvalData createEvalData() {
		EvalDataImpl evalData = new EvalDataImpl();
		return evalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Log createLog() {
		LogImpl log = new LogImpl();
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RandomSeed createRandomSeed() {
		RandomSeedImpl randomSeed = new RandomSeedImpl();
		return randomSeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionData createExecutionData() {
		ExecutionDataImpl executionData = new ExecutionDataImpl();
		return executionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Explainable createExplainable() {
		ExplainableImpl explainable = new ExplainableImpl();
		return explainable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metrics createMetrics() {
		MetricsImpl metrics = new MetricsImpl();
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedArtifact createGeneratedArtifact() {
		GeneratedArtifactImpl generatedArtifact = new GeneratedArtifactImpl();
		return generatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MlamPackage getMlamPackage() {
		return (MlamPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MlamPackage getPackage() {
		return MlamPackage.eINSTANCE;
	}

} //MlamFactoryImpl
