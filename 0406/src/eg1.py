# coding = utf-8
from selenium import webdriver
import time

driver = webdriver.Firefox()
time.sleep(3)
driver.get("http://www.baidu.com")
time.sleep(3)

driver.find_element_by_id("kw").send_keys("大虞海棠")
time.sleep(3)
driver.find_element_by_id("su").click()

# driver.find_element_by_name("wd").send_keys("大虞海棠")
# time.sleep(3)
# driver.find_element_by_id("su").click()

# driver.find_element_by_class_name("s_ipt").send_keys("大虞海棠")
# time.sleep(3)
# driver.find_elements_by_class_name("bg s_btn").click()

driver.quit()
