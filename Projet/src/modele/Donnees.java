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
		Personne clara = new Personne("Renard", "Clara");
		Personne lucas = new Personne("Marchand", "Lucas");
		Personne julie = new Personne("Guillaume", "Julie");
		Personne maxime = new Personne("Collet", "Maxime");
		Personne lea = new Personne("Maillard", "Léa");
		Personne theoB = new Personne("Perrot", "Théo");
		Personne zoe = new Personne("Blanc", "Zoé");
		Personne bastien = new Personne("Paris", "Bastien");
		Personne anais = new Personne("Perrin", "Anaïs");
		Personne gabriel = new Personne("Faure", "Gabriel");
		Personne eva = new Personne("Andre", "Eva");
		Personne romain = new Personne("Noël", "Romain");
		Personne julia = new Personne("Pires", "Julia");
		Personne arnaud = new Personne("Delattre", "Arnaud");
		Personne lena = new Personne("Cousin", "Léna");
		Personne kevin = new Personne("Boyer", "Kévin");
		Personne lucie = new Personne("Delaunay", "Lucie");
		Personne quentin = new Personne("Poulain", "Quentin");
		Personne amelie = new Personne("Texier", "Amélie");
		Personne tim = new Personne("Baron", "Tim");
		Personne elsa = new Personne("Rolland", "Elsa");
		Personne tomas = new Personne("Gilbert", "Tomas");
		Personne jadeM = new Personne("Vidal", "Jade");
		Personne theoL = new Personne("Lemoine", "Théo");
		Personne emilie = new Personne("Renaud", "Émilie");
		Personne leaM = new Personne("Benoit", "Léa");
		Personne lucien = new Personne("Meyer", "Lucien");
		Personne claraB = new Personne("Roussel", "Clara");
		Personne thomas = new Personne("Henry", "Thomas");
		Personne elodie = new Personne("Jacquet", "Élodie");
		Personne nicolas = new Personne("Gonzalez", "Nicolas");
		Personne laura = new Personne("Roger", "Laura");
		Personne julien = new Personne("Charles", "Julien");
		Personne celia = new Personne("Germain", "Célia");
		Personne sebastien = new Personne("Navarro", "Sébastien");
		Personne florence = new Personne("Masson", "Florence");
		Personne adrien = new Personne("Bouchet", "Adrien");
		Personne alexia = new Personne("Bertin", "Alexia");
		Personne bastienM = new Personne("Barre", "Bastien");
		Personne margot = new Personne("Lejeune", "Margot");
		Personne simon = new Personne("Laporte", "Simon");
		Personne juliette = new Personne("Besson", "Juliette");
		Personne yasmine = new Personne("Benard", "Yasmine");
		Personne damien = new Personne("Giraud", "Damien");
		Personne lucasD = new Personne("Pascal", "Lucas");
		Personne emmaR = new Personne("Leger", "Emma");
		Personne hugues = new Personne("Colin", "Hugues");
		Personne aline = new Personne("Bailly", "Aline");
		Personne antonin = new Personne("Marin", "Antonin");
		Personne estelle = new Personne("Jacques", "Estelle");
		Personne gael = new Personne("Chartier", "Gaël");
		Personne laetitia = new Personne("Gil", "Laetitia");
		Personne corentin = new Personne("Brun", "Corentin");
		Personne nadia = new Personne("Loiseau", "Nadia");
		Personne olivier = new Personne("Bourgeois", "Olivier");
		
		listeTables.put(jean,12);
		listeTables.put(jeanPierre,12);
		listeTables.put(arthur,12);
		listeTables.put(luc,12);
		listeTables.put(sophie,12);
		listeTables.put(paul,12);
		listeTables.put(nina,1);
		listeTables.put(hugo,1);
		listeTables.put(emma,1);
		listeTables.put(leo,1);
		listeTables.put(camille,1);
		listeTables.put(tom,1);
		listeTables.put(chloe,13);
		listeTables.put(noe,13);
		listeTables.put(lina,12);
		listeTables.put(axel,12);
		listeTables.put(mila,12);
		listeTables.put(nathan,12);
		listeTables.put(alice,12);
		listeTables.put(louis,12);
		listeTables.put(elise,30);
		listeTables.put(clement,20);
		listeTables.put(ines,3);
		listeTables.put(theo,25);
		listeTables.put(sarah,15);
		listeTables.put(mathis,27);
		listeTables.put(jade,27);
		listeTables.put(enzo,18);
		listeTables.put(manon,16);
		listeTables.put(yanis,13);
		listeTables.put(clara,9);
		listeTables.put(lucas,9);
		listeTables.put(julie,9);
		listeTables.put(maxime,16);
		listeTables.put(lea,18);
		listeTables.put(theoB,20);
		listeTables.put(zoe,13);
		listeTables.put(bastien,13);
		listeTables.put(anais,13);
		listeTables.put(gabriel,15);
		listeTables.put(eva,15);
		listeTables.put(romain,15);
		listeTables.put(julia,16);
		listeTables.put(arnaud,16);
		listeTables.put(lena,16);
		listeTables.put(kevin,18);
		listeTables.put(lucie,18);
		listeTables.put(quentin,20);
		listeTables.put(amelie,20);
		listeTables.put(tim,25);
		listeTables.put(elsa,25);
		listeTables.put(tomas,27);
		listeTables.put(jadeM,27);
		listeTables.put(theoL,27);
		listeTables.put(leaM,27);
		listeTables.put(lucien,27);
		listeTables.put(claraB,27);
		listeTables.put(thomas,27);
		listeTables.put(elodie,27);
		listeTables.put(nicolas,2);
		listeTables.put(laura,3);
		listeTables.put(julien,3);
		listeTables.put(celia,11);
		listeTables.put(sebastien,3);
		listeTables.put(florence,3);
		listeTables.put(adrien,3);
		listeTables.put(alexia,4);
		listeTables.put(bastienM,4);
		listeTables.put(margot,4);
		listeTables.put(simon,4);
		listeTables.put(juliette,4);
		listeTables.put(yasmine,4);
		listeTables.put(damien,13);
		listeTables.put(lucasD,13);
		listeTables.put(emmaR,15);
		listeTables.put(hugues,15);
		listeTables.put(aline,16);
		listeTables.put(antonin,18);
		listeTables.put(estelle,18);
		listeTables.put(gael,20);
		listeTables.put(laetitia,25);
		listeTables.put(corentin,25);
		listeTables.put(nadia,27);
		listeTables.put(olivier,27);
		listeTables.put(emilie,30);
		
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