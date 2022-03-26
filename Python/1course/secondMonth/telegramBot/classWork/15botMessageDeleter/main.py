import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(func=lambda x: True)
def deleter(message):
    bot.delete_message(message.chat.id, message.id)
    bot.send_message(message.chat.id, 'I have deleted your message!')

bot.polling()
