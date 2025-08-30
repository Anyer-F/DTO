package com.umg.gestionacademica.service;

import org.springframework.stereotype.Service;

import com.umg.gestionacademica.model.Profesor;
import com.umg.gestionacademica.repository.ProfesorRepository;

import java.util.List;

@Service
public class ProfesorService {

    private final ProfesorRepository repo;

    public ProfesorService(ProfesorRepository repo) {
        this.repo = repo;
    }

    // Crear profesor
    public Profesor save(Profesor profesor) {
        return repo.save(profesor);
    }

    // Obtener todos los profesores
    public List<Profesor> getAll() {
        return repo.findAll();
    }

    // Obtener profesor por ID
    public Profesor getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    // Actualizar profesor
    public Profesor update(Long id, Profesor profesor) {
        profesor.setIdProfesor(id);
        return repo.save(profesor);
    }

    // Eliminar profesor
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
