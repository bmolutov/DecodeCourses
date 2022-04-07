import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    bot.send_contact(message.chat.id, phone_number=77777777777, first_name='Ben', last_name='Shapiro')
    bot.send_poll(message.chat.id, question='Was this course helpful to you?', options=['Yes', 'No', 'Probably no'], allows_multiple_answers=False, is_anonymous=True)

bot.polling()
