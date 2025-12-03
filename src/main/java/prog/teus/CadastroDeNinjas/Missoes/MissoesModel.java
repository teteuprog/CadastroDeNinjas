package prog.teus.CadastroDeNinjas.Missoes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import prog.teus.CadastroDeNinjas.Ninjas.NinjaModel;

import java.util.LinkedList;


@Entity
@Table(name = "tb_cadastro_missoes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome, rank;

    @OneToMany(mappedBy = "missoes")
    private LinkedList<NinjaModel> ninja;

}
