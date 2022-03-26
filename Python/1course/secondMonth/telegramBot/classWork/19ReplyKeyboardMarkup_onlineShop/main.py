from cgitb import text
import telebot
from telebot import types

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(func=lambda x: x.text == 'Udemy courses pack')
def coursera(message):
    bot.send_photo(message.chat.id, 'https://s3.amazonaws.com/media.al-fanarmedia.org/wp-content/uploads/2020/04/17090134/udemy.jpg', 'Name: Udemy courses pack\nPrice: 2$')

@bot.message_handler(func=lambda x: x.text == 'Coursera courses pack')
def coursera(message):
    bot.send_photo(message.chat.id, 'https://learning.unv.org/pluginfile.php/243766/mod_page/content/53/Coursera-Logo.jpg', 'Name: Coursera courses pack\nPrice: 1$')

@bot.message_handler(func=lambda x: x.text == 'Go ahead!')
def menu(message):
    menuKBoard = types.ReplyKeyboardMarkup(row_width=1, resize_keyboard=True)
    coursera = types.KeyboardButton(text='Coursera courses pack')
    udemy = types.KeyboardButton(text='Udemy courses pack')
    goBack = types.KeyboardButton(text='Go back!')
    menuKBoard.add(coursera, udemy, goBack)
    bot.send_message(message.chat.id, 'Menu:', reply_markup=menuKBoard)

@bot.message_handler(func=lambda x: x.text == 'Go back!')
@bot.message_handler(commands=['start'])
def start(message):
    startKBoard = types.ReplyKeyboardMarkup(row_width=1, resize_keyboard=True)
    goBtn = types.KeyboardButton(text='Go ahead!')
    startKBoard.add(goBtn)
    bot.send_message(message.chat.id, 'Welcome to our online shop!', reply_markup=startKBoard)

bot.polling()
