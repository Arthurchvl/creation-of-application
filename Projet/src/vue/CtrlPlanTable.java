package vue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import controleur.*;

public class CtrlPlanTable {

    @FXML
    protected Button bn1;

    @FXML
    protected Button bn10;

    @FXML
    protected Button bn11;

    @FXML
    protected Button bn12;

    @FXML
    protected Button bn13;

    @FXML
    protected Button bn14;

    @FXML
    protected Button bn15;

    @FXML
    protected Button bn16;

    @FXML
    protected Button bn17;

    @FXML
    protected Button bn18;

    @FXML
    protected Button bn19;

    @FXML
    protected Button bn2;

    @FXML
    protected Button bn20;

    @FXML
    protected Button bn21;

    @FXML
    protected Button bn22;

    @FXML
    protected Button bn23;

    @FXML
    protected Button bn24;

    @FXML
    protected Button bn25;

    @FXML
    protected Button bn26;

    @FXML
    protected Button bn27;

    @FXML
    protected Button bn28;

    @FXML
    protected Button bn29;

    @FXML
    protected Button bn3;

    @FXML
    protected Button bn30;

    @FXML
    protected Button bn4;

    @FXML
    protected Button bn5;

    @FXML
    protected Button bn6;

    @FXML
    protected Button bn7;

    @FXML
    protected Button bn8;

    @FXML
    protected Button bn9;
    
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
}
