import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    sent = bot.reply_to(message, 'Please leave your feedback!')
    bot.register_next_step_handler(sent, review)

def review(message):
    message_to_save = message.text
    with open('text.txt', 'w') as f:
        f.write(message_to_save)
    print(message_to_save)

bot.polling()
