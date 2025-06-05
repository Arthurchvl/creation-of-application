package vue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import modele.*;

import java.util.Optional;

import controleur.*;

public class CtrlInfoPersonne {

    @FXML
    private Label lblTable;

    @FXML
    private Button bnChangerTable;

    @FXML
    private Label lblPrenom;

    @FXML
    private Label lblNom;

    @FXML
    private Button bnRetour;

    @FXML
    private Button bnEnleverTable;

    @FXML
    private Button bnSupprimerPersonne;
    
    public void setLblPrenom(String txt) {
    	lblPrenom.setText(txt);
    }
    
    public void setLblNom(String txt) {
    	lblNom.setText(txt);
    }
    
    public void setLblTable(String txt) {
    	lblTable.setText(txt);
    }
    
    @SuppressWarnings("unlikely-arg-type")
	@FXML
    void enleverTablePersonne(ActionEvent event) {
    	Personne personneAenlever = new Personne(lblNom.getText(), lblPrenom.getText());
    	Alert confirmationEnleverTable = new Alert(
    			AlertType.CONFIRMATION,
    			"Confirmez la suppression de la tabe pour cette personne.",
    			ButtonType.YES,
    			ButtonType.NO
    	);
    	confirmationEnleverTable.setTitle("Confirmation de suppression de table");
    	Optional<ButtonType> res = confirmationEnleverTable.showAndWait();
    	if (res.equals(ButtonType.YES)) {
    		Donnees.enleverTablePersonne(personneAenlever);
    		lblTable.setText("X");
    	}
    }
    
    @FXML
    void changerTablePersonne(ActionEvent event) {
    	Main.ouvrirChangerTablePersonne(lblNom.getText(), lblPrenom.getText());
    }
    
    @FXML
    void retourAccueil(ActionEvent event) {
    	Main.fermerInfoPersonne();
    }

}
