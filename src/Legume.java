public class Legume extends Produit{

    private float qte;

    public Legume(int id, String libelle, String marque, Double prix) {
        super(id, libelle, marque, prix);
    }

    public Legume(int id, String libelle, String marque) {
        super(id, libelle, marque);
    }


    public float getQte() {
        return qte;
    }
}
