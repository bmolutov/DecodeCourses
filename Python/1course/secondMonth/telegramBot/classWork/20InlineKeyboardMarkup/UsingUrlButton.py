import telebot
from telebot import types

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    kb = types.InlineKeyboardMarkup(row_width=1)
    # url buttons
    btn1 = types.InlineKeyboardButton(text='btn1', url='https://www.coursera.org/')
    btn2 = types.InlineKeyboardButton(text='btn2', url='https://www.coursera.org/')
    kb.add(btn1, btn2)
    bot.send_message(message.chat.id, 'I will do my best!', reply_markup=kb)

bot.polling()
