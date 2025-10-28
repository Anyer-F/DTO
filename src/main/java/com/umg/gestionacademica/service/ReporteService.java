package com.umg.gestionacademica.service;

import com.umg.gestionacademica.dto.reporte.ReporteCursosPorProfesorDTO;
import com.umg.gestionacademica.dto.reporte.ReporteEstudiantesPorCicloDTO;
import com.umg.gestionacademica.dto.reporte.ReportePromedioPorCursoDTO;
import com.umg.gestionacademica.dto.reporte.TopCursosPromedioDTO;
import com.umg.gestionacademica.repository.InscripcionRepository;
import com.umg.gestionacademica.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReporteService {

    @Autowired
    private ProfesorRepository profesorRepository;

    @Autowired
    private InscripcionRepository inscripcionRepository;

    public List<ReporteCursosPorProfesorDTO> getReporteCursosPorProfesor() {
        return profesorRepository.getReporteCursosPorProfesor();
    }

    public List<ReportePromedioPorCursoDTO> getReportePromedioPorCurso() {
        return inscripcionRepository.getReportePromedioPorCurso();
    }

    public List<ReporteEstudiantesPorCicloDTO> getReporteEstudiantesPorCiclo() {
        return inscripcionRepository.getReporteEstudiantesPorCiclo();
    }

    public List<TopCursosPromedioDTO> getTopCursosPromedio() {
        return inscripcionRepository.getTopCursosPromedio().stream().limit(3).collect(Collectors.toList());
    }
}
