package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreatePostPage {
    public WebDriver driver;

    public CreatePostPage(WebDriver driver){
        this.driver = driver;
    }

    By title = By.xpath("//*[@id=\'post-title-0\']");
    By body = By.className("rich-text block-editor-rich-text__editable wp-block-paragraph");
    By preview = By.xpath("//*[@id=\'editor\']/div/div/div[1]/div/div[1]/div/div[1]/a");   
    By publish = By.xpath("//*[@id=\'editor\']/div/div/div[1]/div/div[1]/div/div[1]/button[2]");
    By visitSite = By.linkText("Visit site");
    By draft = By.xpath("//*[@id=\'editor\']/div/div/div[1]/div/div[1]/div/div[1]/button[1]");
    By draftSaved = By.xpath("//*[@id=\'editor\']/div/div/div[1]/div/div[1]/div/div[1]/span");
    By dialog = By.xpath("/html/body/div[7]/div/div/div/div/div/div/div/div[1]/button/svg/path");

    public void waitUntilAlertIsPresent(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        System.out.println("Alert is clicked on");
    }
    
    public void verifyTitleIsPresent(){
    	driver.switchTo().activeElement();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(dialog));
        driver.findElement(dialog).isDisplayed();
        driver.findElement(dialog).click();
        driver.switchTo().defaultContent(); 
        driver.findElement(title).isDisplayed();
        System.out.println("Title box is present");
    }
    
    public void enterTitle(String text){
    	driver.findElement(title).sendKeys(text);
        System.out.println("Title is entered");
    }
    
    public void enterBody(String text){
    	driver.findElement(body).sendKeys(text);
        System.out.println("Body is entered");
    }
    
    public void saveDraft(){
    	driver.findElement(draft).click();
        System.out.println("Save draft button is clicked");
    }
    
    public void verifyDraftIsSaved(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(draftSaved));
        driver.findElement(draftSaved).isDisplayed();
        System.out.println("Draft saved successfully");
    }
    
    public void previewPost(){
    	driver.findElement(preview).click();
        System.out.println("Preview link is clicked");
    }
    
    public void verifyPreviewPageisDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(visitSite));
        driver.findElement(visitSite).isDisplayed();
        System.out.println("Visit site button is present");
    }
    
    public void publishPost(){
    	driver.findElement(publish).click();
        System.out.println("Publish button is clicked");
    }
    
    public void verifyPostisPublished(){
    	WebDriverWait wait = new WebDriverWait(driver, 60);
    	wait.until(ExpectedConditions.alertIsPresent());
    	System.out.println("Post published successfully");
    }
    
}