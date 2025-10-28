package com.umg.gestionacademica.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfesor;

    private String nombres;
    private String apellidos;
    private String correo;
    private String especialidad;

    @OneToMany(mappedBy = "profesor")
    private Set<Curso> cursos;
}

