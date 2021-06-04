package tests;

import ebay.pageObject.DailyDeals;
import newDesignPageObject.forms.FormWizardPO;
import newDesignPageObject.forms.WizardFirstStep;
import newDesignPageObject.forms.WizardLastStep;
import newDesignPageObject.forms.WizardSecondStep;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class CommonTest {


  /**
   * First instantiate all the Wizard Page Object classes
   */
  WizardFirstStep firstStep = new WizardFirstStep();
  WizardSecondStep secondStep = new WizardSecondStep();
  WizardLastStep lastStep = new WizardLastStep();
  FormWizardPO wizardPO = new FormWizardPO();
  protected DailyDeals dailyDeals = new DailyDeals();

  @BeforeMethod
  public void getToThePage() {
//    firstStep.navigateToWizard();
    new DailyDeals().navigateToDeals();
  }

  @AfterTest
  public void closeTheDriverEverytime() {
    wizardPO.closeDriver();

  }


}
