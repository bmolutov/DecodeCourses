from cgitb import text
import telebot
from telebot import types

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['goanywhere'])
def goany(message):
    kb = types.InlineKeyboardMarkup(row_width=1)
    b1 = types.InlineKeyboardButton(text='Go ahead!', url='https://www.coursera.org/')
    kb.add(b1)
    bot.send_message(message.chat.id, 'Go here to explore the world web!', reply_markup=kb)

@bot.message_handler(commands=['start'])
def start(message):
    bot.send_message(message.chat.id, 'If you want to start learning send this command /goanywhere')

bot.polling()
