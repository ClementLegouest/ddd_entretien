package service.entretien;

import model.entretien.Entretien;

import java.time.Duration;
import java.time.LocalDateTime;

public class EntretienRecrutementDAO {

    public static Entretien lireEntretien(String entretienID) {
        Entretien entretien = new Entretien(LocalDateTime.of(2020, 3, 11, 14, 15), Duration.ofHours(2));

        return entretien;
    }
}
