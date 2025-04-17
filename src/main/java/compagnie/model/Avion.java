package compagnie.model;

import java.util.*;

public class Avion {
    private String id;
    private String modele;
    private List<Vol> volsAssignes;

    public Avion(String id, String modele) {
        this.id = id;
        this.modele = modele;
        this.volsAssignes = new ArrayList<>();
    }

    public void affecterVol(Vol vol) {
        volsAssignes.add(vol);
    }

    public boolean verifierDisponibilite(Date date) {
        for (Vol v : volsAssignes) {
            if (v.date.equals(date)) {
                return false;
            }
        }
        return true;
    }
}
