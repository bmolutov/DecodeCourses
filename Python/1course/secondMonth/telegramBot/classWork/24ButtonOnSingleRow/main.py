import telebot
from telebot import types

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    kb = types.ReplyKeyboardMarkup(row_width=1)
    b1 = types.KeyboardButton(text='First')
    b2 = types.KeyboardButton(text='Second')
    b3 = types.KeyboardButton(text='Third')
    b4 = types.KeyboardButton(text='Fourth')
    # Max number of buttons per row for ReplyKeyboard is 12
    # Max number of buttons per row for InlineReplyKeyboard is 9
    kb.row(b1, b2, b3, b4) # adding buttons to the single row
    # reversely add() method checks row_width parameter for displaying max number of buttons per row

    bot.send_message(message.chat.id, 'Message...', reply_markup=kb)

bot.polling()
