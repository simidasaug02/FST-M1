# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())
# Start the Driver
with webdriver.Firefox(service = service) as driver:
  # Open the browser to the URL
    driver.get("https://v1.training-support.net")
    print("Home Page Title is " ,driver.title)
    driver.find_element(By.ID , "about-link").click()
    print("About page tile is " ,driver.title)
driver.quit();


