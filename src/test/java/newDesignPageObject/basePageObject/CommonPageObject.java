package newDesignPageObject.basePageObject;


import org.openqa.selenium.WebDriver;
import utils.WDManager;

public class CommonPageObject extends WDManager {
    String URL = "http://authenticgoods.co/wrapbootstrap/themes/neuboard-v1.4.3/Angular_full_version/index.html#";

    public void navigateTo(){
        driver.navigate().to(URL);

    }
    public void navigateTo(String url){
        driver.navigate().to(url);

    }
}
