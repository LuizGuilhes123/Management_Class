package projetoJava.Aulas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoJava.Aulas.entity.SalaEntity;
import projetoJava.Aulas.entity.enums.BlocoEnum;

import java.util.List;

public interface SalaRepository extends JpaRepository<SalaEntity, Long> {
    List<SalaEntity> findByBloco(BlocoEnum bloco);
}
