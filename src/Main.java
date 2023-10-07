import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Produit prod = new Produit();

        Produit prodOne = new Produit(1021, "lait", "delice");
        Produit prodTwo = new Produit(2025, "yaourte", "vitalait");
        Produit prodThree = new Produit(3250, "tomate", "sicam", 1.2);

        prodOne.afficher();

        prodOne.setPrix(0.7);
        prodOne.afficher();

        prodOne.setPrix(1000d);
        prodTwo.setPrix(2000d);

        System.out.println(prodOne);

        prodOne.setDateExp(new Date());

        System.out.println(prodOne);
    }
}