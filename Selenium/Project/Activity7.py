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
    driver.find_element(By.XPATH,"//a[contains(text(),'Post a Job')]").click()
    driver.find_element(By.XPATH,"//a[contains(text(),'Sign in')]").click()
    driver.find_element(By.ID,"user_login").clear()
    driver.find_element(By.ID,"user_login").send_keys("root")
    driver.find_element(By.ID,"user_pass").clear()
    driver.find_element(By.ID,"user_pass").send_keys("pa$$w0rd")
    driver.find_element(By.XPATH,"//input[@id='wp-submit']").click()
    driver.find_element(By.XPATH,"//input[@id='job_title']").send_keys("Banking")
    driver.find_element(By.XPATH,"//input[@id='job_location']").send_keys("India")
    driver.find_element(By.XPATH,"//iframe[@id='job_description_ifr']").send_keys("Description")
    driver.find_element(By.XPATH,"//input[@id='company_name']").clear()
    driver.find_element(By.XPATH,"//input[@id='company_name']").send_keys("ABC")
    driver.find_element(By.XPATH,"//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/form[1]/p[1]/input[4]").click()
    driver.find_element(By.XPATH,"//input[@id='job_preview_submit_button']").click()
    print("Job Submitted Successfully")

    driver.close()
