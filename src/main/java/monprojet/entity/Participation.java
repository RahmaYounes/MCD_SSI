package monprojet.entity;


import jakarta.persistence.*;

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