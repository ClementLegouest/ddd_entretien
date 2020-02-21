package model.entretien;

import service.entretien.CreneauDTO;

import java.time.Duration;
import java.time.LocalDateTime;

class Creneau {
    private LocalDateTime date;
    private Duration duree;

    public Creneau(CreneauDTO creneauDTO) throws Exception {

        if (duree.isNegative()) {
            throw new Exception("La durée d'un créneau doit être positive.");
        }

        if ( date.getHour() <= 8 || date.getHour() >= 18 ) {
            throw new Exception("L'entretien doit se dérouler durant les heures de bureau");
        }

        this.date = creneauDTO.getDate();
        this.duree = creneauDTO.getDuree();
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Duration getDuree() {
        return duree;
    }

    public boolean equals(Creneau creneau) {
        if (this.date == creneau.getDate() && this.duree == creneau.getDuree()) {
            return true;
        } else {
            return false;
        }
    }
}
