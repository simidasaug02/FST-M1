import time

from selenium import webdriver
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support.expected_conditions import invisibility_of_element
from selenium.webdriver.support import expected_conditions as expected_conditions


service = FirefoxService(GeckoDriverManager().install())

# Start the Driver
with webdriver.Firefox(service=service) as driver:

    # Navigate to the URL
    driver.get("https://v1.training-support.net/selenium/dynamic-controls")

    # title of the page
    print("Page title is: ", driver.title)
    checkbox = driver.find_element(By.ID, "dynamicCheckbox")
    checkbox_toggle = driver.find_element(By.ID, "toggleCheckbox")

    wait = WebDriverWait(driver, 10)
    checkbox_toggle.click()
    print("Checkbox hidden")
    wait.until(expected_conditions.invisibility_of_element(checkbox))
    checkbox_toggle.click()
    print("Checkbox visible")
    checkbox.click()
    print("Checkbox selected")