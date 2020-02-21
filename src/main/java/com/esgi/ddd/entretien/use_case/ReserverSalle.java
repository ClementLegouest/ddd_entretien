package com.esgi.ddd.entretien.use_case;

import com.esgi.ddd.entretien.common.dto.DispoSalleDTO;
import com.esgi.ddd.entretien.infrastructure.RecupererDispoSalles;
import com.esgi.ddd.entretien.model.Salle;

import java.util.Date;

public class ReserverSalle {

    public static Salle reserverSalle(Integer idSalle, Date date) throws Exception {
        ReferentielDispoSalles referentielDispoSalles = new RecupererDispoSalles();
        DispoSalleDTO dispoSalle = referentielDispoSalles.recuperer(idSalle);

        if (dispoSalle.getDispo() == null) {
            throw new Exception();
        }

        for (int i = 0; i < dispoSalle.getDispo().size(); i++) {
            if (dispoSalle.getDispo().get(i) == date) {
                throw new Exception();
            }
        }

        dispoSalle.setDisponibilite(date);

        return new Salle(idSalle, date);
    }
}
