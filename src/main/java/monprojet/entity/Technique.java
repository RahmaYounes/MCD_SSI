package monprojet.entity;

import jakarta.persistence.*;

import lombok.*;

@Getter @Setter  @ToString
@Entity
@DiscriminatorValue("C")

public class Technique extends Employe {

    @NonNull
    private float montantPrime;
}
