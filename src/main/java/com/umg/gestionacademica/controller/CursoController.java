package com.umg.gestionacademica.controller;

import org.springframework.web.bind.annotation.*;

import com.umg.gestionacademica.dto.CursoDTO;
import com.umg.gestionacademica.service.CursoService;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {
    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<CursoDTO> obtenerTodos(@RequestParam(required = false) Integer semestre) {
        return cursoService.obtenerTodos(semestre);
    }

    @GetMapping("/{id}")
    public CursoDTO obtenerPorId(@PathVariable Long id) {
        return cursoService.obtenerPorId(id);
    }
}