package pe.edu.cibertec.CL2.model.db;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "alumno")
public class Alumno {

    @Id
    private String idalumno;

    @Column(name = "apealumno")
    private String apeAlumno;
    @Column(name = "nomalumno")
    private String nomAlumno;
    @Column(name = "idesp")
    private String idEsp;
    @Column(name = "proce")
    private String proce;
}
