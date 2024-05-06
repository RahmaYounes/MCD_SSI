package monprojet.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Getter@Setter@ToString
@Entity
public class Participation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idParticipation;

    private String role;

    private float pourcentage;

    @ManyToMany
    private List<Projet> projets;

    @ManyToMany
    private List<Employe> employes;
}