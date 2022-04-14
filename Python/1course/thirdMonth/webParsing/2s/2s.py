# pip install beautifulsoup4 requests lxml

from textwrap import indent
import requests
from bs4 import BeautifulSoup
import json

# saving url
# url = "https://health-diet.ru/table_calorie/?utm_source=leftMenu&utm_medium=table_calorie"

# giving header for request
# it is unnecessary, but desirable
# headers = {
#     "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
#     "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.88 Safari/537.36",
# }

# req = requests.get(url, headers=headers)
# src = req.text

# # creating new file with html of the website
# with open("index.html", "w", encoding="utf-8") as file:
#     file.write(src)

# with open("index.html", encoding="utf-8") as file:
#     src = file.read()

##########################################################
# creating json file and writing categories

# soup = BeautifulSoup(src, "lxml")
# all_products_hrefs = soup.find_all(class_="mzr-tc-group-item-href")
# base_url = "https://health-diet.ru"

# all_categories_dict = {}
# for item in all_products_hrefs:
#     item_text = item.text
#     item_href = base_url + item.get("href")
#     # print(f"{item_text}: {item_href}")
#     all_categories_dict[item_text] = item_href

# saving data into json file
# with open("all_categories_dict.json", "w", encoding="utf-8") as file:
#     json.dump(all_categories_dict, file, indent=4, ensure_ascii=False)

############################################################