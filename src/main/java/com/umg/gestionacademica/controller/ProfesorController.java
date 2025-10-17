package com.umg.gestionacademica.controller;

import org.springframework.web.bind.annotation.*;

import com.umg.gestionacademica.dto.ProfesorDTO;
import com.umg.gestionacademica.service.ProfesorService;

import java.util.List;

@RestController
@RequestMapping("/api/profesores")
public class ProfesorController {
    private final ProfesorService profesorService;

    public ProfesorController(ProfesorService profesorService) {
        this.profesorService = profesorService;
    }

    @GetMapping
    public List<ProfesorDTO> obtenerTodos(@RequestParam(required = false) String especialidad) {
        return profesorService.obtenerTodos(especialidad);
    }

    @GetMapping("/{id}")
    public ProfesorDTO obtenerPorId(@PathVariable Long id) {
        return profesorService.obtenerPorId(id);
    }
}