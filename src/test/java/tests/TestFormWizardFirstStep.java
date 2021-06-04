package tests;

import newDesignPageObject.forms.WizardFirstStep;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestFormWizardFirstStep extends CommonTest {

  @Test
  public void testFirstForm() {
//        firstStep.getHeader();
    Assert.assertEquals(firstStep.getDescriptionForTheFirstStep(),
        WizardFirstStep.headerOfTheFirstStep);
  }

  @DataProvider(name = "test1")
  public Object[][] createData1() {
    return new Object[][]{
        {"new Integer(36)"},
        {"new Integer(37)"},
    };
  }


  @Test
  public void testFillOutFirstName() {
    firstStep.fillInFirstName("This is First name");
  }

}
