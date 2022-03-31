from cgitb import text
import telebot
from telebot import types

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    kb = types.InlineKeyboardMarkup(row_width=1)
    btn1 = types.InlineKeyboardButton(text='Favourite songs', callback_data='fvrt')
    btn2 = types.InlineKeyboardButton(text='Bad songs', callback_data='bad')
    kb.add(btn1, btn2)
    bot.send_message(message.chat.id, 'Choose what you want!', reply_markup=kb)

@bot.callback_query_handler(func=lambda callback: callback.data)
def check_callback(callback):
    if callback.data == 'fvrt':
        fav = types.InlineKeyboardMarkup(row_width=2)
        f1 = types.InlineKeyboardButton(text='first', callback_data='first')
        f2 = types.InlineKeyboardButton(text='second', callback_data='second')
        f3 = types.InlineKeyboardButton(text='third', callback_data='third')
        fav.add(f1, f2, f3)
        bot.send_message(callback.message.chat.id, 'Choose one of them', reply_markup=fav)
    elif callback.data == 'bad':
        bad = types.InlineKeyboardMarkup()
        b1 = types.InlineKeyboardButton(text='first', callback_data='first')
        bad.add(b1)
        bot.send_message(callback.message.chat.id, 'Choose one of them', reply_markup=bad)

bot.polling()
