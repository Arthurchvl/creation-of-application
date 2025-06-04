package controleur;

import javafx.application.Application;
import javafx.stage.Stage;
import vue.*;
import modele.*;

public class Main extends Application{
	static private FenAccueil fAccueil;
	static private FenErreurRecherchePresonne fErreurRecherchePersonne;

	public void start(Stage f) throws Exception{
		Donnees.chargementDonnees();
		
		fAccueil = new FenAccueil();
		fErreurRecherchePersonne = new FenErreurRecherchePresonne();
		fAccueil.show();
	}
	
	static public void main(String args[]) {
		Application.launch(args);
	}
	
	static public void fermerFenetre() {
		System.exit(0);
	}
	
	static public void ouvrirDetailPersonne(String nom, String prenom) {
		System.out.println("Ouverture du détail de " + nom + " " + prenom);
	}
	
	static public void ouvrirDetailTable(Integer no_table) {
		System.out.println("Détail table "  + no_table + " ouverte");
	}
	
	static public void ouvrirErreurRecherchePersonne(String nom, String prenom) {
		CtrlErreurRecherchePersonne.chargerNom(nom);
		CtrlErreurRecherchePersonne.chargerPrenom(prenom);
		fErreurRecherchePersonne.show();
	}
	
	static public void retourAccueil() {
		fErreurRecherchePersonne.close();
	}
}