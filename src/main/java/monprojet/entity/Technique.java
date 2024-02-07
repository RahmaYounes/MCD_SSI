package monprojet.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter @Setter  @ToString
@Entity

public class Technique extends Employe {
    private float montantPrime;
}
