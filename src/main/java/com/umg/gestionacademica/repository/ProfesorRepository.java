package com.umg.gestionacademica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.umg.gestionacademica.model.Profesor;
import java.util.List;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
    List<Profesor> findByEspecialidad(String especialidad);
}
