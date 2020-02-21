package model.entretien;

import model.profil.Profil;
import service.entretien.CreneauDTO;
import service.entretien.ReferentielSallesDTO;
import service.profil.ProfilDTO;

import java.time.Duration;
import java.time.LocalDateTime;

public class Entretien {
    private LocalDateTime date;
    private Duration duree;
    private String idEntretien;

    private EntretienID entretienID = new EntretienID();
    private Creneau creneau;
    private Salle salle;
    private Profil recruteur;
    private Profil candidat;
    private StatutEntretien statut = StatutEntretien.PLANNIFIE;

    public Entretien(LocalDateTime localDateTime, Duration duration) {
        this.date = localDateTime;
        this.duree = duration;
    }

    public EntretienID getEntretienID() {
        return entretienID;
    }

    public Creneau getCreneau() {
        return creneau;
    }
    public LocalDateTime getDate() { return creneau.getDate(); }
    public Duration getDuree() { return  creneau.getDuree(); }

    public Salle getSalle() {
        return salle;
    }
    public Integer getCapaciteSalle() { return salle.getCapacite(); }
    public  Integer getEtageSalle() { return salle.getEtage(); }

    public Profil getRecruteur() {
        return recruteur;
    }
    public Integer getRecruteurExperience() { return recruteur.getExpérience(); }
    public Profil getCandidat() {
        return candidat;
    }
    public Integer getCandidatExperience() { return candidat.getExpérience(); }

    public StatutEntretien getStatut() {
        return statut;
    }

    public void setStatut(StatutEntretien statut) {
        this.statut = statut;
    }

    public String getIdEntretien() {
        return idEntretien;
    }

    public void setIdEntretien(String idEntretien) {
        this.idEntretien = idEntretien;
    }

    public boolean equals(Entretien entretien) {
        if (this == entretien) {
            return true;
        } else {
            return false;
        }
    }

    public void confirmer() {
        if(statut == StatutEntretien.PLANNIFIE)
            statut = StatutEntretien.CONFIRMER;
    }

    public void annuler(String raison) {
        if (statut != StatutEntretien.ANNULLER)
            statut = StatutEntretien.ANNULLER;
    }
}
