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
    protected Button bnChangerTable;

    @FXML
    private Label lblPrenom;

    @FXML
    private Label lblNom;

    @FXML
    private Button bnRetour;

    @FXML
    protected Button bnEnleverTable;

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
    
	@FXML
    void enleverTablePersonne(ActionEvent event) {
    	Personne personneAenlever = new Personne(lblNom.getText(), lblPrenom.getText());
    	Alert confirmationEnleverTable = new Alert(
    			AlertType.CONFIRMATION,
    			"Confirmez la suppression de la table pour cette personne.",
    			ButtonType.YES,
    			ButtonType.NO
    	);
    	
    	confirmationEnleverTable.setTitle("Confirmation de suppression de table");
    	Optional<ButtonType> res = confirmationEnleverTable.showAndWait();
    	if (res.get() == ButtonType.YES) {
    		Donnees.enleverTablePersonne(personneAenlever);
    		Main.refreshInfoPersonne(personneAenlever.getNom(), personneAenlever.getPrenom());
    	}
    }
    
    @FXML
    void changerTablePersonne(ActionEvent event) {
    	Integer noTable;
    	if (lblTable.getText().equals("X")) {
    		noTable = 0;
    	}
    	else {
    		noTable = Integer.parseInt(lblTable.getText());
    	}
    	Main.ouvrirChangerTablePersonne(lblNom.getText(), lblPrenom.getText(), noTable);
    }
    
    @FXML
    void retourAccueil(ActionEvent event) {
    	Main.fermerInfoPersonne();
    }
    
    @FXML
    void supprimerPersonne(ActionEvent event) {
    	Alert confirmationSupprimerPersonne = new Alert(
    			AlertType.CONFIRMATION,
    			"Confirmez la suppression de cette personne.",
    			ButtonType.YES,
    			ButtonType.NO
    	);
    	
    	confirmationSupprimerPersonne.setTitle("Confirmation de suppression d'une personne");
    	Optional<ButtonType> res = confirmationSupprimerPersonne.showAndWait();
    	if (res.get() == ButtonType.YES) {
    		Personne personneAsupprimer = new Personne(lblNom.getText(), lblPrenom.getText());
        	Donnees.supprimerPersonneGala(personneAsupprimer);
        	Main.fermerInfoPersonne();
    	}
    }
}
