package service.entretien;

import java.time.Duration;
import java.time.LocalDateTime;

public class CreneauDTO {
    private LocalDateTime date;
    private Duration duree;

    public CreneauDTO(LocalDateTime localDateTime, Duration duration) {
        this.date = localDateTime;
        this.duree = duration;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Duration getDuree() {
        return duree;
    }
}
