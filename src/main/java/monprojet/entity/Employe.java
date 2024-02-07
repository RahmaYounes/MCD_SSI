package monprojet.entity;
import java.time.LocalDate;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringExclude;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/


@Inheritance(strategy = InheritanceType.JOINED) // Utilisation de l'héritage avec stratégie JOINED

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity

public class Employe {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer matricule;

    @NonNull
    private String nom;


    // Test
    
    @Email
    private String email;

   // @ManyToMany (mappedBy = "contributeur")
   // List<Projet> affectation;

   // @ManyToOne
   // private Employe superieur;

}
