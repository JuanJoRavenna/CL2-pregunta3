package pe.edu.cibertec.CL2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.CL2.model.db.Alumno;
import pe.edu.cibertec.CL2.service.AlumnoService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("")
    public ResponseEntity<List<Alumno>> listarAlumnos(){
        List<Alumno> alumnoList=new ArrayList<>();
        alumnoService.listarAlumnos().forEach(alumnoList::add);
    }
}
