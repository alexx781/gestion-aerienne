package compagnie.model;

import java.util.*;

public class Vol {
    private String numeroVol;
    public Date date;
    private String destination;
    private Avion avion;
    private Pilote pilote;
    private List<PersonnelCabine> equipage;
    private List<Reservation> reservations;

    public Vol(String numeroVol, Date date, String destination) {
        this.numeroVol = numeroVol;
        this.date = date;
        this.destination = destination;
        this.reservations = new ArrayList<>();
        this.equipage = new ArrayList<>();
    }

    public String getNumeroVol() { return numeroVol; }
    public String getDestination() { return destination; }

    public void affecterVol(Avion avion, Pilote pilote, List<PersonnelCabine> equipage) {
        this.avion = avion;
        this.pilote = pilote;
        this.equipage = equipage;
    }

    public String obtenirVol() {
        return "Vol: " + numeroVol + ", Date: " + date + ", Destination: " + destination + ", Pilote: " + pilote.getNom();
    }

    public void planifierVol(List<Vol> planning, Vol vol) {
        planning.add(vol);
    }

    public void annulerVol(List<Vol> planning) {
        planning.remove(this);
    }

    public void ajouterReservation(Reservation r) {
        reservations.add(r);
    }

    public int getNombreDePassagers() {
        return reservations.size();
    }
}
