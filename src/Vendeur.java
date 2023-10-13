public class Vendeur extends Personne{
    int tauxDeVente;

    final int FIXED_VALUE = 450;

    public Vendeur(int id, int nbHeures, String nom, String adresse, int tauxDeVente) {
        super(id, nbHeures, nom, adresse);
        this.tauxDeVente = tauxDeVente;
    }

    public Double salary(){
        return (double) (FIXED_VALUE + (tauxDeVente/FIXED_VALUE)*100);
    }



}
