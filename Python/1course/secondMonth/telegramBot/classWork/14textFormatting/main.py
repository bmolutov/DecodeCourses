from ast import parse
import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

@bot.message_handler(commands=['start'])
def start(message):
    bot.send_message(message.chat.id, 'Text formatting')
    bot.send_message(message.chat.id, '<b>Bold text.</b>', parse_mode='HTML')
    bot.send_message(message.chat.id, '<i>Italic text</i>', parse_mode='HTML')
    bot.send_message(message.chat.id, '<u>Underlined text</u>', parse_mode='HTML')
    bot.send_message(message.chat.id, '<s>Striked text</s>', parse_mode='HTML')
    bot.send_message(message.chat.id, '<a href="https://www.coursera.org/">HyperLink</a>', parse_mode='HTML')
    bot.send_message(message.chat.id, '<code>print(\'I will do my best!\')</code>', parse_mode='HTML')
    bot.send_message(message.chat.id, '<tg-spoiler>Spoiler text</tg-spoiler>', parse_mode='HTML')

bot.polling()
