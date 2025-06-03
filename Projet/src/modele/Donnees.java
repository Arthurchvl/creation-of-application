package modele;

public class Donnees {
	private static GroupePersonnes grpToutLeMonde = new GroupePersonnes();
	
	public static void main(String[] args) {
		Personne jeanPierre = new Personne("Jean-pierre", "Pernault");
		Personne jeanPierre2 = new Personne("Jean-pierre", "Pernault1");
		Personne jeanPierre1 = new Personne("Jean-pierre", "Pernault12");
		
		grpToutLeMonde.ajouterPersonne(jeanPierre);
		grpToutLeMonde.ajouterPersonne(jeanPierre2);
		grpToutLeMonde.ajouterPersonne(jeanPierre1);
	}
	
	public static boolean contient(Personne p) {
		GroupePersonnes grpToutLeMondeTemp = grpToutLeMonde;
		boolean estPresent = false;
		for (Personne pT : grpToutLeMondeTemp) {
			if (pT.equals(p)) {
				estPresent = true;
			}
		}
		return estPresent;
	}
}
