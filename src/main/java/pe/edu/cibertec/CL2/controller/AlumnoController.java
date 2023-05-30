package pe.edu.cibertec.CL2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
        if(alumnoList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        }
        return new ResponseEntity<>(alumnoList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
        public ResponseEntity<Alumno>obtenerAlumnoxId(@PathVariable("id") String id){


            return new ResponseEntity<>(alumnoService.buscarAlumnoId(id).get(),HttpStatus.OK);
        }
        @PostMapping()
        public ResponseEntity<Alumno> crearAlumno(@RequestBody Alumno alumno){
        Alumno newalumno =new Alumno();
        newalumno.setIdalumno(alumno.getIdalumno());
        newalumno.setApeAlumno(alumno.getApeAlumno());
        newalumno.setNomAlumno(alumno.getNomAlumno());
        newalumno.setIdEsp(alumno.getIdEsp());
        newalumno.setProce(alumno.getProce());
        return new ResponseEntity<>(alumnoService.registrar(newalumno),HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Alumno> ActulizarAlumno(@PathVariable("id") String id ,@RequestBody Alumno alumno){
        Alumno updateAlumno=alumnoService.buscarAlumnoId(id).get();
        updateAlumno.setApeAlumno(alumno.getApeAlumno());
        updateAlumno.setNomAlumno(alumno.getNomAlumno());
        updateAlumno.setIdEsp(alumno.getIdEsp());
        updateAlumno.setProce(alumno.getProce());
        return new ResponseEntity<>(alumnoService.registrar(updateAlumno),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?>eliminarAlumno(@PathVariable("id") String id){
        return ResponseEntity.status(HttpStatus.OK).body(alumnoService.eliminarxId(id));
    }

}
