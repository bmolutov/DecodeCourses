import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    bot.send_message(message.chat.id, 'Hey, how is it going?')

@bot.message_handler(content_types=['text'])
def writer(message):
    with open('inputMessage.txt', 'w') as f:
        f.write(message.text)
    with open('inputMessage.txt', 'rb') as f:
        bot.send_document(message.chat.id, f)

bot.polling()
