package projetoJava.Aulas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoJava.Aulas.entity.AlunoEntity;
import java.util.Optional;

public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {
    Optional<AlunoEntity> findByMatricula(String matricula);
}
