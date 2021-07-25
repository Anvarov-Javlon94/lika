package sqb.uz.marry_me.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sqb.uz.marry_me.repository.ClientRepository;
import sqb.uz.marry_me.service.ClientService;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/")
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class MainController {

    ClientService clientService;

    @GetMapping("/")
    public String getMainPage(HttpServletRequest request) {
       clientService.addClientToDateBase(request);
        return "index";

    }
}
