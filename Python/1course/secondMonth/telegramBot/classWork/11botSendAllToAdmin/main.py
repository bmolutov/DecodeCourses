import telebot

bot = telebot.TeleBot('5221301069:AAGVrwV16f2B9lyI8p7FDMIIVY8G8J0l6DQ')

adminChatID = 1211502998

'''
@bot.message_handler(content_types=['video', 'photo'])  # AND

@bot.message_handler(content_types=['video'])  # OR
@bot.message_handler(content_types=['photo'])
'''

@bot.message_handler(content_types=['video'])
@bot.message_handler(content_types=['photo'])
def sender(message):
    if message.content_type == 'photo':
        bot.send_photo(adminChatID, message.photo[0].file_id)
    else:
        bot.send_video(adminChatID, message.video.file_id)

@bot.message_handler(func=lambda x: True)
def start(message):
    bot.send_message(message.chat.id, 'Hey, waiting for you to send a photo or a video.')

bot.polling()
