# Import webdriver from selenium
import pytest
import time

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())
# Start the Driver
with webdriver.Firefox(service=service) as driver:
    # Open the browser to the URL
    driver.get("https://alchemy.hguy.co/jobs/wp-admin")
    print("Page Title is ", driver.title)
    driver.implicitly_wait(10)
    driver.find_element(By.ID,"user_login").send_keys("root")
    driver.find_element(By.ID,"user_pass").send_keys("pa$$w0rd")
    driver.find_element(By.XPATH,"//input[@id='wp-submit']").click()

    dashboard=driver.find_element(By.XPATH,"//div[contains(text(),'Dashboard')]")
    if dashboard.is_displayed():
     print("You are in Logged in Page ")
     driver.close()

