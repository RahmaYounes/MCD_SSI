package monprojet.entity;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter @Setter @ToString
@Entity

public class Projet {
    @Id
    private int code;
    private String nom;
    private LocalDate debut;
    private LocalDate fin;

    @OneToMany(mappedBy = "projet")
    private List<Participation> participations;
}