package com.esgi.ddd.entretien.model;

import java.util.Date;

public class Salle {
    Integer idSalle;
    Date jour;

    public Salle(Integer idSalle, Date jour) {
        this.idSalle = idSalle;
        this.jour = jour;
    }

    public Integer getIdSalle() {
        return idSalle;
    }

    public Date getjour() {
        return this.jour;
    }
}
