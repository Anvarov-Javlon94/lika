package sqb.uz.marry_me.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import sqb.uz.marry_me.bot.sender.MessageSender;
import sqb.uz.marry_me.entity.ClientEntity;
import sqb.uz.marry_me.repository.ClientRepository;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientService{

    final ClientRepository clientRepository;
//    final MessageSender messageSender;
//    final SendMessage sendms;

    public void addClientToDateBase(String name_of_client, String text_of_client, HttpServletRequest request) {
        ClientEntity clientEntity = new ClientEntity();
        Date date = new Date();
        clientEntity.setName_of_client(name_of_client);
        clientEntity.setText_of_client(text_of_client);
        clientEntity.setIp_address(request.getRemoteAddr());
        clientEntity.setSend_message_date(date);
        clientEntity.setUser_agent(request.getHeader("User-Agent"));
        clientRepository.save(clientEntity);
//        sendms.setText("NAME:" + clientEntity.getName_of_client() + " TEXT:" + clientEntity.getText_of_client());
//        messageSender.sendMessage(
//                sendms
//        );
    }
}
