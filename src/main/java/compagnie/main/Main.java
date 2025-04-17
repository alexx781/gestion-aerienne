package compagnie.main;

import compagnie.model.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pilote pilote = new Pilote("P001", "Dupont", "Jean");
        PersonnelCabine pc1 = new PersonnelCabine("C001", "Martin", "Claire");
        PersonnelCabine pc2 = new PersonnelCabine("C002", "Lemoine", "Luc");
        List<PersonnelCabine> equipage = Arrays.asList(pc1, pc2);

        Avion avion = new Avion("A320", "Airbus A320");
        Vol vol1 = new Vol("V100", new Date(), "Paris");

        if (avion.verifierDisponibilite(vol1.date)) {
            vol1.affecterVol(avion, pilote, equipage);
            avion.affecterVol(vol1);
        }

        Passager passager = new Passager("PS001", "Bernard", "Sophie");
        passager.reserverVol(vol1);

        System.out.println(passager.obtenirInfos());
        for (Reservation r : passager.obtenirReservations()) {
            System.out.println(r.obtenirInfos());
        }

        System.out.println(vol1.obtenirVol());

        List<Vol> tousLesVols = new ArrayList<>();
        tousLesVols.add(vol1);

        System.out.println("\n=== Statistiques ===");
        System.out.println("Nombre de vols : " + Statistiques.compterVols(tousLesVols));
        System.out.println("Passagers transportés : " + Statistiques.compterPassagersTransportes(tousLesVols));
        System.out.println("Destinations populaires : " + Statistiques.destinationsPopulaires(tousLesVols));
    }
}
