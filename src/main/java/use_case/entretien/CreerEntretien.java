package use_case.entretien;

import model.entretien.Entretien;
import service.entretien.EntretienRecrutementDAO;

import java.time.Duration;
import java.time.LocalDateTime;

public class CreerEntretien {

    void creerEntretien(String idEntretien,
                        String nomCandidat,
                        String nomConsultantRecruteur,
                        String nomSalle) {

        Entretien entretien = EntretienRecrutementDAO.lireEntretien(idEntretien);

        if (entretien == null) {
            entretien = new Entretien(LocalDateTime.of(2020, 03, 12, 8, 30), Duration.ofHours(2));
            entretien.setIdEntretien(idEntretien);
        }

        if (nomCandidat != null) {
            entretien.
        }
    }
}
