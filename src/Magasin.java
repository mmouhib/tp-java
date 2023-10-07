import java.util.Objects;

public class Magasin {
    private int id;
    private String adresse;
    private int capacite;
    private Produit[] produits;

    public Magasin(int id, String adresse, int capacite, Produit[] prods) {
        this.id = id;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produits = prods;
    }

    public int getId() {
        return id;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getCapacite() {
        return capacite;
    }

    public Produit[] getProduits() {
        return produits;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void setProduits(Produit[] produits) {
        this.produits = produits;
    }

    public void afficher() {
        System.out.println(id + "\n" + adresse + "\n" + capacite + "\n");
        for (Produit p : produits) {
            System.out.println(p);
        }
    }

    int nbProds() {
        int nb = 0;
        for (Produit p : produits) {
            if (p.getLibelle() != null)
                nb++;
        }
        return nb;
    }


    //3.2
    public Boolean search(Produit p) {

        for (Produit prod : produits) {
            if (prod != null) {
                if (p.getId() == prod.getId()
                        && p.getLibelle().equals(prod.getLibelle())
                        && Objects.equals(p.getPrix(), prod.getPrix())
                ) {
                    return true;
                }
            }
        }
        return false;
    }


    private int getIndex(Produit p) {
        if (search(p)) {
            for (int i = 0; i < this.capacite; i++) {
                if (produits[i].equals(p))
                    return i;
            }
        }
        return -1;
    }

    //3.4
    public Boolean delete(Produit p) {
        int index = getIndex(p);
        if (index == -1) return false;
        produits[index] = null;
        return true;
    }


    //3.5
    public Magasin supNb(Magasin m1, Magasin m2) {
        int nbProdM1 = 0;
        int nbProdM2 = 0;
        for (int i = 0; i < m1.capacite; i++) {
            if (m1.produits[i] != null) {
                nbProdM1++;
            }
        }

        for (int i = 0; i < m2.capacite; i++) {
            if (m2.produits[i] != null) {
                nbProdM2++;
            }
        }

        if (nbProdM1 >= nbProdM2) {
            return m1;
        } else {
            return m2;
        }
    }


    public Boolean addProduct(Produit p) {

        if (this.search(p)) {
            return false;
        } else {

            for (int i = 0; i < this.capacite; i++) {

                if (this.produits[i] == null) {
                    this.produits[i] = p;
                    return true;
                }
            }
            return false;
        }

    }


}
