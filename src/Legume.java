public class Legume extends Produit implements Critere{

    private float qte;
    private String saison;


    public Legume(int id, String libelle, String marque, Double prix) {
        super(id, libelle, marque, prix);
    }

    public Legume(int id, String libelle, String marque) {
        super(id, libelle, marque);
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
