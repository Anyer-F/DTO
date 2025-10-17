package com.umg.gestionacademica.service;

import org.springframework.stereotype.Service;

import com.umg.gestionacademica.model.Alumno;
import com.umg.gestionacademica.repository.AlumnoRepository;
import com.umg.gestionacademica.dto.AlumnoDTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlumnoService {
    private final AlumnoRepository alumnoRepository;

    public AlumnoService(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    private AlumnoDTO convertirADTO(Alumno alumno) {
        return new AlumnoDTO(alumno.getIdAlumno(), alumno.getNombres(), alumno.getApellidos(), alumno.getEdad());
    }

    public List<AlumnoDTO> obtenerTodos(String apellidos) {
        List<Alumno> alumnos = (apellidos != null) ?
                alumnoRepository.findByApellidos(apellidos) : alumnoRepository.findAll();
        return alumnos.stream().map(this::convertirADTO).collect(Collectors.toList());
    }

    public AlumnoDTO obtenerPorId(Long id) {
        return alumnoRepository.findById(id)
                .map(this::convertirADTO)
                .orElse(null);
    }
}