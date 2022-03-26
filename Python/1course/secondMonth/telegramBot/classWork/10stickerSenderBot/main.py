import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(content_types=['sticker'])
def sender(message):
    bot.send_sticker(message.chat.id, message.sticker.file_id)

@bot.message_handler(commands=['start'])
def start(message):
    bot.send_message(message.chat.id, 'Hey! Send me any sticker you want!')

bot.polling()
