import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(regexp=r'[0-9]{11}')
def check(message):
    bot.send_message(message.chat.id, 'This is a phone number!')

@bot.message_handler(func=lambda x: True)
def start(message):
    bot.send_message(message.chat.id, 'Enter your phone number, please!')

bot.polling()
