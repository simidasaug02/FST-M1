package JOBBOARD;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
    WebDriver driver;

    @BeforeClass
    public void Beforeclass() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
    }

    @Test
    public void CreateJob() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Post a Job')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
        driver.findElement(By.xpath("//input[@id='job_title']")).sendKeys("Banking");
        driver.findElement(By.xpath("//input[@id='job_location']")).sendKeys("India");
        driver.findElement(By.xpath("//iframe[@id='job_description_ifr']")).sendKeys("Description");
        driver.findElement(By.xpath("//input[@id='company_name']")).clear();
        driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("ABC");
        driver.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/form[1]/p[1]/input[4]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@id='job_preview_submit_button']")).click();
        //Verify that the job listing was posted by visiting the jobs pag
        driver.close();



    }
}
