import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(func=lambda x: True)
def deleter(message):
    bot_message = bot.send_message(message.chat.id, 'Hey, admin!')
    bot.delete_message(message.chat.id, bot_message.id)

bot.polling()
