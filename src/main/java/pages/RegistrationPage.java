package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
    public WebDriver driver;

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    By email = By.id("email");
    By username = By.id("username");
    By password = By.id("password");
    By createButton = By.xpath("//*[@id=\'primary\']/div/div[2]/div/div/div/div[1]/div/div[1]/form/div[2]/button");
    By existingEmailError = By.xpath("//*[@id=\'primary\']/div/div[2]/div/div/div/div[1]/div/div[1]/form/div[1]/div[1]/span/span/p");
    By existingUsernameError = By.xpath("//*[@id=\'primary\']/div/div[2]/div/div/div/div[1]/div/div[1]/form/div[1]/div[2]/span/span/p");
    By siteType = By.xpath("//*[@id=\'primary\']/div/div[2]/div/div/div/div[1]/div/button[1]/strong");
    By siteTopic = By.id("siteTopic");
    By continueButton = By.xpath("//*[@type='submit']");
    By siteTitle = By.id("title");
    By domain = By.xpath("//*[@type='search']");
    By filter = By.xpath("//*[@type='button']");
    By siteUrl = By.xpath("//*[@id=\'primary\']/div/div[2]/div/div/div/div/div/div/div/div[2]/div[2]/div[4]/div[1]/button");
    By sitePlan = By.xpath("//*[@type='button']");
    By creationSuccess = By.xpath("//*[@id=\'primary\']/header/h1");

    public void enterEmail(String text){
    	driver.findElement(email).clear();
        driver.findElement(email).sendKeys(text);
        System.out.println("Email is entered");
    }

    public void enterUsername(String text){
    	driver.findElement(username).clear();
        driver.findElement(username).sendKeys(text);
        System.out.println("Username is entered");
    }
    
    public void enterPassword(String text){
        driver.findElement(password).sendKeys(text);
        System.out.println("Password is entered");
    }

    public void verifyCreateButtonIsDisplayed(){
        driver.findElement(createButton).isDisplayed();
        System.out.println("Create button is displayed");
    }
    
    public void clickCreateButton(){
        driver.findElement(createButton).click();
        System.out.println("Create button is clicked. Proceeding to the rest of the registration process...");
    }
    
    public void verifyExistingEmailErrorIsDisplayed(){
        driver.findElement(existingEmailError).isDisplayed();
        System.out.println("Email error is displayed");
    }
    
    public void verifyExistingUsernameErrorIsDisplayed(){
        driver.findElement(existingUsernameError).isDisplayed();
        System.out.println("Username error is displayed");
    }
    
    public void clickSiteType(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(siteType));
        driver.findElement(siteType).isDisplayed();
        driver.findElement(siteType).click();
        System.out.println("Site type is clicked");
    }
    
    public void enterSiteTopic(String text){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(siteTopic));
        driver.findElement(siteTopic).isDisplayed();
        driver.findElement(siteTopic).sendKeys(text);
        System.out.println("Site topic is entered");
    }
    
    public void clickContinueButton(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueButton));
        driver.findElement(continueButton).isDisplayed();
        driver.findElement(continueButton).click();
        System.out.println("Continue button is clicked");
    }

    public void enterSiteTitle(String text){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(siteTitle));
        driver.findElement(siteTitle).isDisplayed();
        driver.findElement(siteTitle).sendKeys(text);
        System.out.println("Site title is entered");
    }
    
    public void enterDomain(String text){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(domain));
        driver.findElement(domain).isDisplayed();
        driver.findElement(domain).sendKeys(text);
        System.out.println("Domain is entered");
    }
    
    public void selectFilter(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(filter));
        driver.findElement(filter).isDisplayed();
        driver.findElement(filter).click();
        System.out.println("Filter is selected");
    }
    
    public void selectDomainOption(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(siteUrl));
        driver.findElement(siteUrl).isDisplayed();
        driver.findElement(siteUrl).click();
        System.out.println("Domain option is selected");
    }
    
    public void selectSitePlan() {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(sitePlan));
        driver.findElement(sitePlan).isDisplayed();
        driver.findElement(sitePlan).click();
        System.out.println("Site plan is selected");
    }

    public void verifySuccessMessageIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(creationSuccess));
        driver.findElement(creationSuccess).isDisplayed();
        System.out.println("Registration successful");
    }

    public void verifySitePlanIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(sitePlan));
        driver.findElement(sitePlan).isDisplayed();
        System.out.println("Registration successful");
    }

}
