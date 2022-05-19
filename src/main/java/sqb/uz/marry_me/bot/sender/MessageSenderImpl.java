package sqb.uz.marry_me.bot.sender;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import sqb.uz.marry_me.bot.MyBot;

@Service
public class MessageSenderImpl implements MessageSender{
    final MyBot myBot;

    public MessageSenderImpl(MyBot myBot) {
        this.myBot = myBot;
    }

    @SneakyThrows
    @Override
    public void sendMessage(SendMessage sendMessage) {
        myBot.execute(sendMessage);
    }
}
