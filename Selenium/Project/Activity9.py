# Import webdriver from selenium
from idlelib import editor

import pytest
import time

from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common import actions
from selenium.webdriver.common.alert import Alert
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.common.keys import Keys

from selenium.webdriver.common.action_chains import ActionChains

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())
# Start the Driver
with (webdriver.Firefox(service=service) as driver):
    # Open the browser to the URL
    driver.get("https://alchemy.hguy.co/jobs/wp-admin")
    #actions = ActionChains(driver)
   # actions.key_down(Keys.PAGE_DOWN).perform()
   # actions.key_down().click()
    driver.find_element(By.ID,"user_login").clear()
    driver.find_element(By.ID,"user_login").send_keys("root")
    driver.find_element(By.ID,"user_pass").clear()
    driver.find_element(By.ID,"user_pass").send_keys("pa$$w0rd")
    driver.find_element(By.XPATH,"//input[@id='wp-submit']").click()
    List= driver.find_element(By.XPATH,"//div[contains(text(),'Job Listings')]").click()
    driver.find_element(By.XPATH,"//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[4]/a[1]").click()
    driver.implicitly_wait(20)

    title=driver.find_element(By.XPATH,"//h1[contains(text(),'Welcome to the Block Editor')]").text
    print(title)
    driver.find_element(By.XPATH,"//button[@aria-label='Close dialog'][1]").click()

    driver.implicitly_wait(20)
    driver.execute_script("window.scrollTo(0,document.body.scrollHeight)")
    JobData=driver.find_element(By.ID,"job_listing_data")
    if JobData.is_displayed():
     driver.find_element(By.XPATH,"//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/h2[1]").click()
    x=driver.find_element(By.XPATH,"//button[@aria-expanded='true']").is_displayed()
    print(x)
    driver.find_element(By.XPATH,"//h2[@class='hndle ui-sortable-handle']").click()
    driver.find_element(By.XPATH,"//textarea[@id='post-title-0']").send_keys("Tester")
    driver.execute_script("window.scrollTo(0,document.body.scrollHeight)")
    driver.find_element(By.XPATH,"//input[@id='_job_location']").send_keys("India")
    Company=driver.find_element(By.XPATH,"//input[@id='_company_name']")
    Company.send_keys("Gamezone")
    driver.find_element(By.XPATH,"//input[@id='_company_website']").send_keys("www.abc.com")
    driver.find_element(By.XPATH,"//input[@id='_company_tagline']").send_keys("Believe In Yourself")
    driver.find_element(By.XPATH,"//input[@id='_company_twitter']").send_keys("twit@ABC")
    driver.find_element(By.XPATH,"//button[contains(text(),'Upload')]").click()
    driver.implicitly_wait(20)
    driver.find_element(By.XPATH,"//body/div[@id='__wp-uploader-id-2']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ul[1]/li[5]/div[1]/div[1]").click()
    driver.find_element(By.XPATH,"//button[contains(text(),'Use file')]").click()
    driver.find_element(By.XPATH,"//input[@id='_filled']").click()
    driver.find_element(By.XPATH,"//input[@id='_featured']").click()
    driver.find_element(By.XPATH,"//button[contains(text(),'Publish…')]").click()
    driver.find_element(By.XPATH,"//*[@id='editor']/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div/button[1]").click()
    Published = driver.find_element(By.XPATH,"//div[contains(text(),'Published')]").text
    click_link=driver.find_element(By.XPATH,"//a[contains(text(),'View Job')]")
    print("The Job in ",Published ,"successfully Thank You . ", "Click here" ,click_link.get_attribute("href"))
    click_link.click()
    driver.implicitly_wait(20)









