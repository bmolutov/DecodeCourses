from PIL import Image, ImageFilter, ImageDraw, ImageFont
import requests

url = 'https://images.unsplash.com/photo-1503023345310-bd7c1de61c7d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8aHVtYW58ZW58MHx8MHx8&w=1000&q=80'
response = requests.get(url, stream=True).raw
img = Image.open(response)

img.save('new.jpg', 'jpeg')
img.show()
