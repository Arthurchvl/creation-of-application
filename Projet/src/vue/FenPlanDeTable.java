package vue;

import java.io.File;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import modele.Donnees;

public class FenPlanDeTable extends Stage {
	private CtrlPlanTable ctrl;
	
	public FenPlanDeTable() throws IOException{
		this.setTitle("PLAN DE TABLE");
		this.setResizable(false);
		
		Scene laScene = new Scene(creerSceneGraph());
		this.setScene(laScene);
	}

	private Pane creerSceneGraph() throws IOException {
		File fichier = new File("/Users/arthurchauvel/Desktop/cours/SAES/S201/Code/FXML/planDeTable.fxml");
		FXMLLoader loader;
		loader = new FXMLLoader(fichier.toURI().toURL());
        Pane root = new Pane();
		root = loader.load();
		ctrl = loader.getController();
     	return root;
	}
	
	public void chargerDonnees() {
    	if (Donnees.getNbPlaceDisponibles(1) == 0) {
    		ctrl.bn1.setTextFill(Color.RED);
    		System.out.println(Donnees.getNbPlaceDisponibles(1));
    	} else {
    		ctrl.bn1.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(2) == 0) {
    		ctrl.bn2.setTextFill(Color.RED);
    	} else {
    		ctrl.bn2.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(3) == 0) {
    		ctrl.bn3.setTextFill(Color.RED);
    	} else {
    		ctrl.bn3.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(4) == 0) {
    		ctrl.bn4.setTextFill(Color.RED);
    	} else {
    		ctrl.bn4.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(5) == 0) {
    		ctrl.bn5.setTextFill(Color.RED);
    	} else {
    		ctrl.bn5.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(6) == 0) {
    		ctrl.bn6.setTextFill(Color.RED);
    	} else {
    		ctrl.bn6.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(7) == 0) {
    		ctrl.bn7.setTextFill(Color.RED);
    	} else {
    		ctrl.bn7.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(8) == 0) {
    		ctrl.bn8.setTextFill(Color.RED);
    	} else {
    		ctrl.bn8.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(9) == 0) {
    		ctrl.bn9.setTextFill(Color.RED);
    	} else {
    		ctrl.bn9.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(10) == 0) {
    		ctrl.bn10.setTextFill(Color.RED);
    	} else {
    		ctrl.bn10.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(11) == 0) {
    		ctrl.bn11.setTextFill(Color.RED);
    	} else {
    		ctrl.bn11.setTextFill(Color.BLUE);
    	}    	
    	if (Donnees.getNbPlaceDisponibles(12) == 0) {
    		ctrl.bn12.setTextFill(Color.RED);
    	} else {
    		ctrl.bn12.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(13) == 0) {
    		ctrl.bn13.setTextFill(Color.RED);
    		System.out.println(Donnees.getNbPlaceDisponibles(1));
    	} else {
    		ctrl.bn13.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(14) == 0) {
    		ctrl.bn14.setTextFill(Color.RED);
    	} else {
    		ctrl.bn14.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(15) == 0) {
    		ctrl.bn15.setTextFill(Color.RED);
    	} else {
    		ctrl.bn15.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(16) == 0) {
    		ctrl.bn16.setTextFill(Color.RED);
    	} else {
    		ctrl.bn16.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(17) == 0) {
    		ctrl.bn17.setTextFill(Color.RED);
    	} else {
    		ctrl.bn17.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(18) == 0) {
    		ctrl.bn18.setTextFill(Color.RED);
    	} else {
    		ctrl.bn18.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(19) == 0) {
    		ctrl.bn19.setTextFill(Color.RED);
    	} else {
    		ctrl.bn19.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(20) == 0) {
    		ctrl.bn20.setTextFill(Color.RED);
    	} else {
    		ctrl.bn20.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(21) == 0) {
    		ctrl.bn21.setTextFill(Color.RED);
    	} else {
    		ctrl.bn21.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(22) == 0) {
    		ctrl.bn22.setTextFill(Color.RED);
    	} else {
    		ctrl.bn22.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(23) == 0) {
    		ctrl.bn23.setTextFill(Color.RED);
    	} else {
    		ctrl.bn23.setTextFill(Color.BLUE);
    	}    	
    	if (Donnees.getNbPlaceDisponibles(24) == 0) {
    		ctrl.bn24.setTextFill(Color.RED);
    	} else {
    		ctrl.bn24.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(25) == 0) {
    		ctrl.bn25.setTextFill(Color.RED);
    	} else {
    		ctrl.bn25.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(26) == 0) {
    		ctrl.bn26.setTextFill(Color.RED);
    	} else {
    		ctrl.bn26.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(27) == 0) {
    		ctrl.bn27.setTextFill(Color.RED);
    	} else {
    		ctrl.bn27.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(28) == 0) {
    		ctrl.bn28.setTextFill(Color.RED);
    	} else {
    		ctrl.bn28.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(29) == 0) {
    		ctrl.bn29.setTextFill(Color.RED);
    	} else {
    		ctrl.bn29.setTextFill(Color.BLUE);
    	}
    	if (Donnees.getNbPlaceDisponibles(30) == 0) {
    		ctrl.bn30.setTextFill(Color.RED);
    	} else {
    		ctrl.bn30.setTextFill(Color.BLUE);
    	}
	}
}