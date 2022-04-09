from PIL import Image

img = Image.open('./pic.jpg')

crop_img = img.crop((100, 200, 300, 400)) # cropping the image
crop_img.save('cropped.jpg') # saving the result
crop_img.show()
