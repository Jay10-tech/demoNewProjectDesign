package newDesignPageObject.forms;

import org.openqa.selenium.By;

public class WizardFirstStep extends FormWizardPO{
    public static String baseURL = "http://authenticgoods.co/wrapbootstrap/themes/neuboard-v1.4.3/Angular_full_version/index.html#/forms/wizard/step_one";

    public static String headerOfTheFirstStep = "Enter first step data";


    public void navigateToWizard(){
        navigateTo(baseURL);

    }
    public String getDescriptionForTheFirstStep(){
        return getTextFromElement(By.tagName("h2"));
    }

    public void fillInFirstName(){}

    public void fillInLastName(){}
}
