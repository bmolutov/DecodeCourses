import telebot
from telebot import types

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    kb = types.ReplyKeyboardMarkup(row_width=1)
    b1 = types.KeyboardButton(text='Phone number request', request_contact=True)
    b2 = types.KeyboardButton(text='Location request', request_location=True)
    kb.add(b1, b2)
    bot.send_message(message.chat.id, 'Hey, how is it going?', reply_markup=kb)

@bot.message_handler(content_types=['contact'])
def check_contact(message):
    if message.contact.user_id == message.from_user.id:
        bot.send_message(message.chat.id, 'Valid phone number!')
    else:
        bot.send_message(message.chat.id, 'Invalid phone number!')

@bot.message_handler(content_types=['location'])
def print_location(message):
    bot.send_message(message.chat.id, message.location)

bot.polling()
