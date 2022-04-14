import re

# pip install beautifulsoup4
from bs4 import BeautifulSoup

with open("src/index.html", "r") as file:
    src = file.read()

# pip install lxml

soup = BeautifulSoup(src, "lxml")

# getting title of our page
# title = soup.title
# print(title)
# print(title.text)


# getting the first occurrence of li tag
# page_li = soup.find("li")
# print(page_li)

# getting all occurrences of li tag
# page_all_li = soup.find_all("li")
# print(page_all_li)
# for item in page_all_li:
#     print(item.text)

# getting div with class='user__name', only the first occurrence
# user_name = soup.find("div", class_="user__name")
# print(user_name)
# print(user_name.text.strip())

# doing the same as above
# user_name = soup.find("div", class_="user__name").find("span").text 
# print(user_name)

# this is for a more precise search
# user_name = soup.find("div", {"class": "user__name"}).find("span").text
# print(user_name)

# getting all spans from 'user__info'
# find_all_spans_in_user_info = soup.find(class_="user__info").find_all("span")
# print(find_all_spans_in_user_info)
# for item in find_all_spans_in_user_info:
#     print(item.text.strip())

# getting social links
# social_links = soup.find(class_="social__networks").find("ul").find_all("a")
# print(*social_links, sep="\n")

# doing the same as above, but with extracting links and content
# all_a = soup.find_all("a")
# print(*all_a, sep="\n")
# for item in all_a:
#     item_text = item.text
#     item_url = item.get("href")
#     print(f"{item_text}: {item_url}")


# using methods find_parent() and find_parents()
# getting the content of the nearest parent
# post_div = soup.find(class_="post__text").find_parent()
# print(post_div)

# getting content of parent 'user__post'
# post_div = soup.find(class_="post__text").find_parent("div", "user__post")
# print(post_div)

# getting content of all parents
# all_parents = soup.find(class_="post__text").find_parents()
# print(all_parents)

# getting content of all parents until user__post
# all_parents = soup.find(class_="post__text").find_parents("div", "user__post")
# print(all_parents)


# using next_element and previous_element attributes
# next_elem = soup.find(class_="post__title").next_element.next_element
# print(next_elem)

# next_elem = soup.find(class_="post__title").find_next()
# print(next_elem)
# previous_element and find_previous() work in opposite way


# using methods find_next_sibling() and find_previous_sibling()
# getting the next sibling
# next_sib = soup.find(class_="post__title").find_next_sibling()
# print(next_sib)

# getting the previous sibling
# prev_sib = soup.find(class_="post__text").find_previous_sibling()
# print(prev_sib)


# searching a tag with some specific content
# find_a_by_text = soup.find("a", text="YouTube")
# print(find_a_by_text)

# find_a_by_text = soup.find("a", text="YouTube channel")
# print(find_a_by_text)

# find_a_by_text = soup.find("a", text=re.compile("YouTube"))
# print(find_a_by_text)