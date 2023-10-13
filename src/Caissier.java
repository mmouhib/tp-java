public class Caissier extends Personne {
    int numeroDeCaisse;
    final int HOUR_PRICE = 5;
    final double HOUR_PRICE_PLUS = 5.75;
    final int MAX_HOURS = 160;


    public Caissier(int id, int nbHeures, String nom, String adresse, int numeroDeCaisse) {
        super(id, nbHeures, nom, adresse);
        this.numeroDeCaisse = numeroDeCaisse;
    }


    public double salary() {
        return super.salary(MAX_HOURS, HOUR_PRICE, HOUR_PRICE_PLUS);
    }

}
