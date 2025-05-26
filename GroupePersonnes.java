import java.util.ArrayList;

public class Groupe_pers {
    private int no_groupe;

    private int compteur = 0;
    ArrayList<Personne> personnes;

    Groupe_pers(int no_groupe){
        this.no_groupe = compteur++;
        this.personnes = new ArrayList<>();
    }

    public int getNo_grp() {
        return no_groupe;
    }

    public void setNo_grp(int no_groupe) {
        this.no_groupe = no_groupe;
    }

    public void ajouterPers(Personne p){
        personnes.add(p);
    }

    public void retirerPers(Personne p){
        personnes.remove(p);
    }
}
