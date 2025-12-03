package prog.teus.CadastroDeNinjas.Missoes;

import jakarta.persistence.*;
import prog.teus.CadastroDeNinjas.Ninjas.NinjaModel;

import java.util.LinkedList;


@Entity
@Table(name = "tb_cadastro_missoes")
public class MissoesModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome, rank;

    @OneToMany(mappedBy = "missoes")
    private LinkedList<NinjaModel> ninja;

    public MissoesModel() {
    }

    public MissoesModel(String nomeDaMissao, String rankMissao) {
        this.nome = nomeDaMissao;
        this.rank = rankMissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
