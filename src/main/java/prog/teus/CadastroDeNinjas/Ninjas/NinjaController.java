package prog.teus.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa e minha primeira mensagem nessa rota!";
    }

    //Cria um novo Ninja
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    //Altera um ninja por IDs
    @PutMapping("/alterarID")
    public String alterarPorId(){
        return "Ninja alterado por Id";
    }

    //Mostra todos os Ninjas
    @GetMapping("/listarID")
    public String mostrarTodoOsNinjas(){
        return "Todos os ninjas";
    }

    //Deleta o ninja por ID
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletado por id";
    }
}
