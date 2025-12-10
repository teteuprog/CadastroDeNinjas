package prog.teus.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    //Listar todos os ninjas
    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    //Lista por id
    public MissoesModel listarPorId(Long id){
        Optional<MissoesModel> listarporid = missoesRepository.findById(id);
        return listarporid.orElse(null);
    }

    //Cria missoes
    public MissoesModel criarMissoes(MissoesModel missoesModel){
        return missoesModel = missoesRepository.save(missoesModel);
    }

    //Deleta missoes
    public void deletarMissao(Long id){
        missoesRepository.deleteById(id);
    }
}
