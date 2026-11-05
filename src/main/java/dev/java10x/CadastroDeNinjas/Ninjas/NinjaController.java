package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping ("/boas_vindas")
    public String boasVindas(){
        return "Essa e minha primeira mensagem";
    }

    @PostMapping("/criar")
    public String criarNinja(){
        return "mostrar Ninja criado";
    }

    @GetMapping("/listar")
    public List<NinjaModel> mostrarTodosOsNinjas(){
        return ninjaService.listarNinjas();
    }
    @GetMapping("/listar/{id}")
    public NinjaModel mostrarTodosOsNinjasPorId(@PathVariable Long id){
       return ninjaService.listarNinjasID(id);
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
