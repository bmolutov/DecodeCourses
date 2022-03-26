import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['change'])
def change(message):
    edited_message = bot.edit_message_text(chat_id=message.chat.id, message_id=prev_message.id, text='Hey Admin!')
    bot.send_message(message.chat.id, edited_message.text)

@bot.message_handler(commands=['start'])
def start(message):
    global prev_message
    prev_message = bot.send_message(message.chat.id, 'Hey User!')

bot.polling()
