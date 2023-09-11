package Appium_Project;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Open_Google_chrome {

    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeclass() throws MalformedURLException, InterruptedException {
        UiAutomator2Options option = new UiAutomator2Options();
        option.setPlatformName("Android");
        option.setAutomationName("UiAutomator2");
        option.setAppPackage("com.android.chrome");
        option.setAppActivity("com.google.android.apps.chrome.Main");
        option.noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, option);
        driver.get("http://v1.training-support.net/selenium");
        wait = new WebDriverWait(driver, Duration.ofSeconds(1200));

        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        // Wait for the page to load
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.view.View")));
        // Just scroll
        driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".flingForward()"));
        // Locate element
        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[2]/android.view.View[3]/android.view.View[15]/android.view.View")).click();
        Thread.sleep(1200);
    }


        @Test (priority = 1)
        public void AddTask() throws InterruptedException {
            driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.EditText")).sendKeys("Task1");
            driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.Button")).click();
            Thread.sleep(1000);
            driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.EditText")).sendKeys("Task2");
            driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.Button")).click();
            Thread.sleep(1000);
            driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.EditText")).sendKeys("Task3");
            driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.Button")).click();
            Thread.sleep(1000);


        }

    @Test(priority = 2)
    public void GetCount(){
        //List<WebElement> listOfElements= driver.findElements(AppiumBy.id("tasksList"));

        int countoftask = driver.findElements(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View")).size();
       // List<WebElement> ele = driver.findElements(AppiumBy.id("tasksList"));
         System.out.println("The Count Of the Added Task Is " + countoftask);

    }

    @Test(priority = 3)
    public void ClearList() throws InterruptedException {
        Thread.sleep(1200);
        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[2]")).click();


    }

}








