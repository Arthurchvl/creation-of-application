package controleur;

import javafx.application.Application;
import javafx.stage.Stage;
import vue.*;

public class Main extends Application{
	static private FenAccueil fAccueil;

	public void start(Stage f) throws Exception{
		fAccueil = new FenAccueil();
		fAccueil.show();
	}
	
	static public void main(String args[]) {
		Application.launch(args);
	}
	
	public void fermerFenetre() {
		System.exit(0);
	}
}