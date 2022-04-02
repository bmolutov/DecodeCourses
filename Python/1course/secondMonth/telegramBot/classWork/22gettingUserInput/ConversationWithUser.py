import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    name_request = bot.send_message(message.chat.id, 'Please enter your name!')
    bot.register_next_step_handler(name_request, name_response)

def name_response(message):
    bot.send_message(message.chat.id, f'Hello {message.text}')

    age_request = bot.send_message(message.chat.id, 'Please enter your age!')
    bot.register_next_step_handler(age_request, age_response)

def age_response(message):
    age = int(message.text)
    if age < 18:
        bot.send_message(message.chat.id, 'Oh, you are minor, go out!')
    else:
        bot.send_message(message.chat.id, 'You are adult, welcome to our club!')

bot.polling()
