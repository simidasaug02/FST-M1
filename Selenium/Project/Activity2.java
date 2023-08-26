package JOBBOARD;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeClass
    public void Beforeclass() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");

   }
    @Test
    public void HeadLine() throws InterruptedException {
       Thread.sleep(1200);
       String headline= driver.findElement(By.className("entry-title")).getText();
        System.out.println("The Title Is " + headline);
        Assert.assertEquals("Welcome to Alchemy Jobs",headline);
        String head="Welcome to Alchemy Jobs";
        if (headline == head){
        driver.close(); }

    }
}
