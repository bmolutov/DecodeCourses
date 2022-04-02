import telebot
from telebot import types

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    kb = types.ReplyKeyboardMarkup(row_width=5)
    
    b1 = types.KeyboardButton(text='b1')
    kb.add(b1)

    b2 = types.KeyboardButton(text='b2')
    b3 = types.KeyboardButton(text='b3')
    b4 = types.KeyboardButton(text='b4')
    kb.add(b2, b3, b4)

    b5 = types.KeyboardButton(text='b5')
    b6 = types.KeyboardButton(text='b6')
    b7 = types.KeyboardButton(text='b7')
    b8 = types.KeyboardButton(text='b8')
    b9 = types.KeyboardButton(text='b9')
    kb.add(b5, b6, b7, b8, b9)

    bot.send_message(message.chat.id, 'This is a pyramid!', reply_markup=kb)

bot.polling()
