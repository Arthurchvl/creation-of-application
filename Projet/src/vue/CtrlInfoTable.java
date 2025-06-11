package vue;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Alert.AlertType;
import modele.*;

import java.util.Optional;

import controleur.*;

public class CtrlInfoTable {

    @FXML private Button bnRetour;

    @FXML protected Button bnVider;
    
    @FXML protected Button bnDeplacer;

    @FXML private Label lblTable;
    
    public void setLblTable(String txt) {
    	lblTable.setText(txt);
    }

    @FXML protected ListView<String> listePersonnes;
    protected ObservableList<String> items = FXCollections.observableArrayList();

    @FXML
    void deplacerTable(ActionEvent event) {
    	Integer noTable = Integer.parseInt(lblTable.getText());
    	Main.ourvirDeplacerTable(noTable);
    }

    @FXML
    void retourAcceuil(ActionEvent event) {
    	Main.fermerInfoTable();
    }
    
    @FXML 
    void viderTable(ActionEvent event) {
    	Integer noTable = Integer.parseInt(lblTable.getText());
    	Alert confirmationEnleverTable = new Alert(
    			AlertType.CONFIRMATION,
    			"Confirmez de vider la table",
    			ButtonType.YES,
    			ButtonType.NO
    	);
    	
    	confirmationEnleverTable.setTitle("Confirmation vider la table");
    	Optional<ButtonType> res = confirmationEnleverTable.showAndWait();
    	if (res.get() == ButtonType.YES) {
    		Donnees.viderTable(noTable);
        	Main.rechargerInfoTable(noTable);
    	}
    }
}
