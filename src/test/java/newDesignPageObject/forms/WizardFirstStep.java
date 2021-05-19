package newDesignPageObject.forms;

import org.openqa.selenium.By;

public class WizardFirstStep extends FormWizardPO{

    public static String headerOfTheFirstStep = "Enter first step data";


    public void navigateToWizard(){
        navigateTo(FormWizardPO.URL);

    }
    public String getDescriptionForTheFirstStep(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.findElement(By.tagName("h2")).getText();
    }

    public void fillInFirstName(){}

    public void fillInLastName(){}
}
