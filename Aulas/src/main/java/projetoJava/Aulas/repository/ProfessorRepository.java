package projetoJava.Aulas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoJava.Aulas.entity.ProfessorEntity;
import java.util.Optional;

public interface ProfessorRepository extends JpaRepository<ProfessorEntity, Long> {
    Optional<ProfessorEntity> findByMatricula(String matricula);
}
