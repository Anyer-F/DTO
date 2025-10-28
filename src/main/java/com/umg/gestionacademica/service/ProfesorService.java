package com.umg.gestionacademica.service;

import org.springframework.stereotype.Service;

import com.umg.gestionacademica.model.Profesor;
import com.umg.gestionacademica.repository.ProfesorRepository;
import com.umg.gestionacademica.dto.ProfesorDTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfesorService {
    private final ProfesorRepository profesorRepository;

    public ProfesorService(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    private ProfesorDTO convertirADTO(Profesor profesor) {
        return new ProfesorDTO(profesor.getIdProfesor(), profesor.getNombres(), profesor.getApellidos(), profesor.getEspecialidad());
    }

    public List<ProfesorDTO> obtenerTodos(String especialidad) {
        List<Profesor> profesores = (especialidad != null) ?
                profesorRepository.findByEspecialidad(especialidad) : profesorRepository.findAll();
        return profesores.stream().map(this::convertirADTO).collect(Collectors.toList());
    }

    public ProfesorDTO obtenerPorId(Long id) {
        return profesorRepository.findById(id)
                .map(this::convertirADTO)
                .orElse(null);
    }
}