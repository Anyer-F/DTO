package com.umg.gestionacademica.dto.reporte;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReporteEstudiantesPorCicloDTO {
    private String ciclo;
    private Long cantidadEstudiantes;
}
