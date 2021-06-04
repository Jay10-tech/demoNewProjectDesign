package newDesignPageObject.forms;

import org.openqa.selenium.By;

public class WizardSecondStep extends FormWizardPO {

  public void getDescriptionForTheSecondStep() {
  }


  public void fillOutStreetAddress(String address) {
    fillOutText(By.xpath("//input[@name='streetAddress']"), address);
  }

  public void fillInCity(String city) {
    fillOutText(By.name("city"), city);
  }

  public void fillInState(String state) {
    fillOutText(By.name("state"), state);
  }

  public void fillInZip(String zip) {
    fillOutText(By.name("postalCode"), zip);
  }

}
