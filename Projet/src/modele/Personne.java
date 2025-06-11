package modele;

import java.util.Objects;

public class Personne{
    private int id;
    private static int compteur = 0;
    private String nom;
    private String prenom;

    public Personne(String nom, String prenom){
        this.id = compteur++;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    /*public boolean equals(Personne p) {
    	return ((this.getNom() == p.getNom()) && (this.getPrenom() == p.getPrenom()) );
    }*/
    
    
    @Override
	public int hashCode() {
		return Objects.hash(nom, prenom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		return Objects.equals(nom, other.nom) && Objects.equals(prenom, other.prenom);
	}

	public String toString() {
    	return this.nom + " " + this.prenom;
    }
    
    public void afficher() {
    	System.out.println(this.toString());
    }
}