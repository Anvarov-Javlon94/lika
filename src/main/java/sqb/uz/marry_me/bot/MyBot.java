package sqb.uz.marry_me.bot;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class MyBot extends TelegramLongPollingBot {

    static final String USERNAME = "marry_meUz_bot";
    static final String TOKEN = "5280200621:AAH4gx3LyjgYZQmGBoLx92XzT_dES829QjQ";


    @Override
    public String getBotUsername() {
        return USERNAME;
    }

    @Override
    public String getBotToken() {
        return TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {

    }
}
