package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    By login = By.xpath("//*[@id=\'lpc-header-nav\']/div/div/div[1]/header/nav/ul[2]/li[1]/a");
    By getStarted = By.xpath("//*[@id=\'lpc-header-nav\']/div/div/div[1]/header/nav/ul[2]/li[2]/a");


    public void verifyLoginLinkIsPresent(){
        driver.findElement(login).isDisplayed();
    }

    public void clickLogin(){
        driver.findElement(login).click();
    }
    
    public void verifyGetStartedLinkIsPresent(){
        driver.findElement(getStarted).isDisplayed();
    }

    public void clickGetStarted(){
        driver.findElement(getStarted).click();
    }

}
