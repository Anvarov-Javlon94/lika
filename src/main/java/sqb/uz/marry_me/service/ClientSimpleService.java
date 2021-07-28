package sqb.uz.marry_me.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import sqb.uz.marry_me.entity.ClientSimple;
import sqb.uz.marry_me.repository.ClientSimpleRepository;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ClientSimpleService {

    ClientSimpleRepository clientSimpleRepository;


    public void addSimpleClient(HttpServletRequest request) {
        Date date = new Date();
        ClientSimple clientSimple = new ClientSimple();
        clientSimple.setIp_address(request.getRemoteAddr());
        clientSimple.setDate_of_visit(date);
        clientSimple.setUser_agent(request.getHeader("User-Agent"));
        clientSimpleRepository.save(clientSimple);
    }
}
