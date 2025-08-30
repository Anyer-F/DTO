package com.umg.gestionacademica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.umg.gestionacademica.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {}

