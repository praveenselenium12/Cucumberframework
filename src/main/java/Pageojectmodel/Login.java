package Pageojectmodel;

import org.openqa.selenium.WebDriver;

import java.time.Duration;


public class Login implements locator  {

    public WebDriver driver;
    public  Login(WebDriver driver){
     this.driver=driver;
    }
    public boolean launchBrower(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30) );
        driver.get("http://www.freecrm.com");
        boolean flag=driver.findElement(loginxpath).isDisplayed();
        return  flag;
    }
    public void login() {
        driver.findElement(loginxpath).click();
    }

    public boolean verifyLoginPage(){

        return driver.findElement(emailidxpath).isDisplayed();
    }
    public void emailid(){
        driver.findElement(emailidxpath).sendKeys("praveenkumar.968.k@gmail.com");
    }
    public void password(){
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30) );
        driver.findElement(passwordxpath).sendKeys("Praveen@301");
    }
    public Homepage loginbutton(){
        driver.findElement(loginbutton).click();
        return new Homepage(driver);
    }

}
