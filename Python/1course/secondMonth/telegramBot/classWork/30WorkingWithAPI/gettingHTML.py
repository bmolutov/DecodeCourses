import telebot
import requests
import json
from telebot import util

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    url = bot.send_message(message.chat.id, 'Please enter URL!')
    bot.register_next_step_handler(url, url_response)

def url_response(message):
    response = requests.get(message.text)
    for row in util.smart_split(response.text, 3000):
        bot.send_message(message.chat.id, row)

@bot.message_handler(regexp='[0-9]{4}')
def get(message):
    response = requests.get(f'http://numbersapi.com/{message.text}/year?json')
    bot.send_message(message.chat.id, json.loads(response.text)['text'])

bot.polling()
