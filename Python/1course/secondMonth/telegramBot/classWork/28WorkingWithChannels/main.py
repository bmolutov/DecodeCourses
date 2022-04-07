import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

bot.send_message('@tbtestchannelbybeka', 'Hello world!')

bot.polling()
