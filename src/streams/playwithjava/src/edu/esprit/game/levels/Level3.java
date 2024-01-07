package edu.esprit.game.levels;

import edu.esprit.game.models.Employee;

import java.util.*;
import java.util.stream.Collectors;

import edu.esprit.game.utils.Data;

public class Level3 {
    public static void main(String[] args) {
        List<Employee> employees = Data.employees();


        /* TO DO 1: Retourner une chaine de caract�re qui contient tous les noms des employ�s */
        String names = employees.stream().map(Employee::getName)
                .reduce("", (e, e2) -> e + e2);
        ;/* TO DO 1  hint(reduce)*/
        ;
			/*

		String names =	employees.stream()
        .map(Employee::getName)
        .collect(Collectors.joining());
			 */
        /* TO DO 2: Retourner une chaine de caract�re qui contient tous les noms des employ�s en majuscule separ�s par # */
        String namesMajSplit = employees.stream()
                .map(employee -> employee.getName().toUpperCase())
                .collect(Collectors.joining("#"));/* TO DO 2 */
        ;

        /* TO DO 3: Retourner une set d'employ�s*/
        Set<Employee> emps = employees.stream().collect(Collectors.toSet());

        /* TO DO 4: Retourner une TreeSet d'employ�s (tri par nom) */
        TreeSet<Employee> emps2 = employees.stream().sorted()
                //.collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Employee::getName))));
				.collect(Collectors.toCollection(() -> new TreeSet<>()));
        /* TO DO 4 */

        /* TO DO 5: Retourner une Map qui regroupe les employ�s par salaire */
        Map<Integer, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getSalary));

        /* TO DO 6: Retourner une Map qui regroupe les nom des employ�s par salaire */


        Map<Integer, List<Employee>> mm = employees.stream()
                .collect(Collectors.groupingBy(Employee::getSalary));


        /* TO DO 7: Retourner le  min, max,average, sum,count des salaires */

        Map<Integer, String> ss = employees.stream()
                .collect(Collectors.groupingBy(Employee::getSalary,
                        Collectors.mapping(Employee::getName, Collectors.joining(", "))));


    }
}
