package monprojet.entity;
import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/


@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Utilisation de l'héritage avec stratégie JOINED
@DiscriminatorColumn(name="employe_type")
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity

public class Employe {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer matricule;

    @NonNull
    private String nom;

    @Email
    private String email;

    @OneToOne
    private Employe superieur;

    @OneToMany
    private List<Employe> subordonne;
}