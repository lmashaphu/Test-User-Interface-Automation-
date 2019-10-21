
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lethabo
 */
public class TestingUserInterface {
    
public static void main(String [] args) throws InterruptedException {
        
    WebDriver driver = new ChromeDriver(); // creating instance of the class which is Chrome
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebDriverWait wait = new WebDriverWait(driver, 15);
   
    
        
        
        
    driver.manage().window().maximize(); // Maximazing the the driver
    driver.get(" https://www.euromonitor.com"); // Navigating to the url of Euromonitor
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".emi-global-menu-container.emi-global-menu-sticky  ul#top  .xemi-header__logo")));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li#store > a"))); // Verify that store text is present
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li#solutions > a"))); //Verify that Solutions text is available
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li#research-expertise > a")));  //Verify that Capabilities text is present
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".emi-global-menu  a[target='_blank']"))); // Verify that Blog text is present
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".emi-global-menu > li:nth-of-type(5) > a"))); // Verify that Careers text is present
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li#about-us > a"))); // Verify that About us text is present
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".e-fullwidth-cell div .emi-heading-h1.emi-text-align-centre:nth-of-type(2)"))); // Verify that Making sense of global markets text is present
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".e-fullwidth-cell div .emi-text-align-centre:nth-child(3)"))); // Verify that Our market research solutions connect your organisations goals with global opportunities text is present
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".e-fullwidth-cell .emi-button-rounded"))); // Verify that LEARN MORE BUTTON is present
    driver.findElement(By.cssSelector(".e-fullwidth-cell .emi-button-rounded")).click();// Clicking the Learn More Button
    driver.quit();// quiting google driver
    }
}
