package newDesignPageObject.basePageObject;


import org.openqa.selenium.WebDriver;
import utils.WDManager;
import utils.WebElementManager;

public class CommonPageObject extends WebElementManager {
    String URL = "http://authenticgoods.co/wrapbootstrap/themes/neuboard-v1.4.3/Angular_full_version/index.html#";

    public void navigateTo(){
        driver.navigate().to(URL);
        waitForPageToBeLoaded();

    }
    public void navigateTo(String url){
        driver.navigate().to(url);
        waitForPageToBeLoaded();

    }
}
