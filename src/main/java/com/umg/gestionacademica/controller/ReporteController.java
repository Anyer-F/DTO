package com.umg.gestionacademica.controller;

import com.umg.gestionacademica.dto.reporte.ReporteCursosPorProfesorDTO;
import com.umg.gestionacademica.dto.reporte.ReporteEstudiantesPorCicloDTO;
import com.umg.gestionacademica.dto.reporte.ReportePromedioPorCursoDTO;
import com.umg.gestionacademica.dto.reporte.TopCursosPromedioDTO;
import com.umg.gestionacademica.service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reportes")
public class ReporteController {

    @Autowired
    private ReporteService reporteService;

    @GetMapping("/cursos-por-profesor")
    public List<ReporteCursosPorProfesorDTO> getReporteCursosPorProfesor() {
        return reporteService.getReporteCursosPorProfesor();
    }

    @GetMapping("/promedio-por-curso")
    public List<ReportePromedioPorCursoDTO> getReportePromedioPorCurso() {
        return reporteService.getReportePromedioPorCurso();
    }

    @GetMapping("/estudiantes-por-ciclo")
    public List<ReporteEstudiantesPorCicloDTO> getReporteEstudiantesPorCiclo() {
        return reporteService.getReporteEstudiantesPorCiclo();
    }

    @GetMapping("/top-cursos")
    public List<TopCursosPromedioDTO> getTopCursosPromedio() {
        return reporteService.getTopCursosPromedio();
    }
}
