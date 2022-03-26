import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(func=lambda x: True)
def start(message):
    bot.reply_to(message, f'\"{message.text}\"...Why did you send it? You are so boring!')

bot.polling()
