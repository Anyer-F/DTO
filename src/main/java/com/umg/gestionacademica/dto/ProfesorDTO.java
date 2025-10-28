package com.umg.gestionacademica.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfesorDTO {
    private Long id;
    private String nombres;
    private String apellidos;
    private String especialidad;
}

