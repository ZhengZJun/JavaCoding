# coding = utf-8
from selenium import webdriver
import time
driver = webdriver.Firefox()
driver.get("http://www.baidu.com")

driver.find_element_by_link_text("新闻").click()
time.sleep(10)
print(driver.title)

driver.back()
time.sleep(10)
print(driver.title)

driver.forward()
print(driver.title)

time.sleep(10)
driver.quit()
