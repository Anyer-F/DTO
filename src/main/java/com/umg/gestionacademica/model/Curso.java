package com.umg.gestionacademica.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCurso;

    private String nombre;
    private int semestre;

    @ManyToOne
    @JoinColumn(name = "id_profesor")
    private Profesor profesor;
}

