import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(func=lambda x: True)
def start(message):
    bot.send_photo(message.chat.id, 'https://learning.unv.org/pluginfile.php/243766/mod_page/content/53/Coursera-Logo.jpg', 'I learned to code here - https://www.coursera.org/. Try this!')

bot.polling()
