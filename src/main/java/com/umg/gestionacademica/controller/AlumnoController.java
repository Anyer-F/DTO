package com.umg.gestionacademica.controller;

import org.springframework.web.bind.annotation.*;

import com.umg.gestionacademica.dto.AlumnoDTO;
import com.umg.gestionacademica.service.AlumnoService;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {
    private final AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping
    public List<AlumnoDTO> obtenerTodos(@RequestParam(required = false) String apellidos) {
        return alumnoService.obtenerTodos(apellidos);
    }

    @GetMapping("/{id}")
    public AlumnoDTO obtenerPorId(@PathVariable Long id) {
        return alumnoService.obtenerPorId(id);
    }
}