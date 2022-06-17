package Stepdefinition;

import Driverfactory.Drivers;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Apphooks {
    public WebDriver driver;
    @Before(order = 0)
    public void getdriver(){
        Drivers obj=new Drivers();
        driver=obj.Brower();
    }

}
