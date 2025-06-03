package vue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import modele.*;

public class CtrlErreurRecherchePersonne {

    @FXML
    private Label lblPrenom;

    @FXML
    private Label lblNom;

    @FXML
    private Button bnRetour;

    @FXML
    private Button BnAjouter;

    @FXML
    void fermerPageErreurrecherchePersonne(ActionEvent event) {
    	controleur.Main.retourAccueil();
    }

    @FXML
    void ajouterNouvellePersonne(ActionEvent event) {
    	Personne personneEntree = new Personne(lblNom.getText(), lblPrenom.getText());
    	if (modele.Donnees.contient(personneEntree)){
    		controleur.Main.ouvrirDetailPersonne(personneEntree.getNom(), personneEntree.getPrenom());
    	}
    }
}
