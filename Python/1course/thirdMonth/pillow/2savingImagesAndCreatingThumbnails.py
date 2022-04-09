from PIL import Image

img = Image.open('./pic.jpg')

img.thumbnail((200, 200)) # getting thumbnail
img.save('mini_pic.jpg') # saving the picture
img.show()
