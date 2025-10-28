package com.umg.gestionacademica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.umg.gestionacademica.model.Profesor;
import java.util.List;

import com.umg.gestionacademica.dto.reporte.ReporteCursosPorProfesorDTO;
import org.springframework.data.jpa.repository.Query;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
    List<Profesor> findByEspecialidad(String especialidad);

    @Query("SELECT NEW com.umg.gestionacademica.dto.reporte.ReporteCursosPorProfesorDTO(CONCAT(p.nombres, ' ', p.apellidos), COUNT(c)) " +
           "FROM Profesor p JOIN p.cursos c " +
           "GROUP BY p.nombres, p.apellidos")
    List<ReporteCursosPorProfesorDTO> getReporteCursosPorProfesor();
}
