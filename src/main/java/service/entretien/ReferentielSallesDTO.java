package service.entretien;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReferentielSallesDTO {
    private Map<String, ArrayList<Integer>> referentielSallesDTO;

    public Map<String, List<Integer>> getReferentielSalles() {
        ArrayList<Integer> listeDispo = new ArrayList<Integer>();
        listeDispo.add(1);
        listeDispo.add(2);
        listeDispo.add(3);

        return referentielSallesDTO;
    }
}
