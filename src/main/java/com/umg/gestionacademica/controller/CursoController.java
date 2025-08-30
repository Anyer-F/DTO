package com.umg.gestionacademica.controller;

import org.springframework.web.bind.annotation.*;

import com.umg.gestionacademica.model.Curso;
import com.umg.gestionacademica.service.CursoService;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoService service;

    public CursoController(CursoService service) {
        this.service = service;
    }

    // Crear curso
    @PostMapping
    public Curso create(@RequestBody Curso curso) {
        return service.save(curso);
    }

    // Obtener todos los cursos
    @GetMapping
    public List<Curso> getAll() {
        return service.getAll();
    }

    // Obtener curso por ID
    @GetMapping("/{id}")
    public Curso getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // Actualizar curso
    @PutMapping("/{id}")
    public Curso update(@PathVariable Long id, @RequestBody Curso curso) {
        return service.update(id, curso);
    }

    // Eliminar curso
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
