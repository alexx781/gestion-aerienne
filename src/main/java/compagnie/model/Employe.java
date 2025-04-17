package compagnie.model;

public class Employe extends Personne {
    protected String role;

    public Employe(String id, String nom, String prenom, String role) {
        super(id, nom, prenom);
        this.role = role;
    }

    public String obtenirRole() {
        return role;
    }

    public void setRole(String role) { this.role = role; }
}
