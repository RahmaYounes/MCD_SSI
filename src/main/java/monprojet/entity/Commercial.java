package monprojet.entity;



import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter @Setter @ToString
@Entity

public class Commercial extends Employe {
    @PositiveOrZero
    private float pourcentage;
}
