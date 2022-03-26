import telebot
import datetime

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    date = message.date + (6 * 3600)
    bot.send_message(message.chat.id, f'Almaty date and time (UTC +6): \n{datetime.datetime.utcfromtimestamp(date)}')

bot.polling()
