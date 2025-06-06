package vue;

import controleur.*;
import modele.*;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class CtrlAccueil {

    @FXML public TextField txtPrenom;
    @FXML private Button bnValider;
    @FXML private Button bnAnnuler;
    @FXML public TextField txtNom;
    @FXML private ComboBox<String> listeTable;

    @FXML
    void ouvrirFenetre(ActionEvent event) {
    	if (txtNom.getText().isEmpty() && txtPrenom.getText().isEmpty()) {
    		Main.ouvrirDetailTable(Integer.parseInt(listeTable.getValue()));
    	} else {
    		Personne personneATrouver = new Personne(txtNom.getText(), txtPrenom.getText()) ;
    		if (Donnees.contient(personneATrouver)) {
        		Main.ouvrirDetailPersonne(personneATrouver.getNom(), personneATrouver.getPrenom());
    		}
    		else {
    			Main.ouvrirErreurRecherchePersonne(personneATrouver.getNom(), personneATrouver.getPrenom());
    		}
    	}
    }

    @FXML
    void fermerProgramme(ActionEvent event) {
    	Main.fermerFenetre();
    }
    
    public void initialize() {
    	listeTable.setItems(FXCollections.observableArrayList(
    			"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
    			"11", "12", "13", "14", "15",  "16", "17", "18", "19", "20",
    			"21", "22", "23", "24", "25",  "26", "27", "28", "29", "30"
    	));
    	listeTable.setValue("Numéro de table");
    	
    	/*bnValider.disableProperty().bind(
    			txtNom.textProperty().isEmpty()
    	);
    	bnValider.disableProperty().bind(
    			txtPrenom.textProperty().isEmpty()
    	);*/
    }
}
