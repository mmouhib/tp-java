public class Fruit extends Produit implements Critere{

    private float qte;
    private String saison;

    public Fruit(int id, String libelle, String marque, Double prix, float qte, String saison) {
        super(id, libelle, marque, prix);
        this.qte = qte;
        this.saison = saison;
    }

    public Fruit(int id, String libelle, String marque, float qte, String saison) {
        super(id, libelle, marque);
        this.qte = qte;
        this.saison = saison;
    }


    public float getQte() {
        return qte;
    }

    public void setQte(float qte) {
        this.qte = qte;
    }

    public String getSaison() {
        return saison;
    }

    public void setSaison(String saison) {
        this.saison = saison;
    }

    @Override
    public boolean estFrais(String saison) {
        return this.saison.equals(saison);
    }
}
