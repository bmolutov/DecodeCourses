from PIL import Image, ImageFilter, ImageDraw

img = Image.new('RGB', (400, 400), 'gray')
image_draw = ImageDraw.Draw(img)

# image_draw.rectangle((20, 20, 100, 100), fill='white')
image_draw.ellipse((20, 20, 100, 100), fill='white')

img.save('canvas.jpg')
img.show()
