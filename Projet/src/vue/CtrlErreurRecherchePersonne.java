package vue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import modele.*;
import controleur.*;

public class CtrlErreurRecherchePersonne {
	static private String Nom;
	static private String Prenom;

    @FXML
    private Label lblPrenom;

    @FXML
    private static Label lblNom;

    @FXML
    private Button bnRetour;

    @FXML
    private Button BnAjouter;

    @FXML
    void fermerPageErreurrecherchePersonne(ActionEvent event) {
    	Main.retourAccueil();
    }

    @FXML
    void ajouterNouvellePersonne(ActionEvent event) {
    	Personne personneEntree = new Personne(lblNom.getText(), lblPrenom.getText());
    	Donnees.ajouterPersonne(personneEntree);
    	for (Personne pT : Donnees.getListePersonnes()) { pT.afficher();}
    	Main.retourAccueil();
    }

	public static void chargerNom(String nom) {
		Nom = nom;
	}
	public static void chargerPrenom(String prenom) {
		Prenom = prenom;
	}
	
	public void initialize() {
		
		Personne personneACharger = new Personne(Nom, Prenom);
		System.out.println("Personne à charger : ");
		personneACharger.afficher();
	}

}
