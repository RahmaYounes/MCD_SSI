package monprojet.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import monprojet.entity.*;
import java.util.List;
import monprojet.entity.*;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.jdbc.Sql;


@Log4j2 // Génère le 'logger' pour afficher les messages de trace
@DataJpaTest
class EmployeRepositoryTest {

    @Autowired
    private EmployeRepository dao;


    @Test
    void TrouverUnEmployeParSonNom() {
        log.info("Trouver un employé par son nom: ");
        Employe employe = dao.findByNom("Elyes Lamine");
        assertNotNull(employe, "Le mail de l'employé Elyes Lamine ");
        assertEquals("Elyes.Lamine@univ-jfc.fr", employe.getEmail());
    }
    @Test
    void TrouverUnEmployeParSonMatricule() {
        log.info("Trouver un employé par son matricule:");
        Employe employe = dao.findByMatricule(2);
        assertNotNull(employe, "On doit trouver l'employé Rémi Bastide dans data.sql");
        assertEquals("Remi.Bastide@univ-jfc.fr", employe.getEmail());
    }

}

