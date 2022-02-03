package com.yoesoff.myspring.dummy.controller;

import com.yoesoff.myspring.dto.response.MessageResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController extends BaseController {
    @GetMapping("/welcome")
    public ResponseEntity<MessageResponseDTO> sayHi(){
        MessageResponseDTO response = new MessageResponseDTO();
        response.setMessage("Hello World");

        return ResponseEntity.ok().body(response);

    }
}
