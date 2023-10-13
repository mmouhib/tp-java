public class Personne {
    int id, nbHeures;
    String nom, adresse;


    public double salary(int maxHours, int hourPrice, double hourPricePlus) {
        if (nbHeures < maxHours) {
            return nbHeures * hourPrice;
        }

        return hourPrice * maxHours + (nbHeures - maxHours) * hourPricePlus;
    }

    public Personne(int id, int nbHeures, String nom, String adresse) {
        this.id = id;
        this.nbHeures = nbHeures;
        this.nom = nom;
        this.adresse = adresse;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNbHeures(int nbHeures) {
        this.nbHeures = nbHeures;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public int getNbHeures() {
        return nbHeures;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }


    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nbHeures=" + nbHeures +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }


}
