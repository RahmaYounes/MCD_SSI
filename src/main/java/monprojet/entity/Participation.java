package monprojet.entity;


import jakarta.persistence.*;

import lombok.*;

@Getter @Setter @ToString
@Entity

public class Participation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String role;

    @NonNull
    private float pourcentage;

    @ManyToOne
    private Employe employe;

    @ManyToOne
    private Projet projet;
}