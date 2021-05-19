package tests;

import newDesignPageObject.forms.WizardFirstStep;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFormWizardFirstStep extends CommonTest{

    @Test
    public void testFirstForm(){
//        firstStep.getHeader();
        Assert.assertEquals(firstStep.getDescriptionForTheFirstStep(), WizardFirstStep.headerOfTheFirstStep);
    }

}
