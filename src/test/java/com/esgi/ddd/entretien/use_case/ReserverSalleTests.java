package com.esgi.ddd.entretien.use_case;

import com.esgi.ddd.entretien.model.Salle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class ReserverSalleTests {

    @Test
    void reserverSalleAvecHoraireDispo() {
        ReserverSalle reserverSalle = new ReserverSalle();
        Salle salle = null;

        try {
            salle = reserverSalle.reserverSalle(2, new Date(2020, 3, 20));
        } catch (Exception e) {
            return;
        }
        Assertions.assertNotNull(salle);
    }

    @Test
    void reserverSalleNonExistante() {
        ReserverSalle reserverSalle = new ReserverSalle();

        try {
            Salle salle = reserverSalle.reserverSalle(3, new Date(2020, 3, 9));
            Assertions.fail();
        } catch (Exception e) {
            // ça marche
            Assertions.assertTrue(true);
        }
    }

    @Test
    void reserverSalleAvecJourOccupe() {
        ReserverSalle reserverSalle = new ReserverSalle();

        try {
            Salle salle = reserverSalle.reserverSalle(1, new Date(2020, 2, 8));
            Assertions.fail();
        } catch (Exception e) {
            // ça marche
            Assertions.assertTrue(true);
        }
    }
}
