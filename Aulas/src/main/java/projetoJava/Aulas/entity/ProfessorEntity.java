package projetoJava.Aulas.entity;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "professores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProfessorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String matricula;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String materia;
}
