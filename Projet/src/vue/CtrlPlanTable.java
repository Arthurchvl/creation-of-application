package vue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import modele.Donnees;
import controleur.*;

public class CtrlPlanTable {

    @FXML
    private Button bn1;

    @FXML
    private Button bn10;

    @FXML
    private Button bn11;

    @FXML
    private Button bn12;

    @FXML
    private Button bn13;

    @FXML
    private Button bn14;

    @FXML
    private Button bn15;

    @FXML
    private Button bn16;

    @FXML
    private Button bn17;

    @FXML
    private Button bn18;

    @FXML
    private Button bn19;

    @FXML
    private Button bn2;

    @FXML
    private Button bn20;

    @FXML
    private Button bn21;

    @FXML
    private Button bn22;

    @FXML
    private Button bn23;

    @FXML
    private Button bn24;

    @FXML
    private Button bn25;

    @FXML
    private Button bn26;

    @FXML
    private Button bn27;

    @FXML
    private Button bn28;

    @FXML
    private Button bn29;

    @FXML
    private Button bn3;

    @FXML
    private Button bn30;

    @FXML
    private Button bn4;

    @FXML
    private Button bn5;

    @FXML
    private Button bn6;

    @FXML
    private Button bn7;

    @FXML
    private Button bn8;

    @FXML
    private Button bn9;
    
    @FXML
    private Button BnRetour;

    @FXML
    void ouvrirInfoTable(ActionEvent event) {
    	Button bnAppuie = (Button) event.getSource();
    	Integer noTable = Integer.parseInt(bnAppuie.getText());
    	Main.ouvrirDetailTable(noTable);
    }

    @FXML
    void retourAccueil(ActionEvent event) {
    	Main.retourAccueildepuisPlanTable();
    }
    
    public void initialize() {
    	if (Donnees.getNbPlaceDisponibles(1) == 0) {
    		bn1.setTextFill(Color.RED);
    		System.out.println(Donnees.getNbPlaceDisponibles(1));
    	} else {
    		bn1.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(2) == 0) {
    		bn2.setTextFill(Color.RED);
    	} else {
    		bn2.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(3) == 0) {
    		bn3.setTextFill(Color.RED);
    	} else {
    		bn3.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(4) == 0) {
    		bn4.setTextFill(Color.RED);
    	} else {
    		bn4.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(5) == 0) {
    		bn5.setTextFill(Color.RED);
    	} else {
    		bn5.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(6) == 0) {
    		bn6.setTextFill(Color.RED);
    	} else {
    		bn6.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(7) == 0) {
    		bn7.setTextFill(Color.RED);
    	} else {
    		bn7.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(8) == 0) {
    		bn8.setTextFill(Color.RED);
    	} else {
    		bn8.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(9) == 0) {
    		bn9.setTextFill(Color.RED);
    	} else {
    		bn9.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(10) == 0) {
    		bn10.setTextFill(Color.RED);
    	} else {
    		bn10.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(11) == 0) {
    		bn11.setTextFill(Color.RED);
    	} else {
    		bn11.setTextFill(Color.BLUE);
    	}    	
    	if (Donnees.getNbPlaceDisponibles(12) == 0) {
    		bn12.setTextFill(Color.RED);
    	} else {
    		bn12.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(13) == 0) {
    		bn13.setTextFill(Color.RED);
    		System.out.println(Donnees.getNbPlaceDisponibles(1));
    	} else {
    		bn13.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(14) == 0) {
    		bn14.setTextFill(Color.RED);
    	} else {
    		bn14.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(15) == 0) {
    		bn15.setTextFill(Color.RED);
    	} else {
    		bn15.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(16) == 0) {
    		bn16.setTextFill(Color.RED);
    	} else {
    		bn16.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(17) == 0) {
    		bn17.setTextFill(Color.RED);
    	} else {
    		bn17.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(18) == 0) {
    		bn18.setTextFill(Color.RED);
    	} else {
    		bn18.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(19) == 0) {
    		bn19.setTextFill(Color.RED);
    	} else {
    		bn19.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(20) == 0) {
    		bn20.setTextFill(Color.RED);
    	} else {
    		bn20.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(21) == 0) {
    		bn21.setTextFill(Color.RED);
    	} else {
    		bn21.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(22) == 0) {
    		bn22.setTextFill(Color.RED);
    	} else {
    		bn22.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(23) == 0) {
    		bn23.setTextFill(Color.RED);
    	} else {
    		bn23.setTextFill(Color.BLUE);
    	}    	
    	if (Donnees.getNbPlaceDisponibles(24) == 0) {
    		bn24.setTextFill(Color.RED);
    	} else {
    		bn24.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(25) == 0) {
    		bn25.setTextFill(Color.RED);
    	} else {
    		bn25.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(26) == 0) {
    		bn26.setTextFill(Color.RED);
    	} else {
    		bn26.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(27) == 0) {
    		bn27.setTextFill(Color.RED);
    	} else {
    		bn27.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(28) == 0) {
    		bn28.setTextFill(Color.RED);
    	} else {
    		bn28.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(29) == 0) {
    		bn29.setTextFill(Color.RED);
    	} else {
    		bn29.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(30) == 0) {
    		bn30.setTextFill(Color.RED);
    	} else {
    		bn30.setTextFill(Color.BLUE);
    	}    	
    }
}
