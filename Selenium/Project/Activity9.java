package JOBBOARD;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity9 {
    WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @BeforeClass
    public void Beforeclass() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");

    }

    @Test
    public void ALogIn() throws InterruptedException {
        driver.findElement(By.id("user_login")).clear();
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).clear();
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
        Thread.sleep(1500);
   }

    @Test
    public void BDashboard() throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(By.xpath("//div[contains(text(),'Job Listings')]")).click();
       // System.out.println(list);
       // list.click();
        driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[4]/a[1]")).click();
        Thread.sleep(1500);

        String title=driver.findElement(By.xpath("//h1[contains(text(),'Welcome to the Block Editor')]")).getText();
        System.out.println(title);
        driver.findElement(By.xpath("//button[@aria-label='Close dialog'][1]")).click();

        Thread.sleep(1500);
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebElement JobData=driver.findElement(By.id("job_listing_data"));
        if (JobData.isDisplayed()) {
            driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/h2[1]")).click();
            boolean x = driver.findElement(By.xpath("//button[@aria-expanded='true']")).isDisplayed();
            System.out.println(x);
            driver.findElement(By.xpath("//h2[@class='hndle ui-sortable-handle']")).click();
            driver.findElement(By.xpath("//textarea[@id='post-title-0']")).sendKeys("Test Lead");
           // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            driver.findElement(By.xpath("//input[@id='_job_location']")).sendKeys("India");
            WebElement Company = driver.findElement(By.xpath("//input[@id='_company_name']"));
            Company.sendKeys("Generator");
            driver.findElement(By.xpath("//input[@id='_company_website']")).sendKeys("www.abc.com");
            driver.findElement(By.xpath( "//input[@id='_company_tagline']")).sendKeys("Believe In Yourself");
            driver.findElement(By.xpath( "//input[@id='_company_twitter']")).sendKeys("twit@ABC");
            driver.findElement(By.xpath("//button[contains(text(),'Upload')]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//body/div[@id='__wp-uploader-id-2']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ul[1]/li[5]/div[1]/div[1]')]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[contains(text(),'Use file')]")).click();
            driver.findElement(By.xpath("//input[@id='_filled']")).click();
            driver.findElement(By.xpath("//input[@id='_featured']")).click();
            driver.findElement(By.xpath("//button[contains(text(),'Publish…')]")).click();
            driver.findElement(By.xpath("//*[@id='editor']/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div/button[1]")).click();
            String Published = driver.findElement(By.xpath("//div[contains(text(),'Published')]")).getText();
            WebElement click_link = driver.findElement(By.xpath("//a[contains(text(),'View Job')]"));
            System.out.println("The Job in " + Published + "successfully Thank You . "+ "Click here"+ click_link.getAttribute("href"));
            click_link.click();
            Thread.sleep(20);
        }


    }

}
