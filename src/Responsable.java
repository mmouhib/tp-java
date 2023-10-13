public class Responsable extends Personne {
    int prime;

    final int HOUR_PRICE = 10;
    final int HOUR_PRICE_PLUS = 12;
    final int MAX_HOURS = 160;


    public Responsable(int id, int nbHeures, String nom, String adresse, int prime) {
        super(id, nbHeures, nom, adresse);
        this.prime = prime;
    }

    public double salary() {
        return super.salary(MAX_HOURS, HOUR_PRICE, HOUR_PRICE_PLUS);
    }

}
