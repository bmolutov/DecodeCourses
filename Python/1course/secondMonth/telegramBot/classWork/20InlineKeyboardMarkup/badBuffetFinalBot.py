import telebot  # importing our main library pyTelegramBotAPI for creating bot
from telebot import types

bot = telebot.TeleBot('5235401470:AAF19nx1kXfZF99nbD3YkIDR9zZSfVJ_lFY')  # creating a new object


@bot.callback_query_handler(func=lambda callback: callback.data == 'water' or callback.data == 'go_back')
def goStart(callback):
    kb = types.InlineKeyboardMarkup()
    menu = types.InlineKeyboardButton(text='Menu', callback_data='menu')
    kb.add(menu)
    bot.edit_message_text(chat_id=callback.message.chat.id, message_id=callback.message.message_id, text='Welcome again ;)', reply_markup=kb)

@bot.message_handler(commands=['start'])  # decorator that specifies a handler
# Message is an object of Bot API, it contains info about the message
def start(message):
    kb = types.InlineKeyboardMarkup()
    menu = types.InlineKeyboardButton(text='Menu', callback_data='menu')
    kb.add(menu)
    bot.send_message(message.chat.id, 'Welcome to bad buffet!', reply_markup=kb)

@bot.callback_query_handler(func=lambda callback: callback.data)
def check_callback_data(callback):
    
    menu = types.InlineKeyboardMarkup(row_width=1)
    water = types.InlineKeyboardButton(text='Water', callback_data='water')
    goBack = types.InlineKeyboardButton(text='Go back', callback_data='go_back')
    menu.add(water, goBack)

    if callback.data == 'menu':
        bot.edit_message_text(chat_id=callback.message.chat.id, message_id=callback.message.message_id, text='This is our menu:', reply_markup=menu)

# checks user input and gives specific answer
# gives all user input to handlers for further processing
# depending on user input only one function is chosed for executing line in if/elif/else structure
# it checks commands, and depending on them it chooses specific function for executing
# it checks from upside to downside
bot.polling()
