package modele;

import java.util.ArrayList;
import java.util.Map.Entry;
import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;

public class Donnees {
    private static ObservableMap<Personne, Integer> listeTables = FXCollections.observableHashMap();
    
    private static Integer TAILLE_PETITE_TABLE = 6;
    private static Integer TAILLE_GRANDE_TABLE = 12;
    private static Integer CHANGEMENT_TAILLE_TABLE = 10;
	
    public static void chargementDonnees() {
    	
		Personne jean = new Personne("Chauvel", "Jean");
		Personne jeanPierre = new Personne("Jean-pierre", "Pernault");
		Personne arthur = new Personne("chauvel", "arthur");
		Personne luc = new Personne("Durand", "Luc");
		Personne sophie = new Personne("Martin", "Sophie");
		Personne paul = new Personne("Bernard", "Paul");
		Personne nina = new Personne("Petit", "Nina");
		Personne hugo = new Personne("Robert", "Hugo");
		Personne emma = new Personne("Richard", "Emma");
		Personne leo = new Personne("Dubois", "Léo");
		Personne camille = new Personne("Moreau", "Camille");
		Personne tom = new Personne("Laurent", "Tom");
		Personne chloe = new Personne("Simon", "Chloé");
		Personne noe = new Personne("Michel", "Noé");
		Personne lina = new Personne("Garcia", "Lina");
		Personne axel = new Personne("David", "Axel");
		Personne mila = new Personne("Bertrand", "Mila");
		Personne nathan = new Personne("Roux", "Nathan");
		Personne alice = new Personne("Vincent", "Alice");
		Personne louis = new Personne("Fournier", "Louis");
		Personne elise = new Personne("Girard", "Élise");
		Personne clement = new Personne("Lambert", "Clément");
		Personne ines = new Personne("Bonnet", "Inès");
		Personne theo = new Personne("François", "Théo");
		Personne sarah = new Personne("Martinez", "Sarah");
		Personne mathis = new Personne("Lemoine", "Mathis");
		Personne jade = new Personne("Chevalier", "Jade");
		Personne enzo = new Personne("Aubry", "Enzo");
		Personne manon = new Personne("Leclerc", "Manon");
		Personne yanis = new Personne("Lopez", "Yanis");
		
		listeTables.put(jean,9);
		listeTables.put(jeanPierre,9);
		listeTables.put(arthur,9);
		listeTables.put(luc,9);
		listeTables.put(sophie,9);
		listeTables.put(paul,9);
		listeTables.put(nina,1);
		listeTables.put(hugo,1);
		listeTables.put(emma,1);
		listeTables.put(leo,1);
		listeTables.put(camille,1);
		listeTables.put(tom,1);
		listeTables.put(chloe,13);
		listeTables.put(noe,13);
		listeTables.put(lina,30);
		listeTables.put(axel,23);
		listeTables.put(mila,29);
		listeTables.put(nathan,6);
		listeTables.put(alice,8);
		listeTables.put(louis,10);
		listeTables.put(elise,30);
		listeTables.put(clement,20);
		listeTables.put(ines,0);
		listeTables.put(theo,25);
		listeTables.put(sarah,15);
		listeTables.put(mathis,27);
		listeTables.put(jade,0);
		listeTables.put(enzo,18);
		listeTables.put(manon,16);
		listeTables.put(yanis,13);
		
	}
	
	static public void ajouterPersonne(Personne p) { 
		listeTables.put(p,0); 
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
		return listeTables.containsKey(p);
	}
	
	static public void enleverTablePersonne(Personne p) {
		if (listeTables.containsKey(p)) {
			listeTables.remove(p);
		}
		listeTables.put(p, 0);
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
	    else if (noTable != 0 && noTable > CHANGEMENT_TAILLE_TABLE && compteur < TAILLE_GRANDE_TABLE) {
	        listeTables.remove(p);
	        listeTables.put(p, noTable);
	    }
	    else {
	        Alert tablePleine = new Alert(
	            AlertType.ERROR,
	            "La table ne peut plus recevoir de personnes.",
	            ButtonType.OK
	        );

	        tablePleine.setTitle("Confirmation de suppression de table");
	        tablePleine.showAndWait();
	    }
	}
	
	static public void supprimerPersonneGala(Personne p) {
		listeTables.remove(p);
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
	
	static public void viderTable(Integer noTable) {
		ArrayList<Personne> personnes = getlistePersonnesDansUneTable(noTable);
		
		for (Personne pT : personnes) {
			enleverTablePersonne(pT);
		}
	}
	
	static public Integer getNbPlaceDisponibles(Integer noTable) {
		Integer placesDispo = 0;
		Integer compteur = 0;
		for (Entry<Personne, Integer> entry : listeTables.entrySet()) {
	    	if (entry.getValue().equals(noTable)) {
	    		compteur++;
	    	}
		}
		
		if (noTable <= CHANGEMENT_TAILLE_TABLE) {
			placesDispo = TAILLE_PETITE_TABLE - compteur;
		}
		else {
			placesDispo = TAILLE_GRANDE_TABLE - compteur;
		}
		return placesDispo;
	}
	
	static public void DeplacerPersonneTable(Integer noTableInitiale, Integer noNouvelleTable) {
		ArrayList<Personne> personnes = getlistePersonnesDansUneTable(noTableInitiale);
		
		for (Personne pT : personnes) {
			changerTable(pT, noNouvelleTable);
		}
	}
}