package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping ("/boas_vindas")
    public String boasVindas(){
        return "Essa e minha primeira mensagem";
    }

    @PostMapping("/criar")
    public String criarNinja(){
        return "mostrar Ninja criado";
    }

    @GetMapping("/todos")
    public  String mostrarTodosOsNinjas(){
        return "mostrar Ninjas criados por id";
    }

    @GetMapping("/todsID")
    public String mostrarTodosPorId(){
       return "mostrar Ninja por id";
    }

    @PutMapping("/alterarID")
    public String alterarTodosPorId(){
        return "alterar Ninja por id";
    }

    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return  "Ninja deletado por id";
    }


}
