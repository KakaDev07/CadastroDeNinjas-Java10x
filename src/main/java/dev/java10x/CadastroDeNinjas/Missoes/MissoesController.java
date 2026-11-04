package dev.java10x.CadastroDeNinjas.Missoes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    // GET -- Mandar uma requisçao para MOSTRAR as missoes

    @GetMapping("/listar")
    public String listarMissoes(){
        return "missoes listadas com sucesso";
    }

    // POST -- Mandar uma requisçao para CRIAR as missoes

    @PostMapping("/criar")
    public String criarMissao(){
        return "missao criada com sucesso";
    }

    // PUT -- Mandar uma requisçao para ALTERAR as missoes

    @PutMapping("/alterar")
    public String alterarMissao(){
        return  "missao alterada com sucesso";
    }

    // DELETE -- Mandar uma requisçao para DELETAR as missoes

    @DeleteMapping("/deletar")
    public  String deletarMissao(){
        return  "missao deletada com sucesso";
    }
}
