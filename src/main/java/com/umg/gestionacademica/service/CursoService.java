package com.umg.gestionacademica.service;

import org.springframework.stereotype.Service;

import com.umg.gestionacademica.model.Curso;
import com.umg.gestionacademica.repository.CursoRepository;

import java.util.List;

@Service
public class CursoService {

    private final CursoRepository repo;

    public CursoService(CursoRepository repo) {
        this.repo = repo;
    }

    // Crear curso
    public Curso save(Curso curso) {
        return repo.save(curso);
    }

    // Obtener todos los cursos
    public List<Curso> getAll() {
        return repo.findAll();
    }

    // Obtener curso por ID
    public Curso getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    // Actualizar curso
    public Curso update(Long id, Curso curso) {
        curso.setIdCurso(id);
        return repo.save(curso);
    }

    // Eliminar curso
    public void delete(Long id) {
        repo.deleteById(id);
    }
}