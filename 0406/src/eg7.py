# coding = utf-8
from selenium import webdriver
import time
driver = webdriver.Firefox()
driver.get("http://www.baidu.com")

driver.find_element_by_link_text("新闻").click()
time.sleep(10)
driver.set_window_size(400, 800)
time.sleep(10)

#将页面滚动条拖到底部
js = "var q=document.documentElement.scrollTop=10000"
driver.execute_script(js)
time.sleep(10)
#将滚动条移动到页面的顶部
js="var q=document.documentElement.scrollTop=0"
driver.execute_script(js)

time.sleep(10)
driver.quit()