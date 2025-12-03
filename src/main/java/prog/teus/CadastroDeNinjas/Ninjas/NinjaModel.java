package prog.teus.CadastroDeNinjas.Ninjas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import prog.teus.CadastroDeNinjas.Missoes.MissoesModel;

@Entity
@Table(name = "tb_cadastro")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;
}

