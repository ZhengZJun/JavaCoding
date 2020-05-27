# coding = utf-8
from selenium import webdriver
import time
driver = webdriver.Firefox()
driver.get("http://www.baidu.com")

driver.find_element_by_id("kw").send_keys("Ella")
driver.find_element_by_id("su").submit()
#time.sleep(10)
#速度太快，页面未加载出来，所以就无法找到
driver.implicitly_wait(10)
driver.find_element_by_partial_link_text("Ella_百度百科").click()

time.sleep(10)
driver.quit()