package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4
{
    public static void main(String[] args) throws InterruptedException {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        String title = driver.getTitle();
        System.out.println("Home Page Title is " + title);

        String third_header= driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println("The third header text is " + third_header);

        String fifth_header= driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color");
        System.out.println("The third header text is " + fifth_header);

        String violet_button= driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class");
        System.out.println("The third header text is " + violet_button);

        String grey_button= driver.findElement(By.xpath("//button[contains(text(),'Grey')]")).getText();
        System.out.println("The third header text is " + grey_button);


        driver.quit();
    }


}
