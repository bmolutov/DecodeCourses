from cgitb import text
import telebot
from telebot import types

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    kb = types.InlineKeyboardMarkup()
    btn1 = types.InlineKeyboardButton(text='First button', callback_data='btn1')
    btn2 = types.InlineKeyboardButton(text='Second button', callback_data='btn2')
    kb.add(btn1, btn2)
    bot.send_message(message.chat.id, 'I will do my best!', reply_markup=kb)

@bot.callback_query_handler(func=lambda callback: callback.data)
def check_callback(callback):
    if callback.data == 'btn1':
        bot.send_message(callback.message.chat.id, 'You have clicked the first button!')
    else:
        bot.send_message(callback.message.chat.id, 'You have clicked the second button!')
bot.polling()
