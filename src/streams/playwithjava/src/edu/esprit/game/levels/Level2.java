package edu.esprit.game.levels;

import edu.esprit.game.models.Employee;
import edu.esprit.game.utils.Data;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Level2 {
    public static void main(String[] args) {
        List<Employee> employees = Data.employees();

        /* TO DO 1: Retourner le nombre des employ�s dont le nom commence avec n */
        long nbr = employees.stream().filter(e-> e.getName().startsWith("n")).count();/*TO DO 1 */

        /* TO DO 2: Retourner la somme des salaires de tous les employ�s (hint: mapToInt) */
        long sum = employees.stream().mapToInt(e -> e.getSalary()).sum()/* TO DO 2 */;

        /* TO DO 3: Retourner la moyenne des salaires des employ�s dont le nom commence avec s */
        double average = employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble();

        /* TO DO 4: Retourner la liste de tous les employ�s  */
        List<Employee> emps = employees.stream().toList()/* TO DO 4 */;

        /* TO DO 5: Retourner la liste des employ�s dont le nom commence par s */
        List<Employee> emps2 = employees.stream().filter(e -> e.getName().startsWith("s")).toList()/* TO DO 5 */;


        /* TO DO 6: Retourner true si il y a au min un employ�s dont le salaire > 1000, false si non
         */
        boolean test = employees.stream().sorted((a1,a2) -> a1.getSalary() - a2.getSalary()).findAny().isPresent();/* TO DO 6 */

        /* TO DO 7: Afficher le premier employ� dont le nom commence avec s avec deux mani�res diff�rentes */
        /*First way*/
        Optional<Employee> s = employees.stream().filter(e -> e.getName().startsWith("s")).findFirst();/* TO DO 7 */
        /*Second way*/
        employees.stream().filter(e -> e.getName().startsWith("s")).limit(1).forEach(System.out::println);/* TO DO 7 */

        /* TO DO 8: Afficher le second employ� dont le nom commence avec s */
         employees.stream().filter(e -> e.getName().startsWith("s")).skip(1).limit(1).forEach(System.out::println);/* TO DO 8 */

    }
}
