package compagnie.model;

import java.util.*;

public class Passager extends Personne {
    private List<Reservation> reservations;

    public Passager(String id, String nom, String prenom) {
        super(id, nom, prenom);
        this.reservations = new ArrayList<>();
    }

    public void reserverVol(Vol vol) {
        Reservation res = new Reservation(UUID.randomUUID().toString(), this, vol);
        reservations.add(res);
        vol.ajouterReservation(res);
    }

    public void annulerReservation(String numeroReservation) {
        reservations.removeIf(r -> r.getNumeroReservation().equals(numeroReservation));
    }

    public List<Reservation> obtenirReservations() {
        return reservations;
    }
}
