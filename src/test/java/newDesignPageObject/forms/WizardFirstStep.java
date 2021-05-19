package newDesignPageObject.forms;

import org.openqa.selenium.By;

public class WizardFirstStep extends FormWizardPO{

    public static String headerOfTheFirstStep = "Enter first step data";


    public void navigateToWizard(){
        navigateTo(FormWizardPO.URL);

    }
    public String getDescriptionForTheFirstStep(){
        return getTextFromElement(By.tagName("h2"));
    }

    public void fillInFirstName(){}

    public void fillInLastName(){}
}
