package projetoJava.Aulas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoJava.Aulas.entity.ReservaEntity;
import projetoJava.Aulas.entity.enums.TurnoEnum;

import java.time.LocalDateTime;
import java.util.List;

public interface ReservaRepository extends JpaRepository<ReservaEntity, Long> {
    List<ReservaEntity> findByTurnoAndHorarioBetween(TurnoEnum turno, LocalDateTime start, LocalDateTime end);
}
