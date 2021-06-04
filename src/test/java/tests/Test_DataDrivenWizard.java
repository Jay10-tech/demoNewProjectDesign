package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import workFlowPreSet.wizard.FillOutWizard;

public class Test_DataDrivenWizard extends CommonTest {

  FillOutWizard fillOutWizard = new FillOutWizard();


  @DataProvider(name = "testDataForWizard")
  public Object[][] createData1() {
    return new Object[][]{
        {"first name", "last name", "address", "city", "state", "zip"},
        {"first1 name1", "last1 name1", "address1", "city1", "state1", "zip1"},
    };
  }

  @Test(dataProvider = "testDataForWizard")
  public void checkWizardForm(String firstName,
      String lastName,
      String address,
      String city,
      String state,
      String zip) {
    fillOutWizard.fillOutAllTheSteps(firstName, lastName, address, city, state, zip, false);
//    Assert.assertEquals(WizardLastStep.getFirstName(), firstName);
//    Assert.assertEquals(WizardLastStep.getLastName(), lastName);

  }
}
