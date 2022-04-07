import telebot
import requests
import json

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    bot.send_message(message.chat.id, 'Please enter what you are looking for!')

@bot.message_handler(content_types=['text'])
def get(message):
    response = requests.get(f'https://www.google.com/search?q={message.text}')
    bot.send_message(message.chat.id, response.url)

bot.polling()
