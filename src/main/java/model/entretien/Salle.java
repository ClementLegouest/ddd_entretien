package model.entretien;

import service.entretien.ReferentielSallesDTO;

class Salle {
    private int etage;
    private int numero;
    private int capacite;

    public Salle(Integer etage, Integer numero, Integer capacite) throws Exception{

        if (capacite <= 0) {
            throw new Exception("Une salle doit avoir une capacité positive.");
        }

        this.etage = etage;
        this.numero = numero;
        this.capacite = capacite;
    }

    public int getEtage() {
        return etage;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacite() {
        return capacite;
    }

    public boolean equals(Salle salle) {
        if (this.etage == salle.getEtage()
                && this.numero == salle.getNumero()
                && this.capacite == salle.getCapacite()) {
            return true;
        } else {
            return false;
        }
    }
}
