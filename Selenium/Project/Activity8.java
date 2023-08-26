package JOBBOARD;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity8 {

    WebDriver driver;

    @BeforeClass
    public void Beforeclass() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");

    }

   @Test
    public void LogIn() {
       driver.findElement(By.id("user_login")).sendKeys("root");
       driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
       driver.findElement(By.xpath("//input[@id='wp-submit']")).click();

       WebElement dashboard=driver.findElement(By.xpath("//div[contains(text(),'Dashboard')]"));
       if (dashboard.isDisplayed())
       {
           System.out.println("You are in Logged in Page ");
       }
       driver.close();

   }
}
