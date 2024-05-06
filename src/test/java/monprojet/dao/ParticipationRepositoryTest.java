package monprojet.dao;

import lombok.extern.log4j.Log4j2;
import monprojet.entity.Employe;
import monprojet.entity.Participation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Log4j2 // Génère le 'logger' pour afficher les messages de trace
@DataJpaTest
public class ParticipationRepositoryTest {

    @Autowired
    private ParticipationRepository participationRepository;

    @Test
    void LePourcentageDeParticipation() {
        float participation = participationRepository.totalParticipation(2);
        assertEquals(50,participation);
        System.out.println("Le pourcentage de participation est de "+ participation +" %");
    }
}