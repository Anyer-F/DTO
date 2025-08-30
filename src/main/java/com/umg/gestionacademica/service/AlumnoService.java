package com.umg.gestionacademica.service;

import org.springframework.stereotype.Service;

import com.umg.gestionacademica.model.Alumno;
import com.umg.gestionacademica.repository.AlumnoRepository;

import java.util.List;

@Service
public class AlumnoService {
    private final AlumnoRepository repo;

    public AlumnoService(AlumnoRepository repo) {
        this.repo = repo;
    }

    public Alumno save(Alumno alumno) { return repo.save(alumno); }
    public List<Alumno> getAll() { return repo.findAll(); }
    public Alumno getById(Long id) { return repo.findById(id).orElse(null); }
    public Alumno update(Long id, Alumno alumno) {
        alumno.setIdAlumno(id);
        return repo.save(alumno);
    }
    public void delete(Long id) { repo.deleteById(id); }
}
