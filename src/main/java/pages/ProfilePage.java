package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
    public WebDriver driver;

    public ProfilePage(WebDriver driver){
        this.driver = driver;
    }

    By logout = By.xpath("//*[@id=\'secondary\']/div/div/div[2]/button");
    
    public void verifyLogoutButtonIsDisplayed(){
        driver.findElement(logout).isDisplayed();
        System.out.println("Logout button is displayed");
    }

    public void clickLogoutButton(){
        driver.findElement(logout).click();
        System.out.println("Logged out successfully");
    }

}
