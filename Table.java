import java.util.ArrayList;

public class Table {
    private int no_table;
    private int compteur;
    private int places;

    ArrayList<GroupePersonnes> nb_groupe;
    
    public Table(int no_table, int places){
        this.no_table = compteur++;
        this.places = places;
        this.nb_groupe = new ArrayList<>();
    }

    public int getNo_table() {
        return no_table;
    }

    public void setNo_table(int no_table) {
        this.no_table = no_table;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }
}
