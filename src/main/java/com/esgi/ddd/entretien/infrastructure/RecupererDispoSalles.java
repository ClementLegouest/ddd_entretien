package com.esgi.ddd.entretien.infrastructure;

import com.esgi.ddd.entretien.common.dto.DispoSalleDTO;
import com.esgi.ddd.entretien.use_case.ReferentielDispoSalles;
import java.util.ArrayList;
import java.util.Date;

public class RecupererDispoSalles implements ReferentielDispoSalles {
    private static ArrayList<Date> dispoSalle = null;

    @Override
    public DispoSalleDTO recuperer(Integer idSalle) {
        switch (idSalle) {
            case 1:
                dispoSalle = new ArrayList<Date>();
                for (int i = 8; i < 13; i++) {
                    dispoSalle.add(new Date(2020, 2, i));
                }
                return new DispoSalleDTO(dispoSalle);
            case 2:
                dispoSalle = new ArrayList<Date>();
                for (int i = 8; i < 10; i++) {
                    dispoSalle.add(new Date(2020, 2, i));
                }
                return new DispoSalleDTO(dispoSalle);
            default:
                return new DispoSalleDTO(dispoSalle);
        }
    }
}
