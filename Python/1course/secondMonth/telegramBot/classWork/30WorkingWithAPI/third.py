import telebot
import requests
import json

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    bot.send_message(message.chat.id, 'I will do my best!')

@bot.message_handler(regexp='[0-9]{4}')
def get(message):
    response = requests.get(f'http://numbersapi.com/{message.text}/year?json')
    bot.send_message(message.chat.id, json.loads(response.text)['text'])

bot.polling()
