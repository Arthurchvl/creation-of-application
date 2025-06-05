package vue;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import controleur.*;
import modele.*;

public class CtrlChangerTable {

    @FXML
    private Button bnAnnuler;

    @FXML
    private Button bnValider;

    @FXML
    private Label lblNom;

    @FXML
    private Label lblPrenom;
    
    @FXML 
    private ComboBox<String> listeTable;
    
    public void setLblPrenom(String txt) {
    	lblPrenom.setText(txt);
    }
    
    public void setLblNom(String txt) {
    	lblNom.setText(txt);
    }

    @FXML
    void validerChangementTable(ActionEvent event) {
    	Personne PersonneAChanger = new Personne(lblNom.getText(), lblPrenom.getText());
    	Integer nouvelleTable = Integer.parseInt(listeTable.getValue());
    	Donnees.changerTable(PersonneAChanger, nouvelleTable);
    	Main.EnregistrerFenetreChangerTable(PersonneAChanger.getNom(), PersonneAChanger.getPrenom());
    }

    @FXML
    void retourFenInfoPersonne(ActionEvent event) {
    	Main.fermerFenetreChangerTable();
    }
    
    public void initialize() {
    	listeTable.setItems(FXCollections.observableArrayList(
    			"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
    			"11", "12", "13", "14", "15",  "16", "17", "18", "19", "20",
    			"21", "22", "23", "24", "25",  "26", "27", "28", "29", "30"
    	));
    	listeTable.setValue("Numéro de table");
    }

}
