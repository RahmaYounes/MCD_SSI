package monprojet.entity;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter @Setter @ToString
@Entity

public class Participation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String role;
    private float pourcentage;

    @ManyToOne
    @JoinColumn(name = "employe_matricule")
    private Employe employe;

    @ManyToOne
    @JoinColumn(name = "projet_code")
    private Projet projet;
}