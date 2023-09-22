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
    driver.get("https://v1.training-support.net/selenium/login-form")
    print("Home Page Title is " ,driver.title)
    driver.find_element(By.XPATH,"//input[@id ='username']").send_keys("admin")
    driver.find_element(By.XPATH, "//input[@id ='password']").send_keys("password")
    driver.find_element(By.XPATH, "//button[text()='Log in']").click()

    message = driver.find_element(By.XPATH, "//div[@id='action-confirmation']")
    print("The Display Message is " , message.text)
    driver.close()