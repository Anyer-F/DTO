package com.umg.gestionacademica.dto.reporte;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportePromedioPorCursoDTO {
    private String nombreCurso;
    private Double promedioNota;
}
