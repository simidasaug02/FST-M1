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
    driver.implicitly_wait(10)
   # time.sleep(8)

    driver.find_element(By.XPATH, "//header/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/nav[1]/div[1]/ul[1]/li[1]/a[1]").click()
    page_title = driver.title
    print("You are in correct page ", page_title)
    driver.find_element(By.XPATH,"//input[@id='search_keywords']").send_keys("Banking")
    Click = driver.find_element(By.XPATH,"//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/form[1]/div[1]/div[4]/input[1]")
    Click.click()
    time.sleep(8)
    driver.find_element(By.XPATH,"//h3[contains(text(),'BankingTestJob')]").click()

    driver.find_element(By.XPATH,"//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[3]/input[1]").click()
    time.sleep(8)
    email = driver.find_element(By.XPATH, "//a[contains(text(),'abhiram@cklabs.com')]").text
    print("The Email Id Is " , email)


    driver.quit()


