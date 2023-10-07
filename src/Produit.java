import java.util.Date;
import java.util.Objects;

public class Produit {
    private int id;
    private String libelle;
    private String marque;
    private Double prix;
    private Date dateExp;

    public Produit(int id, String libelle, String marque, Double prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    public Produit(int id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getMarque() {
        return marque;
    }

    public Double getPrix() {
        return prix;
    }

    public void afficher() {
        System.out.println(id);
        System.out.println(prix);
        System.out.println(libelle);
        System.out.println(marque);
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateExp=" + dateExp +
                '}';
    }

    public Date getDateExp() {
        return dateExp;
    }

    public void setDateExp(Date dateExp) {
        this.dateExp = dateExp;
    }


    // 3.1.A
    public Boolean comparer(Produit p) {
        return (p.id == this.id && p.libelle.equals(this.libelle) && Objects.equals(p.prix, this.prix));
    }

    // 3.1.B
    public Boolean comparer(Produit p1, Produit p2) {

        return (p1.id == p2.id && p1.libelle.equals(p2.libelle) && Objects.equals(p1.prix, p2.prix));

    }

}
