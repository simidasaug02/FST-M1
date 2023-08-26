package JOBBOARD;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity6 {
    WebDriver driver;
    // WebDriverWait wait;

    @BeforeClass
    public void Beforeclass() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://alchemy.hguy.co/jobs");
    }

    @Test
    public void SearchandClickJob() throws InterruptedException {
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/nav[1]/div[1]/ul[1]/li[1]/a[1]")).click();
        driver.findElement(By.xpath("//input[@id='search_keywords']")).sendKeys("Banking");
        Thread.sleep(1200);
        driver.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/form[1]/div[1]/div[4]/input[1]")).click();
        WebElement dropdown= driver.findElement(By.xpath("//h3[contains(text(),'BankingTestJob')]"));
        if
        (dropdown.isDisplayed())
        {
            dropdown.click();
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[3]/input[1]")).click();
        Thread.sleep(1000);
        String email = driver.findElement(By.xpath("//a[contains(text(),'abhiram@cklabs.com')]")).getText();
        System.out.println("The Email Id Is " +email);

        driver.quit();
    }
}
