package prog.teus.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    //Lista as missoes
    @GetMapping("/listar")
    public String listarMissoes(){
        return"Missoes listadas com sucesso";
    }

    //Cria missoes
    @PostMapping("/criar")
    public String criarMissoes(){
        return "Missoes criadas com sucesso";
    }

    //Altera as missoes
    @PutMapping("/alterar")
    public String alterarMissoes(){
        return "Missoes alteradas com sucesso";
    }

    //Deleta as missoes
    @DeleteMapping("deletar")
    public String deletarMissoes(){
        return "Missoes deletadas com sucesso";
    }
}
