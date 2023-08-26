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
    driver.get("https://alchemy.hguy.co/jobs")
    print("Page Title is ", driver.title)
    time.sleep(8)

    head = driver.find_element(By.CLASS_NAME ,"entry-title")
    headline =head.text
    print("The Title Is " , headline)
    head ="Welcome to Alchemy Jobs"
    if headline==head:
      driver.close()




