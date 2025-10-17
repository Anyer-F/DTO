package com.umg.gestionacademica.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
}

