import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    with open('conversations.txt', 'a') as users:
        print(message.chat.id, file=users)

@bot.message_handler(commands=['mailing'])
def mailing(message):
    for i in open('conversations.txt', 'r').readlines():
        bot.send_message(i, 'Mailing...')

bot.polling()
