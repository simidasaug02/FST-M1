package Appium_Project;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Google_Keep {
    // Driver Declaration
    AndroidDriver driver;
    WebDriverWait wait;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity(".activities.BrowseActivity");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, options);
        //wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
        @Test
        public void GoogleKeep() {

        driver.findElement(AppiumBy.id("com.google.android.keep:id/new_note_button")).click();
        driver.findElement(AppiumBy.id("com.google.android.keep:id/editable_title")).sendKeys("This is my First Task");
        driver.findElement(AppiumBy.id("com.google.android.keep:id/edit_note_text")).sendKeys("This is Task 1");
        driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
        String text= driver.findElement(AppiumBy.id("index_note_title")).getText();
        Assert.assertEquals(text,"This is my First Task");
        System.out.println("Task Added");

        }

    }
