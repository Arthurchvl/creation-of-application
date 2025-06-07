package vue;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import modele.*;
import controleur.*;

public class CtrlInfoTable {

    @FXML private Button bnRetour;

    @FXML private Button bnVider;
    
    @FXML private Button bndeplacer;

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
    	Donnees.viderTable(noTable);
    	Main.rechargerInfoTable(noTable);
    }
    
    public void initialize() {
    	//bnVider.disableProperty().bind(Bindings.isEmpty(items));
    }
}
