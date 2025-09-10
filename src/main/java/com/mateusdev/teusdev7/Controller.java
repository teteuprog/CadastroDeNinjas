package com.mateusdev.teusdev7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasvindas")
    public String boasvindas(){
        return "Essa e a minha primeira rota";
    }
}
