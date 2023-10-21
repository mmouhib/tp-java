public class Fruit extends Produit {

    private float qte;
    public Fruit(int id, String libelle, String marque, Double prix) {
        super(id, libelle, marque, prix);
    }

    public Fruit(int id, String libelle, String marque) {
        super(id, libelle, marque);
    }


    public float getQte() {
        return qte;
    }
}
