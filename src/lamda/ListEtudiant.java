package lamda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ListEtudiant implements GestionEtudiant {
    @Override
    public void afficherEtudiants(List<Etudiant> etudiants, Consumer<Etudiant> consumer) {
    }

    @Override
    public void afficherEtudiantSelonFiltre(List<Etudiant> etudiants, Predicate<Etudiant> predicate, Consumer<Etudiant> cons) {

    }

    @Override
    public String afficherNomEtudiant(List<Etudiant> etudiants, Function<Etudiant, String> f) {
        return null;
    }

    @Override
    public Etudiant creeEtudiant(Supplier<Etudiant> supp) {
        return null;
    }

    @Override
    public Stream convertListStream(List<Etudiant> I) {
        return null;
    }
}
