package model.profil;

import service.profil.ProfilDTO;

public class Profil {
    private Integer experience;
    private StatutProfil statutProfil;

    public Profil(ProfilDTO profilDTO) {
        this.experience = profilDTO.getExpérience();
        this.statutProfil = profilDTO.getStatutProfil();
    }

    public Integer getExpérience() {
        return experience;
    }

    public StatutProfil getStatutProfil() {
        return statutProfil;
    }
}
