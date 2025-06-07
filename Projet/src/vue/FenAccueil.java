package vue;

import java.io.File;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FenAccueil extends Stage {
	private CtrlAccueil ctrl; 
	
	public FenAccueil() throws IOException{
		this.setTitle("ACCUEIL");
		this.setResizable(false);
		
		Scene laScene = new Scene(creerSceneGraph());
		this.setScene(laScene);
	}

	private Pane creerSceneGraph() throws IOException {
		File fichier = new File("/Users/arthurchauvel/Desktop/cours/SAES/S201/Code/FXML/Accueil.fxml");
		FXMLLoader loader;
		loader = new FXMLLoader(fichier.toURI().toURL());
        Pane root = new Pane();
		root = loader.load();
		ctrl = loader.getController();
     	return root;
	}
	
	public void viderDonnees() {
		ctrl.txtNom.clear();
		ctrl.txtPrenom.clear();
	}
}