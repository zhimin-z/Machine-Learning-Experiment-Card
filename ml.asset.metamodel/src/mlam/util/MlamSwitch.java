/**
 */
package mlam.util;

import mlam.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mlam.MlamPackage
 * @generated
 */
public class MlamSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MlamPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MlamSwitch() {
		if (modelPackage == null) {
			modelPackage = MlamPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MlamPackage.PROJECT: {
				Project project = (Project)theEObject;
				T result = caseProject(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.EXPERIMENT: {
				Experiment experiment = (Experiment)theEObject;
				T result = caseExperiment(experiment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.RUN: {
				Run run = (Run)theEObject;
				T result = caseRun(run);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.ASSET: {
				Asset asset = (Asset)theEObject;
				T result = caseAsset(asset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.CODE: {
				Code code = (Code)theEObject;
				T result = caseCode(code);
				if (result == null) result = caseAsset(code);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.PRODUCTION_CODE: {
				ProductionCode productionCode = (ProductionCode)theEObject;
				T result = caseProductionCode(productionCode);
				if (result == null) result = caseCode(productionCode);
				if (result == null) result = caseAsset(productionCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.CONFIGURATION_FILE: {
				ConfigurationFile configurationFile = (ConfigurationFile)theEObject;
				T result = caseConfigurationFile(configurationFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.SOURCE_FILE: {
				SourceFile sourceFile = (SourceFile)theEObject;
				T result = caseSourceFile(sourceFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				T result = caseDependency(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = caseAsset(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.HYPERPARAMETER: {
				Hyperparameter hyperparameter = (Hyperparameter)theEObject;
				T result = caseHyperparameter(hyperparameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.NEURAL_ARCHITECTURE: {
				NeuralArchitecture neuralArchitecture = (NeuralArchitecture)theEObject;
				T result = caseNeuralArchitecture(neuralArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = caseAsset(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.DATASET: {
				Dataset dataset = (Dataset)theEObject;
				T result = caseDataset(dataset);
				if (result == null) result = caseData(dataset);
				if (result == null) result = caseAsset(dataset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.TRAIN_DATA: {
				TrainData trainData = (TrainData)theEObject;
				T result = caseTrainData(trainData);
				if (result == null) result = caseDataset(trainData);
				if (result == null) result = caseData(trainData);
				if (result == null) result = caseAsset(trainData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.TEST_DATA: {
				TestData testData = (TestData)theEObject;
				T result = caseTestData(testData);
				if (result == null) result = caseDataset(testData);
				if (result == null) result = caseData(testData);
				if (result == null) result = caseAsset(testData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.EVAL_DATA: {
				EvalData evalData = (EvalData)theEObject;
				T result = caseEvalData(evalData);
				if (result == null) result = caseTrainData(evalData);
				if (result == null) result = caseDataset(evalData);
				if (result == null) result = caseData(evalData);
				if (result == null) result = caseAsset(evalData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.DOCUMENTATION: {
				Documentation documentation = (Documentation)theEObject;
				T result = caseDocumentation(documentation);
				if (result == null) result = caseData(documentation);
				if (result == null) result = caseAsset(documentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.SPECIFICATION: {
				Specification specification = (Specification)theEObject;
				T result = caseSpecification(specification);
				if (result == null) result = caseDocumentation(specification);
				if (result == null) result = caseData(specification);
				if (result == null) result = caseAsset(specification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.LOG: {
				Log log = (Log)theEObject;
				T result = caseLog(log);
				if (result == null) result = caseDocumentation(log);
				if (result == null) result = caseData(log);
				if (result == null) result = caseAsset(log);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.RANDOM_SEED: {
				RandomSeed randomSeed = (RandomSeed)theEObject;
				T result = caseRandomSeed(randomSeed);
				if (result == null) result = caseData(randomSeed);
				if (result == null) result = caseAsset(randomSeed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.EXECUTION_DATA: {
				ExecutionData executionData = (ExecutionData)theEObject;
				T result = caseExecutionData(executionData);
				if (result == null) result = caseData(executionData);
				if (result == null) result = caseAsset(executionData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseExecutionData(feature);
				if (result == null) result = caseData(feature);
				if (result == null) result = caseAsset(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.EXPLAINABLE: {
				Explainable explainable = (Explainable)theEObject;
				T result = caseExplainable(explainable);
				if (result == null) result = caseExecutionData(explainable);
				if (result == null) result = caseData(explainable);
				if (result == null) result = caseAsset(explainable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.METRICS: {
				Metrics metrics = (Metrics)theEObject;
				T result = caseMetrics(metrics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MlamPackage.GENERATED_ARTIFACT: {
				GeneratedArtifact generatedArtifact = (GeneratedArtifact)theEObject;
				T result = caseGeneratedArtifact(generatedArtifact);
				if (result == null) result = caseData(generatedArtifact);
				if (result == null) result = caseAsset(generatedArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experiment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperiment(Experiment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Run</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRun(Run object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsset(Asset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Production Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Production Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductionCode(ProductionCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationFile(ConfigurationFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceFile(SourceFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hyperparameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hyperparameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHyperparameter(Hyperparameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neural Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neural Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeuralArchitecture(NeuralArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataset(Dataset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Train Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Train Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainData(TrainData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestData(TestData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eval Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eval Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvalData(EvalData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentation(Documentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecification(Specification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLog(Log object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Random Seed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Random Seed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandomSeed(RandomSeed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionData(ExecutionData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explainable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explainable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplainable(Explainable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metrics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metrics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetrics(Metrics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generated Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generated Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratedArtifact(GeneratedArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MlamSwitch
