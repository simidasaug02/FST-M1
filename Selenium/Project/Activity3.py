# Import webdriver from selenium
import string

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
    time.sleep(8)
    image_prop = driver.find_element(By.XPATH, "//header/div[1]/img[1]")
    image_link= image_prop.get_attribute("src")
    print("The image link is " ,image_link)
    driver.close()
