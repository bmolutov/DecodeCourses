import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    bot.send_message(message.chat.id, 'If you wish to get our phone, enter /getphone')

@bot.message_handler(commands=['getphone'])
def phone(message):
    bot.send_contact(message.chat.id, phone_number=77777777777, first_name='Ben', last_name='Shapiro')

bot.polling()
