from cgitb import text
import telebot
from telebot import types

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    kb = types.InlineKeyboardMarkup()
    btn1 = types.InlineKeyboardButton(text='Choose chat', switch_inline_query='/start')
    kb.add(btn1)
    bot.send_message(message.chat.id, 'I will do my best!', reply_markup=kb)

bot.polling()
