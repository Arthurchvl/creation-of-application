package vue;

import controleur.*;
import modele.*;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class CtrlAccueil {

    @FXML public TextField txtPrenom;
    @FXML private Button bnValider;
    @FXML private Button bnAnnuler;
    @FXML public TextField txtNom;
    @FXML private ComboBox<String> listeTable;

    @FXML
    void ouvrirFenetre(ActionEvent event) {
    	if ( (listeTable.getValue().equals("0") == false) && (txtNom.getText().isEmpty() && txtPrenom.getText().isEmpty()) == false ) {
    		Alert multipleFaconsRecherchesSelectionnees = new Alert(
	    			AlertType.ERROR,
	    			"Veuillez ne rentrer que la personne et mettre la recherche de table sur 0 où vider les champs nom et prenom.",
	    			ButtonType.OK
	    	);
	    	
    		multipleFaconsRecherchesSelectionnees.setTitle("Erreur dans la recherche");
    		multipleFaconsRecherchesSelectionnees.showAndWait();
    	}
    	else if ((listeTable.getValue().equals("0")) && (txtNom.getText().isEmpty() && txtPrenom.getText().isEmpty())) {
    		Alert zeroFaconsRechercheSelectionnees = new Alert(
	    			AlertType.ERROR,
	    			"Veuillez ne rentrer que la personne et mettre la recherche de table sur 0 où vider les champs nom et prenom.",
	    			ButtonType.OK
	    	);
	    	
    		zeroFaconsRechercheSelectionnees.setTitle("Erreur dans la recherche");
    		zeroFaconsRechercheSelectionnees.showAndWait();
    	}
    	else if (txtNom.getText().isEmpty() || txtPrenom.getText().isEmpty()) {
    		Alert personneIncomplete = new Alert(
	    			AlertType.ERROR,
	    			"Veuillez rentrer le nom ET le prenom de la personne.",
	    			ButtonType.OK
	    	);
	    	
    		personneIncomplete.setTitle("Erreur dans la recherche");
    		personneIncomplete.showAndWait();
    	}
    	else if (txtNom.getText().isEmpty() && txtPrenom.getText().isEmpty()) {
    		Main.ouvrirDetailTable(Integer.parseInt(listeTable.getValue()));
    	}
    	else {
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
    			"0","1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
    			"11", "12", "13", "14", "15",  "16", "17", "18", "19", "20",
    			"21", "22", "23", "24", "25",  "26", "27", "28", "29", "30"
    	));
    	listeTable.setValue("0");
    	
    	/*bnValider.disableProperty().bind(
    			txtNom.textProperty().isEmpty()
    	);
    	bnValider.disableProperty().bind(
    			txtPrenom.textProperty().isEmpty()
    	);*/
    }
}
