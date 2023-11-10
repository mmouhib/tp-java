package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SocieteHashMap implements InterfaceSociete {


    HashMap<Employe, Departement> societeHashMap;


    public SocieteHashMap() {
        this.societeHashMap = new HashMap<>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        societeHashMap.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        societeHashMap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        System.out.println(societeHashMap.keySet());
    }

    @Override
    public void afficherLesEmployes() {
        System.out.println(societeHashMap.values());
    }

    @Override
    public void afficherLesDepartements() {
        System.out.println(societeHashMap.keySet());
    }

    @Override
    public void afficherDepartement(Employe e) {
        Set<Map.Entry<Employe, Departement>> values = societeHashMap.entrySet();
        for (Map.Entry<Employe, Departement> val :
                values) {
            System.out.println(val.getValue());
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return societeHashMap.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        return societeHashMap.containsValue(e);
    }
}
