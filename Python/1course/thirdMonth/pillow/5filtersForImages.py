from PIL import Image, ImageFilter

img = Image.open('./pic.jpg')

# blurred_img = img.filter(ImageFilter.BLUR)
# blurred_img.save('blurred.jpg')
# blurred_img.show()

contour_img = img.filter(ImageFilter.CONTOUR)
contour_img.save('contoured.jpg')
contour_img.show()
