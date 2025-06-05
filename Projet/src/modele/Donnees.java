package modele;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

@SuppressWarnings("unused")
public class Donnees {
    private static ObservableList<Personne> listePersonnes = FXCollections.observableArrayList();
    private static ObservableList<Personne> listePersonnesSansTable = FXCollections.observableArrayList();
    private static ObservableMap<Integer, GroupePersonnes> listeTables = FXCollections.observableHashMap();
	
    public static void chargementDonnees() {
    	
		Personne jeanPierre = new Personne("Chauvel", "Jean");
		Personne jeanPierre2 = new Personne("Jean-pierre", "Pernault1");
		Personne jeanPierre1 = new Personne("Jean-pierre", "Pernault12");
		
		listePersonnes.add(jeanPierre);
		listePersonnes.add(jeanPierre2);
		listePersonnes.add(jeanPierre1);
		
		listePersonnesSansTable.add(jeanPierre);
		listePersonnesSansTable.add(jeanPierre2);
		listePersonnesSansTable.add(jeanPierre1);
	}
	
	static public ObservableList<Personne> getListePersonnes() {
		return listePersonnes;
	}
	
	static public void ajouterPersonne(Personne p) { 
		listePersonnes.add(p); 
	}
	
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
	
	static public void enleverTablePersonne(Personne p) {
		listePersonnesSansTable.add(p);
	}
}