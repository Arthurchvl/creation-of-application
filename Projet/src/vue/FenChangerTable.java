package vue;

import java.io.File;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import modele.Personne;

public class FenChangerTable extends Stage {
	
	private CtrlChangerTable ctrl;
	
	public FenChangerTable() throws IOException{
		this.setTitle("CHANGER LA TABLE");
		this.setResizable(false);
		
		Scene laScene = new Scene(creerSceneGraph());
		this.setScene(laScene);
	}

	private Pane creerSceneGraph() throws IOException {
		File fichier = new File("/Users/arthurchauvel/Desktop/cours/SAES/S201/Code/FXML/ChangerTable.fxml");
		FXMLLoader loader;
		loader = new FXMLLoader(fichier.toURI().toURL());
        Pane root = new Pane();
		root = loader.load();
		ctrl = loader.getController();
     	return root;
	}
	
	public void chargerDonnees(String nom, String prenom) {
		Personne personneACharger = new Personne(nom, prenom);
		ctrl.setLblNom(personneACharger.getNom());
		ctrl.setLblPrenom(personneACharger.getPrenom());
	}
}