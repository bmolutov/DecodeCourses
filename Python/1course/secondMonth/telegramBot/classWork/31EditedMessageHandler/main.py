import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.edited_message_handler(func=lambda x: True)
def start(message):
    bot.send_message(message.chat.id, 'You have edited your message!')

bot.polling()
