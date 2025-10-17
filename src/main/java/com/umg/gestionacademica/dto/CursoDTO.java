package com.umg.gestionacademica.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoDTO {
    private Long id;
    private String nombre;
    private int semestre;
    private String nombreProfesor;  // exponemos solo el nombre del profesor
}
