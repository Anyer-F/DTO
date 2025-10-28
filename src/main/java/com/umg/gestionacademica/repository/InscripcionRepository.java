package com.umg.gestionacademica.repository;

import com.umg.gestionacademica.model.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import com.umg.gestionacademica.dto.reporte.ReportePromedioPorCursoDTO;
import com.umg.gestionacademica.dto.reporte.ReporteEstudiantesPorCicloDTO;
import com.umg.gestionacademica.dto.reporte.TopCursosPromedioDTO;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {
    @Query("SELECT NEW com.umg.gestionacademica.dto.reporte.ReportePromedioPorCursoDTO(c.nombre, AVG(i.notaFinal)) " +
           "FROM Inscripcion i JOIN i.curso c " +
           "GROUP BY c.nombre")
    List<ReportePromedioPorCursoDTO> getReportePromedioPorCurso();

    @Query("SELECT NEW com.umg.gestionacademica.dto.reporte.ReporteEstudiantesPorCicloDTO(i.ciclo, COUNT(i.alumno)) " +
           "FROM Inscripcion i " +
           "GROUP BY i.ciclo")
    List<ReporteEstudiantesPorCicloDTO> getReporteEstudiantesPorCiclo();

    @Query("SELECT NEW com.umg.gestionacademica.dto.reporte.TopCursosPromedioDTO(c.nombre, AVG(i.notaFinal)) " +
           "FROM Inscripcion i JOIN i.curso c " +
           "GROUP BY c.nombre " +
           "ORDER BY AVG(i.notaFinal) DESC")
    List<TopCursosPromedioDTO> getTopCursosPromedio();
}
