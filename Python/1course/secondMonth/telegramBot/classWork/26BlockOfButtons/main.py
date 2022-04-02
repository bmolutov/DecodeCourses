import telebot
from telebot import types

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    kb = types.InlineKeyboardMarkup()

    b1 = types.InlineKeyboardButton(text='b1', callback_data='b1')
    kb.add(b1)

    b2 = types.InlineKeyboardButton(text='b2', callback_data='b2')
    b3 = types.InlineKeyboardButton(text='b3', callback_data='b3')
    b4 = types.InlineKeyboardButton(text='b4', callback_data='b4')
    kb.add(b2, b3, b4)

    b5 = types.InlineKeyboardButton(text='b5', callback_data='b5')
    kb.add(b5)

    bot.send_message(message.chat.id, 'This is a block of buttons!', reply_markup=kb)

bot.polling()
