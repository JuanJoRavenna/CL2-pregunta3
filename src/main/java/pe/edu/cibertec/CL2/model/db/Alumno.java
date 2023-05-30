package pe.edu.cibertec.CL2.model.db;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "estado")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAlumno;

    @Column(name = "ApeAlumno")
    private String ApeAlumno;
    @Column(name = "NomAlumno")
    private String NomAlumno;
    @Column(name = "IdEsp")
    private String IdEsp;
    @Column(name = "Proce")
    private String Proce;
}
