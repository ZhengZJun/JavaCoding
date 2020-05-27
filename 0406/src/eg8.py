# coding = utf-8
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time
driver = webdriver.Firefox()
driver.get("http://www.xuexi365.com/")
driver.find_element_by_id("unameId").clear()
driver.find_element_by_id("").send_keys("18191036112")
driver.find_element_by_id("").send_keys(Keys.TAB)
time.sleep(15)
driver.find_element_by_name("passwordId")

time.sleep(10)
driver.quit()






