package vue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import controleur.*;

public class CtrlInfoTable {

    @FXML
    private Button bnRetour;

    @FXML
    private Button bnVider;

    @FXML
    private Label lblTable;
    
    public void setLblTable(String txt) {
    	lblTable.setText(txt);
    }

    @FXML
    protected ListView<String> listePersonnes;

    @FXML
    void deplacerTable(ActionEvent event) {

    }

    @FXML
    void retourAcceuil(ActionEvent event) {
    	Main.fermerInfoTable();
    }
    
    @FXML 
    void viderTable(ActionEvent event) {
    	
    }

}
