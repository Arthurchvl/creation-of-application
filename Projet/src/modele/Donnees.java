package modele;

import java.util.ArrayList;
import java.util.Map.Entry;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;

public class Donnees {
    private static ObservableList<Personne> listePersonnes = FXCollections.observableArrayList();
    private static ObservableList<Personne> listePersonnesSansTable = FXCollections.observableArrayList();
    private static ObservableMap<Personne, Integer> listeTables = FXCollections.observableHashMap();
    
    private static Integer TAILLE_PETITE_TABLE = 6;
    private static Integer TAILLE_GRANDE_TABLE = 12;
    private static Integer CHANGEMENT_TAILLE_TABLE = 10;
	
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
		Integer compteur = 0;
	    for (Entry<Personne, Integer> entry : listeTables.entrySet()) {
	    	if (entry.getValue().equals(noTable)) {
	    		compteur++;
	    	}
	    }
	    
	    if (noTable != 0 && noTable <= CHANGEMENT_TAILLE_TABLE && compteur < TAILLE_PETITE_TABLE) {
			listeTables.remove(p);
			listeTables.put(p, noTable);
	    }
	    else {
	    	Alert petiteTablePleine = new Alert(
	    			AlertType.ERROR,
	    			"La table ne peut plus recevoir de personnes.",
	    			ButtonType.OK
	    	);
	    	
	    	petiteTablePleine.setTitle("Confirmation de suppression de table");
	    	petiteTablePleine.showAndWait();
	    }
	    
	    if (noTable != 0 && noTable > CHANGEMENT_TAILLE_TABLE && compteur < TAILLE_GRANDE_TABLE) {
			listeTables.remove(p);
			listeTables.put(p, noTable);
	    }
	    else {
	    	Alert grandeTablePleine = new Alert(
	    			AlertType.ERROR,
	    			"La table ne peut plus recevoir de personnes.",
	    			ButtonType.OK
	    	);
	    	
	    	grandeTablePleine.setTitle("Confirmation de suppression de table");
	    	grandeTablePleine.showAndWait();
	    }
	}
	
	static public void supprimerPersonneGala(Personne p) {
		listeTables.remove(p);
		supprimerPersonne(p);
		p.setNom(null);
		p.setPrenom(null);
	}
	
	static public ArrayList<Personne> getlistePersonnesDansUneTable(Integer noTable) {
		ArrayList<Personne> personnes = new ArrayList<Personne>(12);
		for (Entry<Personne, Integer> entry : listeTables.entrySet()) {
	    	if (entry.getValue().equals(noTable)) {
	    		personnes.add(entry.getKey());
	    	}
	    }
		return personnes;
	}
}