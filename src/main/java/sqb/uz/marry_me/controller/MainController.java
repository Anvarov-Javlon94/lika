package sqb.uz.marry_me.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sqb.uz.marry_me.service.ClientService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class MainController {

    ClientService clientService;

    @GetMapping("/")
    public String getMainPage() {
        return "index";
    }

    @PostMapping("/sendMessage")
    public String sendMessage(@RequestParam String name_of_client,
                              @RequestParam String text_of_client,
                              HttpServletRequest request){
    clientService.addClientToDateBase(name_of_client, text_of_client, request);
    return "redirect:/";
    }

}
