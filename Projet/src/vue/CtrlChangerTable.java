package vue;

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
    protected ComboBox<String> listeTable;
    
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

}
