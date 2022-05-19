package sqb.uz.marry_me.bot.processor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

@Configuration
public class Conf {

    @Bean
    public SendMessage sendMess(){
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId("5280200621");
        return sendMessage;
    }

}
