import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

def passwordChecker(message):
    return message.text == "pwd"

@bot.message_handler(commands=['start'])
def start(message):
    bot.send_message(message.chat.id, 'Hey, nice to see you! Please enter your password.')

@bot.message_handler(func=passwordChecker)
def reply(message):
    bot.reply_to(message, 'That is right! Welcome to our club!')

bot.polling()
