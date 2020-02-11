package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SitePage {
    public WebDriver driver;

    public SitePage(WebDriver driver){
        this.driver = driver;
    }

    By siteMenu = By.xpath("//*[@id=\'secondary\']/div/div[2]/div[1]/div[2]/ul[2]/h2/span");
    By pages = By.linkText("Pages");
    By newPage = By.xpath("//*[@id=\'pages\']/div[1]/div[2]/a");
    By layout = By.xpath("//button[@value='about-2']");
    By useLayout = By.xpath("/html/body/div[7]/div/div/div/div/div/div/div/div[3]/button");
    
    public void clickPages(){
    	driver.findElement(siteMenu).click();
        driver.findElement(pages).click();
        System.out.println("Pages is clicked");
    }
    
    public void addNewPage(){
        driver.findElement(newPage).click();
        System.out.println("Add new page is clicked");
    }
    
    public void clickAboutLayout(){
        /*WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(layout));
        driver.findElement(layout).isDisplayed();*/
    	driver.switchTo().frame(2);
        driver.findElement(layout).click();
        System.out.println("Layout displayed and clicked");
    }
    
    public void useLayoutSelected(){
        driver.findElement(useLayout).click();
        System.out.println("Use Layout is clicked");
    }
}