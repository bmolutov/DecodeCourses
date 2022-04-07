import telebot
import requests
import json

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['random'])
def random(message):
    resp1 = requests.get('https://randomfox.ca/floof/')
    resp2 = requests.get('https://api.adviceslip.com/advice')
    fox = json.loads(resp1.text)
    advice = json.loads(resp2.text)

    bot.send_photo(message.chat.id, fox['image'], advice['slip']['advice'])

bot.polling()
