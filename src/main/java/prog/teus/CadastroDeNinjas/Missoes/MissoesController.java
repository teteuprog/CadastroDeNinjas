package prog.teus.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;
import prog.teus.CadastroDeNinjas.Ninjas.NinjaModel;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    //Lista as missoes
    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarMissoes();
    }
    //Listar por id
    @GetMapping("/listar/{id}")
    public MissoesModel listarPorId(@PathVariable Long id){
        return missoesService.listarPorId(id);
    }

    //Cria missoes
    @PostMapping("/criar")
    public MissoesModel criarMissoes(@RequestBody MissoesModel missao){
        return missoesService.criarMissoes(missao);
    }

    //Altera as missoes
    @PutMapping("/alterar")
    public String alterarMissoes(){
        return "Missoes alteradas com sucesso";
    }

    //Deleta as missoes
    @DeleteMapping("deletar/{id}")
    public void deletarMissoes(@PathVariable Long id){
        missoesService.deletarMissao(id);
    }
}
