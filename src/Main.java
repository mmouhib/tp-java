public class Main {
    public static void main(String[] args) {

        Produit prodOne = new Produit(1021, "lait", "delice");
        Produit prodTwo = new Produit(2025, "yaourte", "vitalait");
        Produit prodThree = new Produit(3250, "tomate", "sicam", 1.2);

        prodOne.afficher();

        prodOne.setPrix(0.7);
        prodOne.afficher();

        prodOne.setPrix(1000d);
        prodTwo.setPrix(2000d);

        System.out.println(prodOne);


        System.out.println(prodOne);

        Personne pers = new Personne(1, 100, "flen", "adr");






        // posit 4
        Magasin carrefour = new Magasin(1, "centre ville", 22, "carrefour", new Produit[]{prodOne, prodOne}, new Personne[]{pers});
        Magasin monoprix = new Magasin(2, "menzah 6", 22, "monoprix", new Produit[]{prodOne, prodOne}, new Personne[]{pers});


        Caissier c1 = new Caissier(1, 1000, "", "", 1);
        System.out.println(c1.salary());

    }
}