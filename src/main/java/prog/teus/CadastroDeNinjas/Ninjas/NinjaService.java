package prog.teus.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

   private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos os Ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    //Listar por ID
    public NinjaModel listarNinjasPorID(Long id){
        Optional<NinjaModel> ninjaporID = ninjaRepository.findById(id);
        return ninjaporID.orElse(null);
    }
}
