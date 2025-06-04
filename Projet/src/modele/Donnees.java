package modele;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Donnees {
    private static ObservableList<Personne> listePersonnes = FXCollections.observableArrayList();

	public static void chargementDonnees() {
		Personne jeanPierre = new Personne("Chauvel", "Jean");
		Personne jeanPierre2 = new Personne("Jean-pierre", "Pernault1");
		Personne jeanPierre1 = new Personne("Jean-pierre", "Pernault12");
		
		listePersonnes.add(jeanPierre);
		listePersonnes.add(jeanPierre2);
		listePersonnes.add(jeanPierre1);
		
	}
	
	static public ObservableList<Personne> getListePersonnes() { return listePersonnes; }
	
	static public void ajouterPersonne(Personne p) { listePersonnes.add(p); }
	
	static public void supprimerPersonne(Personne p) {
		if (p != null) {
			for (Personne pTemp : listePersonnes) {
				if (pTemp.equals(p)) {
					listePersonnes.remove(p);
				}
			}
		}
	}
	
	static public boolean contient(Personne p) {
		boolean estPresent = false;
		for (Personne pT : listePersonnes) {
			String nom = pT.getNom();
			String prenom = pT.getPrenom();
			if (nom.equals(p.getNom()) && prenom.equals(p.getPrenom())) {
				estPresent = true;
			}
		}
		return estPresent;
	}
}