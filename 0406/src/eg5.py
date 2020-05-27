# coding = utf-8
from selenium import webdriver
import time
driver = webdriver.Firefox()
driver.get("http://www.baidu.com")

#浏览器最大化
# time.sleep(10)
# driver.maximize_window()

#固定格式
time.sleep(10)
driver.set_window_size(400, 800)

time.sleep(10)
driver.quit()