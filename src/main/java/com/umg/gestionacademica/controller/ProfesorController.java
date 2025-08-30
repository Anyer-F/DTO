package com.umg.gestionacademica.controller;

import org.springframework.web.bind.annotation.*;

import com.umg.gestionacademica.model.Profesor;
import com.umg.gestionacademica.service.ProfesorService;

import java.util.List;

@RestController
@RequestMapping("/profesores")
public class ProfesorController {

    private final ProfesorService service;

    public ProfesorController(ProfesorService service) {
        this.service = service;
    }

    // Crear profesor
    @PostMapping
    public Profesor create(@RequestBody Profesor profesor) {
        return service.save(profesor);
    }

    // Obtener todos los profesores
    @GetMapping
    public List<Profesor> getAll() {
        return service.getAll();
    }

    // Obtener profesor por ID
    @GetMapping("/{id}")
    public Profesor getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // Actualizar profesor
    @PutMapping("/{id}")
    public Profesor update(@PathVariable Long id, @RequestBody Profesor profesor) {
        return service.update(id, profesor);
    }

    // Eliminar profesor
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
