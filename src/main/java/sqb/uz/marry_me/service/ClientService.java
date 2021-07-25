package sqb.uz.marry_me.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import sqb.uz.marry_me.entity.ClientEntity;
import sqb.uz.marry_me.repository.ClientRepository;

import javax.servlet.http.HttpServletRequest;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ClientService {

    ClientRepository clientRepository;

    public void addClientToDateBase(HttpServletRequest request) {
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setIp_address(request.getRemoteAddr());
        clientEntity.setLocal_name(request.getLocalName());
        clientRepository.save(clientEntity);
    }
}
