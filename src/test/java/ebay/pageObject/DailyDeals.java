package ebay.pageObject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import newDesignPageObject.basePageObject.CommonPageObject;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.collections.Maps;

public class DailyDeals extends CommonPageObject {

  public void navigateToDeals(){
    navigateTo("https://www.ebay.com/deals");
  }

  public List<WebElement> getAllDailyDeals(){
    return getClickableElements(By.cssSelector("[itemprop=\"name\"]"));
  }

  public List<WebElement> getAllDealsPrices(){
    return getClickableElements(By.cssSelector("[itemprop=\"price\"]"));
  }

  public void printAllTheDeals(){
    JSONObject jsonObject = new JSONObject();
    Map map = new LinkedHashMap();

    for(int i = 0; i< getAllDealsPrices().size(); i++){
//      System.out.println(getAllDailyDeals().get(i).getText());
//      System.out.println(getAllDealsPrices().get(i).getText());


      map.put(getAllDailyDeals().get(i).getText(),getAllDealsPrices().get(i).getText());

     jsonObject.put("dailyDeals", map);
    }
    PrintWriter printWriter = null;
    try {
      printWriter = new PrintWriter("ebay.json");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    printWriter.write(jsonObject.toJSONString());

    printWriter.flush();
    printWriter.close();
  }



}
