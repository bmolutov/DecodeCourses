# pip install beautifulsoup4 requests lxml

from textwrap import indent
import requests
from bs4 import BeautifulSoup
import json
import csv

# saving url
# url = "https://health-diet.ru/table_calorie/?utm_source=leftMenu&utm_medium=table_calorie"

# giving header for request
# it is unnecessary, but desirable
headers = {
    "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.88 Safari/537.36",
}

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

with open("all_categories_dict.json", encoding="utf-8") as file:
    all_categories = json.load(file)

iteration_count = len(all_categories) - 1
count = 0
print(f"Total of iterations: {iteration_count}")

for category_name, category_href in all_categories.items():

    # replacing the symbols by underscore
    rep = [",", " ", "-", "'"]
    for item in rep:
        if item in category_name:
            category_name = category_name.replace(item, "_")

    req = requests.get(url=category_href, headers=headers)
    src = req.text

    # saving html of the specific category page
    with open(f"data/{count}_{category_name}.html", "w", encoding="utf-8") as file:
        file.write(src)

    # reading html of the specific category page
    with open(f"data/{count}_{category_name}.html", encoding="utf-8") as file:
        src = file.read()

    soup = BeautifulSoup(src, "lxml")

    # check if the page is empty
    alert_block = soup.find(class_="uk-alert-danger")
    if alert_block is not None:
        continue

    # getting headers of the table
    table_head = soup.find(class_="mzr-tc-group-table").find("tr").find_all("th")
    product = table_head[0].text
    calories = table_head[1].text
    proteins = table_head[2].text
    fats = table_head[3].text
    carbohydrates = table_head[4].text

    with open(f"data/{count}_{category_name}.csv", "w", encoding="utf-8") as file:
        writer = csv.writer(file)
        writer.writerow(
            (
                product,
                calories,
                proteins,
                fats,
                carbohydrates,
            )
        )

    # getting data of products
    products_data = soup.find(class_="mzr-tc-group-table").find("tbody").find_all("tr")
    for item in products_data:
        product_tds = item.find_all("td")

        title = product_tds[0].find("a").text
        calories = product_tds[1].text
        proteins = product_tds[2].text
        fats = product_tds[3].text
        carbohydrates = product_tds[4].text

        with open(f"data/{count}_{category_name}.csv", "a", encoding="utf-8") as file:
            writer = csv.writer(file)
            writer.writerow(
                (
                    title,
                    calories,
                    proteins,
                    fats,
                    carbohydrates,
                )
            )
        
    count += 1
    print(f"# Iteration {count}. {category_name} is written...")
    iteration_count -= 1

    if iteration_count == 0:
        print("It's done!")
        break

    print(f"Iterations left: {iteration_count}")
