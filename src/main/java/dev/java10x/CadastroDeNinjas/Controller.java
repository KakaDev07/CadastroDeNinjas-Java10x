package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping ("/rota_1")
    public String BoasVindas(){
        return "Essa e minha primeira mensagem";
    }

}
