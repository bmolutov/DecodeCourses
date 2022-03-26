import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    bot.send_message(message.chat.id, f'I know everything about you:\n\nChat ID: {message.chat.id}\nName ID: {message.from_user.id}\nName: {message.from_user.first_name}\nSurname: {message.from_user.last_name}\nUsername: {message.from_user.username}\n\nMessage test: {message.text}')

bot.polling()
