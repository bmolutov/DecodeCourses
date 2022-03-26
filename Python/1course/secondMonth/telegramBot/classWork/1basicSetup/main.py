import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    bot.send_message(message.chat.id, 'I will do my best!')

bot.polling()
