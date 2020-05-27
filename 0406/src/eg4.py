# coding = utf-8
from selenium import webdriver
import time
driver = webdriver.Firefox()
driver.get("http://www.baidu.com")

title = driver.title
print(title)

url = driver.current_url
print(url)

time.sleep(10)
driver.quit()