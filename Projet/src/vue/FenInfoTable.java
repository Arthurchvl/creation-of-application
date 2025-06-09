package vue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import modele.Donnees;
import modele.Personne;

public class FenInfoTable extends Stage{
	
	private CtrlInfoTable ctrl;
	
	public FenInfoTable() throws IOException{
		this.setTitle("INFORMATION DE LA TABLE");
		this.setResizable(false);
		
		Scene laScene = new Scene(creerSceneGraph());
		this.setScene(laScene);
	}

	private Pane creerSceneGraph() throws IOException {
		File fichier = new File("/Users/arthurchauvel/Desktop/cours/SAES/S201/Code/FXML/InfoTable.fxml");
		FXMLLoader loader;
		loader = new FXMLLoader(fichier.toURI().toURL());
        Pane root = new Pane();
		root = loader.load();
		ctrl = loader.getController();
     	return root;
	}
	
	
	public void chargerDonnees(Integer noTable) {
		ctrl.setLblTable(noTable.toString());
	}
	
	public void chargerListePersonnes(Integer noTable) {
		ObservableList<String> items = FXCollections.observableArrayList();
		
    	ArrayList<Personne> personnesDeLaTable = Donnees.getlistePersonnesDansUneTable(noTable);
    	if (personnesDeLaTable.isEmpty()) {
    		items.add("Il n'y a personne dans la table.");
    	}
    	ctrl.listePersonnes.setItems(items);
    	for (Personne p : personnesDeLaTable) {
    		items.add(p.toString());
    	}
    	ctrl.items = items;
    	if (items.contains("Il n'y a personne dans la table.")) {
    		ctrl.bnVider.setDisable(true);
    		ctrl.bnDeplacer.setDisable(true);
    	}
	}
}
