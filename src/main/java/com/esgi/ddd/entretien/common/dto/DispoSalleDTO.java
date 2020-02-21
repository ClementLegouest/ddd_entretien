package com.esgi.ddd.entretien.common.dto;

import java.util.ArrayList;
import java.util.Date;

public class DispoSalleDTO {
    ArrayList<Date> disponibilites;

    public DispoSalleDTO(ArrayList<Date> disponibilites) {
        this.disponibilites = disponibilites;
    }

    public ArrayList<Date> getDispo() {
        return disponibilites;
    }

    public void setDisponibilite(Date jour) {
        this.disponibilites.add(jour);
    }
}
