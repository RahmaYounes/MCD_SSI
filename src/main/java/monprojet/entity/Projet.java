package monprojet.entity;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;

import lombok.*;

@Getter @Setter @ToString
@Entity

public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;

    @NonNull
    private String nom;

    @NonNull
    private LocalDate debut;

    private LocalDate fin;

    @ToString.Exclude

    @OneToMany(mappedBy = "projet")
    private List<Participation> participations;
}