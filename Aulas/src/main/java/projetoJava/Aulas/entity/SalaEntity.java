package projetoJava.Aulas.entity;

import lombok.*;
import jakarta.persistence.*;
import projetoJava.Aulas.entity.enums.BlocoEnum;

@Entity
@Table(name = "salas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SalaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String numeroSala;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BlocoEnum bloco;
}

