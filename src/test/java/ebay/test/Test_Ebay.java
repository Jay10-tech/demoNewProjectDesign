package ebay.test;

import ebay.pageObject.EbayPO;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.CommonTest;

public class Test_Ebay extends CommonTest {
  EbayPO ebayPO = new EbayPO();


//  @BeforeMethod
//  public void navigateWebPage(){
//    ebayPO.navigationToEbayPage();
//
//  }

  @Test
  public void clickOnALlDeals(){
//    ebayPO.pressOnDeals();
    dailyDeals.printAllTheDeals();

  }

//  public void getAllCellPhoneDeals(){}

}
