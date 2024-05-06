package monprojet.entity;
import java.time.LocalDate;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;

import lombok.*;

@Getter @Setter @ToString
@Entity

@NoArgsConstructor
@RequiredArgsConstructor

public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;

   
    @DateTimeFormat
    private LocalDate dateDebut;
    
    @NonNull
    private String nom;


    @DateTimeFormat
    private LocalDate dateFin;


}