import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    bot.send_message(message.chat.id, 'I will do my best!')

@bot.message_handler(content_types=['text'])
def text(message):
    bot.reply_to(message, 'This is a text!')

@bot.message_handler(content_types=['sticker'])
def sticker(message):
    bot.reply_to(message, 'This is a sticker!')

@bot.message_handler(content_types=['audio'])
def audio(message):
    bot.reply_to(message, 'This is an audio!')

@bot.message_handler(content_types='document')
def document(message):
    bot.reply_to(message, 'This is a document!')

@bot.message_handler(content_types=['video'])
def video(message):
    bot.reply_to(message, 'This is a video!')

@bot.message_handler(content_types=['photo'])
def photo(message):
    bot.reply_to(message, 'This is a photo!')


bot.polling()
