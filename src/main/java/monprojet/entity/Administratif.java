package monprojet.entity;



import jakarta.persistence.*;

import lombok.*;

@Getter @Setter  @ToString
@Entity
@DiscriminatorValue("A")

public class Administratif extends Employe {
    private String diplome;
}
