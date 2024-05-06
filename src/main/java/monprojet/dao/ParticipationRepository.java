package monprojet.dao;

import monprojet.entity.Employe;
import monprojet.entity.Participation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ParticipationRepository extends JpaRepository<Participation, Integer> {

    @Query("SELECT SUM(p.pourcentage) FROM Participation p JOIN p.projets pr JOIN p.employes e WHERE e.matricule = :matricule AND pr.dateFin IS NULL")
    public float totalParticipation(Integer matricule);

}