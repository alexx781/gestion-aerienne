package compagnie.model;

public class Personne {
    protected String id;
    protected String nom;
    protected String prenom;

    public Personne(String id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }

    public void setNom(String nom) { this.nom = nom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String obtenirInfos() {
        return "ID: " + id + ", Nom: " + nom + ", Prénom: " + prenom;
    }
}
