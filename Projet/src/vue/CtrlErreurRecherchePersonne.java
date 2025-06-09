package vue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import modele.*;
import controleur.*;

public class CtrlErreurRecherchePersonne {

    @FXML
    private Label lblPrenom;

    @FXML
    private Label lblNom;

    @FXML
    private Button bnRetour;

    @FXML
    private Button BnAjouter;
    
    public void setLblPrenom(String txt) {
    	lblPrenom.setText(txt);
    }
    
    public void setLblNom(String txt) {
    	lblNom.setText(txt);
    }

    @FXML
    void fermerPageErreurrecherchePersonne(ActionEvent event) {
    	Main.retourAccueil();
    }

    @FXML
    void ajouterNouvellePersonne(ActionEvent event) {
    	Personne personneEntree = new Personne(lblNom.getText(), lblPrenom.getText());
    	Donnees.ajouterPersonne(personneEntree);
    	Main.ouvrirDetailPersonne(personneEntree.getNom(), personneEntree.getPrenom());
    }
	
}
