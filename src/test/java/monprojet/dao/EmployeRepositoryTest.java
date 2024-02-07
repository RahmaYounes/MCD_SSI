package monprojet.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import monprojet.entity.*;


@Log4j2 // Génère le 'logger' pour afficher les messages de trace
@DataJpaTest
class EmployeRepositoryTest {

    @Autowired
    private EmployeRepository dao;

    @Test
    void onTrouveUnEmployeParSonNom() {
        log.info("On peut trouver un employé par son nom (requête dans le repository)");
        Employe employe = dao.findByNom("Rémi Bastide");
        assertNotNull(employe, "On doit trouver l'employé Rémi Bastide dans data.sql");
        assertEquals("Remi.Bastide@univ-jfc.fr", employe.getEmail());
    }

    @Test
     void testCalculateTotalParticipationPercentage() {
        // Insérer des données dans la base de données (utilisez data.sql pour cela)

        // Calculer le pourcentage total de participation de l'employé avec matricule 1
        Float totalParticipationPercentage = dao.calculateTotalParticipationPercentage(1);

        // Vérifier que le pourcentage total est correct (faites des assertions appropriées en fonction des données insérées)
        assertEquals(30.0f, totalParticipationPercentage, 0.01f);
    }
}



