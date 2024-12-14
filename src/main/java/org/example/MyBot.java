package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "https://t.me/choparpizzabotbot";
    }

    @Override
    public String getBotToken() {
        return "YOUR_BOT_TOKEN";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            handleIncomingMessage(update.getMessage());
        }
    }

    private void handleIncomingMessage(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId().toString());

        if (message.hasText()) {
            processTextMessage(message, sendMessage);
        } else if (message.hasLocation()) {
            sendMessage.setText("Lokatsiya qabul qilindi. Eng yaqin filialni aniqlayapmiz...");
        }

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void processTextMessage(Message message, SendMessage sendMessage) {
        String text = message.getText();
        switch (text) {
            case "/start":
                sendMessage.setText("Assalomu alaykum! Chopar Pizza yetkazib berish xizmatiga xush kelibsiz.");
                sendMessage.setReplyMarkup(BotButton.languageButtons());
                break;

            case "🇺🇿 O'zbekcha":
                sendMessage.setText("Asosiy menyu");
                sendMessage.setReplyMarkup(BotButton.mainMenuUz());
                break;

            case "🍕 Buyurtma berish":
                sendMessage.setText("Buyurtmani o'zingiz 🏃 olib keting yoki Yetkazib berishni 🚚 tanlang");
                sendMessage.setReplyMarkup(BotButton.deliveryTypeUz());
                break;

            case "🚶 Olib ketish":
                userStates.put(message.getChatId(), "PICKUP_BRANCH");
                sendMessage.setText("Qayerdan olib ketasiz?");
                sendMessage.setReplyMarkup(BotButton.pickupBranchButtons());
                break;

            case "Jamoamizga qo'shiling":
                sendJoinTeamMessage(message);
                break;

            default:
                sendMessage.setText("Noto'g'ri buyruq kiritildi!");
                sendMessage.setReplyMarkup(BotButton.mainMenuUz());
                break;
        }
    }

    private void sendJoinTeamMessage(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText("Ahil jamoamizda ishlashga taklif qilamiz! Telegramdan chiqmay, shu yerning o'zida anketani to'ldirish uchun quyidagi tugmani bosing.");

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();

        List<InlineKeyboardButton> rowInline = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("O'tish");
        button.setUrl("https://t.me/HavoqandJamoa_Bot");
        rowInline.add(button);

        rowsInline.add(rowInline);
        markupInline.setKeyboard(rowsInline);
        sendMessage.setReplyMarkup(markupInline);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private Map<Long, String> userStates = new HashMap<>();
}
