package com.umg.gestionacademica.dto.reporte;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopCursosPromedioDTO {
    private String nombreCurso;
    private Double promedioNota;
}
