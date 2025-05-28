package modele;

import java.util.ArrayList;

public class GroupePersonnes {
	private ArrayList<Personne> personnes;
	
	GroupePersonnes(){
		this.personnes = new ArrayList<>();
	}
	
	public void ajouterPersonne(Personne P) {
		this.personnes.add(P);
	}
	public void retirerPersonnes(Personne P) {
		this.personnes.remove(P);
	}
}
