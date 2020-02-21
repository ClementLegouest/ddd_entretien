package model;

import model.entretien.Entretien;
import model.entretien.StatutEntretien;
import model.profil.StatutProfil;
import org.junit.jupiter.api.Test;
import service.entretien.CreneauDTO;
import service.entretien.ReferentielSallesDTO;
import service.profil.ProfilDTO;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EntretienTest {

    @Test
    public void testEntretien() {
        Entretien entretien = new Entretien(new CreneauDTO(LocalDateTime.of(2020, 03, 11, 14, 25), Duration.ofHours(2)),
                                            new ReferentielSallesDTO(3, 10, 4),
                                            new ProfilDTO(15, StatutProfil.RECRUTEUR),
                                            new ProfilDTO(3, StatutProfil.CANDIDAT));

        assertNotNull(entretien);
        assertNotNull(entretien.getSalle());
        assertNotNull(entretien.getCreneau());
        assertTrue(entretien.getDate().isAfter(LocalDateTime.now()));
        assertTrue(entretien.getRecruteurExperience() > entretien.getCandidatExperience());
    }

    @Test
    public void testConfirmer() {

        ArrayList<String> participants = new ArrayList<String>();
        participants.add("Sarah");
        participants.add("Latifa");

        Entretien entretien = new Entretien(new CreneauDTO(LocalDateTime.of(2020, 03, 11, 14, 25), Duration.ofHours(2)),
                new ReferentielSallesDTO(3, 10, 4),
                new ProfilDTO(15, StatutProfil.RECRUTEUR),
                new ProfilDTO(3, StatutProfil.CANDIDAT));

        entretien.setStatut(StatutEntretien.PLANNIFIE);
        entretien.confirmer();
        assertEquals(entretien.getStatut(), StatutEntretien.CONFIRMER);

        entretien.setStatut(StatutEntretien.CONFIRMER);
        entretien.confirmer();
        assertEquals(entretien.getStatut(), StatutEntretien.CONFIRMER);

        entretien.setStatut(StatutEntretien.ANNULLER);
        entretien.confirmer();
        assertEquals(entretien.getStatut(), StatutEntretien.ANNULLER);
    }

    @Test
    public void testAnnuler() {
        ArrayList<String> participants = new ArrayList<String>();
        participants.add("Sarah");
        participants.add("Latifa");

        Entretien entretien = new Entretien(new CreneauDTO(LocalDateTime.of(2020, 03, 11, 14, 25), Duration.ofHours(2)),
                new ReferentielSallesDTO(3, 10, 4),
                new ProfilDTO(15, StatutProfil.RECRUTEUR),
                new ProfilDTO(3, StatutProfil.CANDIDAT));

        entretien.setStatut(StatutEntretien.PLANNIFIE);
        entretien.annuler("Voici une raison.");
        assertEquals(entretien.getStatut(), StatutEntretien.ANNULLER);

        entretien.setStatut(StatutEntretien.CONFIRMER);
        entretien.annuler("Voici une raison.");
        assertEquals(entretien.getStatut(), StatutEntretien.ANNULLER);

        entretien.setStatut(StatutEntretien.ANNULLER);
        entretien.annuler("Voici une raison.");
        assertEquals(entretien.getStatut(), StatutEntretien.ANNULLER);
    }
}