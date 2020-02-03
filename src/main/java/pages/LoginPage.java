package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    By username = By.xpath("//*[@id=\'usernameOrEmail\']");
    By password = By.xpath("//*[@id=\'password\']");
    By continueButton = By.xpath("//*[@id=\'primary\']/div/main/div/div[1]/div/form/div[1]/div[2]/button");
    By loginButton = By.xpath("//*[@id=\'primary\']/div/main/div/div[1]/div/form/div[1]/div[2]/button");
    By invalidUsernameErrorMsg = By.xpath("//*[@id=\'primary\']/div/main/div/div[1]/div/form/div[1]/div[1]/div[1]/span");
    By invalidPasswordErrorMsg = By.xpath("//*[@id=\'primary\']/div/main/div/div[1]/div/form/div[1]/div[1]/div/div[2]/span");

    public void enterUsername(String text){
        driver.findElement(username).sendKeys(text);
    }
    
    public void verifyContinueButtonIsPresent(){
        driver.findElement(continueButton).isDisplayed();
    }

    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }
    
   /* public void verifyPasswordBoxIsPresent(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(password));
        driver.findElement(password).isDisplayed();
        System.out.println("Password field is present");
    } */

    public void enterPassword(String text){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(password));
        driver.findElement(password).isDisplayed();
        driver.findElement(password).sendKeys(text);
        System.out.println("Password entered successfully");
    }

    public void verifyLoginButtonIsPresent(){
        driver.findElement(loginButton).isDisplayed();
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public void verifyInvalidUsernameErrorMsgIsDisplayed(){
        driver.findElement(invalidUsernameErrorMsg).isDisplayed();
        System.out.println("Invalid Username error message is displayed");
    }
    
    public void verifyInvalidPasswordErrorMsgIsDisplayed(){
        driver.findElement(invalidPasswordErrorMsg).isDisplayed();
        System.out.println("Invalid Password error message is displayed");
    }

}
