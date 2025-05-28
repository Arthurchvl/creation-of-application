module Projet {
	requires javafx.base;
	requires javafx.fxml;
	requires javafx.controls;
	requires javafx.graphics;
	
	opens controleur to javafx.fxml, javafx.controls, javafx.graphics, javafx.base;
	opens modele to javafx.fxml, javafx.controls, javafx.graphics, javafx.base;
	opens vue to javafx.fxml, javafx.controls, javafx.graphics, javafx.base;
}