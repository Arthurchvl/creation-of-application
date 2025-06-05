package controleur;

import javafx.application.Application;
import javafx.stage.Stage;
import vue.*;
import modele.*;

public class Main extends Application{
	static private FenAccueil fAccueil;
	static private FenErreurRecherchePresonne fErreurRecherchePersonne;
	static private FenInfoPersonne fInfoPersonne;
	static private FenChangerTable fChangerTable;
	/*static private FenAjouterPersonne fAjouterPersonne;
	static private FenInfoTable fInfoTable;
	static private FenSupprimerPersonne fSupprimerPersonne ;
	static private FenSupprimerTable fSupprimerTable ;*/

	public void start(Stage f) throws Exception{
		Donnees.chargementDonnees();
		
		fAccueil = new FenAccueil();
		fErreurRecherchePersonne = new FenErreurRecherchePresonne();
		fInfoPersonne = new FenInfoPersonne();
		fChangerTable = new FenChangerTable();
		
		/*fAjouterPersonne = new FenAjouterPersonne();
		fInfoTable = new FenInfoTable();
		fSupprimerPersonne = new FenSupprimerPersonne();
		fSupprimerTable = new FenSupprimerTable();*/
		
		fAccueil.show();
	}
	
	static public void main(String args[]) {
		Application.launch(args);
	}
	
	static public void fermerFenetre() {
		System.exit(0);
	}
	
	static public void ouvrirDetailTable(Integer no_table) {
		System.out.println("Détail table "  + no_table + " ouverte");
	}
	
	static public void ouvrirErreurRecherchePersonne(String nom, String prenom) {
		fErreurRecherchePersonne.chargerDonnees(nom, prenom);
		fErreurRecherchePersonne.show();
	}
	
	static public void retourAccueil() {
		fErreurRecherchePersonne.close();
	}
	
	static public void ouvrirDetailPersonne(String nom, String prenom) {
		fInfoPersonne.chargerDonnees(nom, prenom);
		fInfoPersonne.show();
	}
	
	static public void fermerInfoPersonne() {
		fInfoPersonne.close();
	}
	
	static public void ouvrirChangerTablePersonne(String nom, String prenom) {
		fChangerTable.chargerDonnees(nom, prenom);
		fChangerTable.show();
	}
	
	static public void fermerFenetreChangerTable() {
		fChangerTable.close();
	}
	
	static public void EnregistrerFenetreChangerTable(String nom, String prenom) {
		fChangerTable.close();
		fInfoPersonne.close();
		fInfoPersonne.chargerDonnees(nom, prenom);
		fInfoPersonne.show();
	}
}