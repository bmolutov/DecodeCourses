import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(func=lambda x: True)
def start(message):
    # bot.forward_message(chat_id='@tbtestchannelbybeka', from_chat_id=message.chat.id, message_id=message.id)
    bot.copy_message(chat_id='@tbtestchannelbybeka', from_chat_id=message.chat.id, message_id=message.id)

bot.polling()
