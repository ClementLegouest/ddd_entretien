package service.profil;

import model.profil.StatutProfil;

public class ProfilDTO {
    private Integer experience;
    private StatutProfil statutProfil;

    public ProfilDTO(Integer experience, StatutProfil statutProfil) {
        this.experience = experience;
        this.statutProfil = statutProfil;
    }

    public Integer getExpérience() {
        return experience;
    }

    public StatutProfil getStatutProfil() {
        return statutProfil;
    }
}
