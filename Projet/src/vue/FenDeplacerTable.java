package vue;

import java.io.File;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import modele.Donnees;

public class FenDeplacerTable extends Stage {
	
	private CtrlDeplacerTable ctrl;
	
	public FenDeplacerTable() throws IOException{
		this.setTitle("DEPLACER PETITE TABLE");
		this.setResizable(false);
		
		Scene laScene = new Scene(creerSceneGraph());
		this.setScene(laScene);
	}

	private Pane creerSceneGraph() throws IOException {
		File fichier = new File("/Users/arthurchauvel/Desktop/cours/SAES/S201/Code/FXML/DeplacerPetiteTable.fxml");
		FXMLLoader loader;
		loader = new FXMLLoader(fichier.toURI().toURL());
        Pane root = new Pane();
		root = loader.load();
		ctrl = loader.getController();
     	return root;
	}
	
	public void chargerDonnees(Integer noTable) {
		ctrl.setLblTable(noTable.toString());
		
    	Integer nbPlacesAdeplacer = Donnees.getlistePersonnesDansUneTable(noTable).size();
        ObservableList<String> items = FXCollections.observableArrayList();
        for (Integer i=1 ; i <= 30 ; i++) {
            if (Donnees.getNbPlaceDisponibles(i) >= nbPlacesAdeplacer) {
            	items.add(i.toString());
            }
        }
    	ctrl.listeTable.setItems(items);
    	ctrl.listeTable.setValue("Numéro de table");
	}
}