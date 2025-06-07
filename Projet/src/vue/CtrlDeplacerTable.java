package vue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import modele.*;

import controleur.*;

public class CtrlDeplacerTable {

    @FXML
    private Button bnAnnuler;

    @FXML
    private Button bnValider;

    @FXML
    private Label lblTable;
    
    public void setLblTable(String txt) {
    	lblTable.setText(txt);
    }

    @FXML protected ComboBox<String> listeTable;

    @FXML
    void retourInfoTable(ActionEvent event) {
    	Main.fermerDeplacerTable();
    }
    
    @FXML
    void validerDeplacerTable(ActionEvent event) {
    	Integer noTableInitiale = Integer.parseInt(lblTable.getText());
    	Integer noNouvelleTable = Integer.parseInt(listeTable.getValue());
    	Donnees.DeplacerPersonneTable(noTableInitiale, noNouvelleTable);
    	Main.EnregistrerDeplacementTable(noTableInitiale);
    }
}
