package projetoJava.Aulas.entity;

import lombok.*;
import jakarta.persistence.*;
import projetoJava.Aulas.entity.enums.TurnoEnum;

@Entity
@Table(name = "alunos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AlunoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(unique = true, nullable = false)
    private String matricula;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TurnoEnum turno;
}

