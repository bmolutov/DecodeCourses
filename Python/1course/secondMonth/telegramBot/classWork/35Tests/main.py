import requests
import json

# r = requests.get('https://api.openweathermap.org/data/2.5/weather?lat=43.2567&lon=76.9286&appid=0056fd1d894493e5a584812253f2ae2b')
r = requests.get('https://api.openweathermap.org/data/2.5/weather?q=Almaty&appid=0056fd1d894493e5a584812253f2ae2b&units=metric&lang=ru')

data = json.loads(r.text)

for k in data.keys():
    print(k, data[k], '\n')