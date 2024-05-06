package monprojet.entity;



import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter @Setter @ToString
@Entity
@DiscriminatorValue("B")

public class Commercial extends Employe {
    @NonNull
    private float pourcentage;
}
