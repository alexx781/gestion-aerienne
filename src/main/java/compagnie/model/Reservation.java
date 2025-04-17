package compagnie.model;

public class Reservation {
    private String numeroReservation;
    private Passager passager;
    private Vol vol;

    public Reservation(String numeroReservation, Passager passager, Vol vol) {
        this.numeroReservation = numeroReservation;
        this.passager = passager;
        this.vol = vol;
    }

    public String getNumeroReservation() {
        return numeroReservation;
    }

    public String obtenirInfos() {
        return "Réservation: " + numeroReservation + ", Vol: " + vol.getNumeroVol() + ", Passager: " + passager.getNom();
    }
}
