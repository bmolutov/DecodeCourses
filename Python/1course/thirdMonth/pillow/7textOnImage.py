from PIL import Image, ImageFilter, ImageDraw, ImageFont

img = Image.new('RGB', (400, 400), 'gray')
image_draw = ImageDraw.Draw(img)

headline_font = ImageFont.truetype('arial.ttf', size=40)
image_draw.text((140, 140), 'Hello World!', font=headline_font)

img.save('canvas.jpg')
img.show()
