package pe.edu.cibertec.CL2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.CL2.model.db.Alumno;

@Repository
public interface AlumnoRepository
        extends JpaRepository<Alumno, String> {
}

