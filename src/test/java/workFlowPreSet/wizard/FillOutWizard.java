package workFlowPreSet.wizard;

import newDesignPageObject.forms.WizardFirstStep;
import newDesignPageObject.forms.WizardLastStep;
import newDesignPageObject.forms.WizardSecondStep;

public class FillOutWizard {

  WizardFirstStep firstStepStep = new WizardFirstStep();
  WizardSecondStep secondStep = new WizardSecondStep();
  WizardLastStep lastStep = new WizardLastStep();

  // todo:

  public void fillOutAllTheSteps(String firstName, String lastName,
      String city, String state,
      String address, String zip, boolean shouldSubmit) {
    firstStepStep.fillInFirstName(firstName);
    firstStepStep.fillInLastName(lastName);
    firstStepStep.pressOnNextButton();
    firstStepStep.checkIfSwitchedToTheSecondPage();
    secondStep.fillInCity(city);
    secondStep.fillInState(state);
    secondStep.fillInZip(zip);
    secondStep.fillOutStreetAddress(address);
    secondStep.pressOnNextButton();
    lastStep.getDescriptionForTheLastStep();
    if (shouldSubmit) {
      lastStep.pressOnSubmit();
      lastStep.dealThisAlert();
    }
  }

}
