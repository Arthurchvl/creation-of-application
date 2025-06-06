package modele;

import java.util.Map;
import java.util.Map.Entry;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

public class Donnees {
    private static ObservableList<Personne> listePersonnes = FXCollections.observableArrayList();
    private static ObservableList<Personne> listePersonnesSansTable = FXCollections.observableArrayList();
    private static ObservableMap<Personne, Integer> listeTables = FXCollections.observableHashMap();
	
    public static void chargementDonnees() {
    	
		Personne jeanPierre = new Personne("Chauvel", "Jean");
		Personne jeanPierre2 = new Personne("Jean-pierre", "Pernault1");
		Personne jeanPierre1 = new Personne("chauvel", "arthur");
		
		listePersonnes.add(jeanPierre);
		listePersonnes.add(jeanPierre2);
		listePersonnes.add(jeanPierre1);
		
		listePersonnesSansTable.add(jeanPierre);
		listePersonnesSansTable.add(jeanPierre2);
		listeTables.put(jeanPierre1,12);
	}
	
	static public ObservableList<Personne> getListePersonnes() {
		return listePersonnes;
	}
	
	static public void ajouterPersonne(Personne p) { 
		listePersonnes.add(p); 
	}
	
	static public void supprimerPersonne(Personne p) {
		if (p != null) {
			if (listePersonnes.contains(p)) {
				listePersonnes.remove(p);
			}
		}
	}
	
	static public Integer getTable(Personne p) {
		Integer noTable = 0;
		for (Entry<Personne, Integer> entry : listeTables.entrySet()) {
			if (entry.getKey().toString().equals(p.toString())) {
				noTable = entry.getValue();
			}
		}
		return noTable;
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
		if (listeTables.containsKey(p)) {
			listeTables.remove(p);
		}
		listePersonnesSansTable.add(p);
	}
	
	static public void changerTable(Personne p, Integer noTable) {
		listeTables.remove(p);
		listeTables.put(p, noTable);
	}
	
	static public void supprimerPersonneGala(Personne p) {
		listeTables.remove(p);
		supprimerPersonne(p);
		p.setNom(null);
		p.setPrenom(null);
		
		System.out.println("Liste des personnes après suppression : ");
	    for (Map.Entry<Personne, Integer> entry : listeTables.entrySet()) {
	        System.out.println(entry.getKey() + " = " + entry.getValue());
	    }
	}
}