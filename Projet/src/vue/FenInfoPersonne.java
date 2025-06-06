package vue;

import java.io.File;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import modele.*;


public class FenInfoPersonne extends Stage{
	
	private CtrlInfoPersonne ctrl;
	
	public FenInfoPersonne() throws IOException{
		this.setTitle("INFORMATION DE LA PERSONNE");
		this.setResizable(false);
		
		Scene laScene = new Scene(creerSceneGraph());
		this.setScene(laScene);
	}

	private Pane creerSceneGraph() throws IOException {
		File fichier = new File("/Users/arthurchauvel/Desktop/cours/SAES/S201/Code/FXML/InfoPersonne.fxml");
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
		
    	Integer noTablePersonne = Donnees.getTable(personneACharger);
    	String strnoTablePrsonne = noTablePersonne.toString();
		ctrl.setLblTable(strnoTablePrsonne);
	}
	
	public void chargerTable(String nom, String prenom) {
		Personne personneACharger = new Personne(nom, prenom);
		
		Integer noTablePersonne = Donnees.getTable(personneACharger);
		System.out.println(noTablePersonne);
		String strnoTablePrsonne = noTablePersonne.toString();
		if (noTablePersonne.equals(0)) {
   			ctrl.setLblTable("X");
		}
		else {
   			ctrl.setLblTable(strnoTablePrsonne);
		}
	}
	
	public void rechargerTable(String nom, String prenom) {
		Personne personneACharger = new Personne(nom, prenom);
		Integer noTablePersonne = Donnees.getTable(personneACharger);
    	String strnoTablePrsonne = noTablePersonne.toString();
		if (noTablePersonne == 0) {
   			ctrl.setLblTable("X");
		}
		else {
   			ctrl.setLblTable(strnoTablePrsonne);
		}
	}
}
