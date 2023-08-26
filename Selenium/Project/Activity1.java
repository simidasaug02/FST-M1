package JOBBOARD;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {

    WebDriver driver;
    @BeforeClass
    public void Beforeclass() {
    System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
    WebDriverManager.firefoxdriver().setup();
    driver = new FirefoxDriver();
    driver.get("https://alchemy.hguy.co/jobs");

}
    @Test
    public void getTitle()
{
    String title= driver.getTitle();
    System.out.println("The Title Is " + title);
    Assert.assertEquals("Alchemy Jobs – Job Board Application",title);
    String til="Alchemy Jobs";
    if (til == title)
    {
    driver.close(); }

}

}
