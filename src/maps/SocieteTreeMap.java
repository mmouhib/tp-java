package maps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete {

    TreeMap<Employe, Departement> societeTreeMap;

    public SocieteTreeMap() {
        this.societeTreeMap = new TreeMap<>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        societeTreeMap.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        societeTreeMap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        System.out.println(societeTreeMap.keySet());
    }

    @Override
    public void afficherLesEmployes() {
        System.out.println(societeTreeMap.values());
    }

    @Override
    public void afficherLesDepartements() {
        System.out.println(societeTreeMap.keySet());
    }

    @Override
    public void afficherDepartement(Employe e) {
        Set<Map.Entry<Employe, Departement>> values = societeTreeMap.entrySet();
        for (Map.Entry<Employe, Departement> val :
                values) {
            System.out.println(val.getValue());
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return societeTreeMap.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        return societeTreeMap.containsValue(e);
    }
}
