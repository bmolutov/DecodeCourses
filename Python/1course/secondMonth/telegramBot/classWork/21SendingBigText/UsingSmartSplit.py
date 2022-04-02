import telebot
from telebot import util

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    text = open('text.txt', 'r', encoding='utf8').read()
    # if number of characters exceed 5000
    for m in util.smart_split(text, 2000):
        bot.send_message(message.chat.id, m)

bot.polling()
