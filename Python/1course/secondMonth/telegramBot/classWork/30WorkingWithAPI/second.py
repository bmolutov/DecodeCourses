from urllib import response
import requests 
import json

# response = requests.get('http://numbersapi.com/random/year?json')
response = requests.get('http://numbersapi.com/7')

# print(json.loads(response.text)['text'])
print(response.text)