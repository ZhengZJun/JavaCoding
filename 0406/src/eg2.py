# coding = utf-8
from selenium import webdriver
import time
driver = webdriver.Firefox()
driver.get("http://www.baidu.com")

driver.find_element_by_id("kw").send_keys("Ella")
driver.find_element_by_id("su").click()
time.sleep(5)
driver.find_element_by_id("kw").clear()
driver.find_element_by_id("kw").send_keys("Lisa")
driver.find_element_by_id("su").click()

# driver.find_element_by_id("kw").send_keys("Ella")
# driver.find_element_by_id("su").submit()
# time.sleep(5)
# driver.find_element_by_id("kw").clear()
# driver.find_element_by_id("kw").send_keys("Lisa")
# driver.find_element_by_id("su").submit()

# texts = driver.find_element_by_id("s-bottom-layer-right").text
# print(texts)

time.sleep(5)
driver.quit()