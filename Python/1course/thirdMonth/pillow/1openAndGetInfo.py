from PIL import Image

img = Image.open('./pic.jpg')
img.show()


print(img.size)
print(img.format)
print(img.mode)
