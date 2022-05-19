package sqb.uz.marry_me.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sqb.uz.marry_me.repository.ClientRepository;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/api")
public class RestApi {

    final ClientRepository clientRepository;

    @GetMapping("/get-all")
    public ResponseEntity getAll(){
        return ResponseEntity.ok(clientRepository.findAll());
    }
}
