package com.umg.gestionacademica.service;

import org.springframework.stereotype.Service;

import com.umg.gestionacademica.model.Curso;
import com.umg.gestionacademica.repository.CursoRepository;
import com.umg.gestionacademica.dto.CursoDTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CursoService {
    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    private CursoDTO convertirADTO(Curso curso) {
        String nombreProfesor = (curso.getProfesor() != null) ? curso.getProfesor().getNombres() + " " + curso.getProfesor().getApellidos() : null;
        return new CursoDTO(curso.getIdCurso(), curso.getNombre(), curso.getSemestre(), nombreProfesor);
    }

    public List<CursoDTO> obtenerTodos(Integer semestre) {
        List<Curso> cursos = (semestre != null) ?
                cursoRepository.findBySemestre(semestre) : cursoRepository.findAll();
        return cursos.stream().map(this::convertirADTO).collect(Collectors.toList());
    }

    public CursoDTO obtenerPorId(Long id) {
        return cursoRepository.findById(id)
                .map(this::convertirADTO)
                .orElse(null);
    }
}