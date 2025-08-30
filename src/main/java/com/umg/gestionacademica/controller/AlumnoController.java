package com.umg.gestionacademica.controller;

import org.springframework.web.bind.annotation.*;

import com.umg.gestionacademica.model.Alumno;
import com.umg.gestionacademica.service.AlumnoService;

import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {
    private final AlumnoService service;

    public AlumnoController(AlumnoService service) {
        this.service = service;
    }

    @PostMapping
    public Alumno create(@RequestBody Alumno alumno) {
        return service.save(alumno);
    }

    @GetMapping
    public List<Alumno> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Alumno getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Alumno update(@PathVariable Long id, @RequestBody Alumno alumno) {
        return service.update(id, alumno);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

