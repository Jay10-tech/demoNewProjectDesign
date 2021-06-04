package ebay.pageObject;

import newDesignPageObject.forms.FormWizardPO;
import org.openqa.selenium.By;

public class EbayPO extends FormWizardPO {

  public void navigationToEbayPage(){
    navigateTo("https://www.ebay.com/");

  }

  public void pressOnDeals(){
    getClickableElement(By.className("gh-t gh-divider-l")).click();
  }


  public void printALlDealsForCellPhones(){}

}
