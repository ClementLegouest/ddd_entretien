package com.esgi.ddd.entretien.use_case;

import com.esgi.ddd.entretien.common.dto.DispoSalleDTO;

import java.util.List;

public interface ReferentielDispoSalles {

    DispoSalleDTO recuperer(Integer idSalle);
}
