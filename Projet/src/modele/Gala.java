package modele;

import java.util.Date;

public class Gala {
    private String nom;
    private Date date;

    public Gala(String nom, Date date) {
        this.nom = nom;
        this.date = date;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



}
