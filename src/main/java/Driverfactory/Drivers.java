package Driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Drivers {
    public WebDriver driver;
    public static  ThreadLocal<WebDriver> tldriver=new ThreadLocal<>();

    public WebDriver Brower() {
        System.setProperty("webdriver.chrome.driver", "C:\\AmazonCode\\master\\Drivers\\chromedriver.exe");
        tldriver.set(new ChromeDriver());

        return getDriver();
    }
    public static synchronized WebDriver getDriver(){

        return tldriver.get();
    }

}
