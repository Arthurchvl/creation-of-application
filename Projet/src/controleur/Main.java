package controleur;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import vue.*;
import modele.*;

public class Main extends Application{
	static private FenAccueil fAccueil;
	static private FenErreurRecherchePresonne fErreurRecherchePersonne;
	static private FenInfoPersonne fInfoPersonne;
	static private FenChangerTable fChangerTable;
	static private FenInfoTable fInfoTable;
	static private FenDeplacerTable fDeplacerTable;
	static private FenPlanDeTable fPlanTable;

	public void start(Stage f) throws Exception{
		Donnees.chargementDonnees();
		
		fAccueil = new FenAccueil();
		fErreurRecherchePersonne = new FenErreurRecherchePresonne();
		fInfoPersonne = new FenInfoPersonne();
		fChangerTable = new FenChangerTable();
		fInfoTable = new FenInfoTable();
		fDeplacerTable = new FenDeplacerTable();
		fPlanTable = new FenPlanDeTable();
		
		fAccueil.show();
		
	    Platform.runLater(() -> {
	        fAccueil.getBnAnnuler().requestFocus();
	    });
	}
	
	static public void main(String args[]) {
		Application.launch(args);
	}
	
	static public void fermerFenetre() {
		System.exit(0);
	}
	
	static public void ouvrirErreurRecherchePersonne(String nom, String prenom) {
		fErreurRecherchePersonne.chargerDonnees(nom, prenom);
		fErreurRecherchePersonne.show();
	}
	
	static public void ouvrirDetailNouvellePersonne(String nom, String prenom) {
		fErreurRecherchePersonne.close();
		fInfoPersonne.chargerTable(nom, prenom);
		fInfoPersonne.chargerDonnees(nom, prenom);
		fInfoPersonne.show();
	}
	
	static public void retourAccueil() {
		fErreurRecherchePersonne.close();
	}
	
	static public void ouvrirDetailPersonne(String nom, String prenom) {
		fInfoPersonne.chargerTable(nom, prenom);
		fInfoPersonne.chargerDonnees(nom, prenom);
		fInfoPersonne.show();
	}
	
	static public void refreshInfoPersonne(String nom, String prenom) {
		fInfoPersonne.chargerTable(nom, prenom);
	}
	
	static public void fermerInfoPersonne() {
		fAccueil.viderDonnees();
		fInfoPersonne.close();
	}
	
	static public void ouvrirChangerTablePersonne(String nom, String prenom, Integer noTable) {
		fChangerTable.chargerDonnees(nom, prenom, noTable);
		fChangerTable.show();
	}
	
	static public void fermerFenetreChangerTable() {
		fChangerTable.close();
	}
	
	static public void EnregistrerFenetreChangerTable(String nom, String prenom) {
		fChangerTable.close();
		fInfoPersonne.chargerTable(nom, prenom);
	}
	
	static public void ouvrirDetailTable(Integer noTable) {
		fInfoTable.chargerListePersonnes(noTable);
		fInfoTable.chargerDonnees(noTable);
		fInfoTable.show();
	}
	
	static public void rechargerInfoTable(Integer noTable) {
		fInfoTable.chargerDonnees(noTable);
		fInfoTable.chargerListePersonnes(noTable);
	}
	
	static public void fermerInfoTable() {
		fInfoTable.close();
	}
	
	static public void ourvirDeplacerTable(Integer noTable) {
		fDeplacerTable.chargerDonnees(noTable);
		fDeplacerTable.show();
	}
	
	static public void fermerDeplacerTable() {
		fDeplacerTable.close();
	}
	
	static public void EnregistrerDeplacementTable(Integer noTable) {
		fInfoTable.chargerListePersonnes(noTable);
		fDeplacerTable.close();
	}
	
	static public void ouvrirPlanDeTable() {
		fPlanTable.chargerDonnees();
		fPlanTable.show(); 
	}
	
	static public void retourAccueildepuisPlanTable() {
		fPlanTable.close();
	}
}