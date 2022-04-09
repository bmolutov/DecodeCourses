from PIL import Image

img = Image.open('./pic.jpg')

r_img = img.rotate(90)
r_img.save('rotated.jpg')
r_img.show()
