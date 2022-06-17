package Pageojectmodel;

import org.openqa.selenium.WebDriver;

public class Homepage {

    public WebDriver driver;

    public Homepage(WebDriver driver){
        this.driver=driver;

    }
    public void launchurl(String url){
        driver.get(url);

    }
}
