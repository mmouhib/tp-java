package maps;

import java.util.Objects;

public class Employe implements  Comparable<Employe>{
    int cin, matricule;
    String nom,prenom;


    public Employe() {
    }

    public Employe(int cin, int matricule, String nom, String prenom) {
        this.cin = cin;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return cin == employe.cin;
    }

    @Override
    public int hashCode() {
        return getCin();
    }

    @Override
    public String toString() {
        return "Employe{" +
                "cin=" + cin +
                ", matricule=" + matricule +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }


    public int compareTo (Employe e){
        return this.cin - e.cin;
        // return this.nom.compareTo(e.getNom());
    }
}
