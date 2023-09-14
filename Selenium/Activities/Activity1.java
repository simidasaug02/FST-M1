package Activity;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.io.InterruptedIOException;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net");
        String element = driver.getTitle();
        System.out.println("Home Page Title is " + element);
        driver.findElement(By.id("about-link")).click();
        String aboutpage=driver.getTitle();
        System.out.println("About page tile is " + aboutpage);
        Thread.sleep(2000);
        driver.quit();
    }
}
