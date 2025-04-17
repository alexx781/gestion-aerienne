package compagnie.model;

import java.util.*;

public class Statistiques {

    public static int compterVols(List<Vol> vols) {
        return vols.size();
    }

    public static int compterPassagersTransportes(List<Vol> vols) {
        int total = 0;
        for (Vol v : vols) {
            total += v.getNombreDePassagers();
        }
        return total;
    }

    public static Map<String, Integer> destinationsPopulaires(List<Vol> vols) {
        Map<String, Integer> map = new HashMap<>();
        for (Vol v : vols) {
            String dest = v.getDestination();
            map.put(dest, map.getOrDefault(dest, 0) + v.getNombreDePassagers());
        }
        return map;
    }
}
