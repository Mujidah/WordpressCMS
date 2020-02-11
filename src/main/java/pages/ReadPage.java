package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadPage {
    public WebDriver driver;

    public ReadPage(WebDriver driver){
        this.driver = driver;
    }

    By profileImage = By.xpath("//*[@id=\'header\']/a[3]/span/img");
    By newPost = By.xpath("//*[@id=\'header\']/div[1]/a/span");
    By site = By.xpath("//*[@id=\'header\']/a[1]/span");


    public void verifyProfileImageIsPresent(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(profileImage));
        driver.findElement(profileImage).isDisplayed();
        System.out.println("Avatar is present");
    }
    
    public void verifynewPostIsPresent(){
        driver.findElement(newPost).isDisplayed();
        System.out.println("Write Post button is present");
    }
    
    public void clickNewPost(){
        driver.findElement(newPost).click();
        System.out.println("Write Post button is clicked");
    }
    
    public void clickProfileImage(){
        driver.findElement(profileImage).click();
        System.out.println("Profile is clicked");
    }
    
    public void clickMySite(){
        driver.findElement(site).click();
        System.out.println("My site is clicked");
    }

}