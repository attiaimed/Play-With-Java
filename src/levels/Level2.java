package levels;

import models.Employee;
import utils.Data;

import java.util.List;
import java.util.stream.Collectors;

public class Level2 {
	public static void main(String[] args) {
	List<Employee> employees = Data.employees();

	/* TO DO 1: Retourner le nombre des employ�s dont le nom commence avec n */
	long nbr = employees.stream().filter(employee -> employee.getName().startsWith("n")).count();

	/* TO DO 2: Retourner la somme des salaires de tous les employ�s (hint: mapToInt) */
	long sum = employees.stream().mapToInt(employee -> employee.getSalary()).sum();

	/* TO DO 3: Retourner la moyenne des salaires des employ�s dont le nom commence avec s */
	double average = employees.stream().filter(employee -> employee.getName().startsWith("s")).mapToInt(employee -> employee.getSalary()).average().getAsDouble();


	/* TO DO 4: Retourner la liste de tous les employ�s  */
	List<Employee> emps = employees.stream().toList()/* TO DO 4 */;


		/* TO DO 5: Retourner la liste des employ�s dont le nom commence par s */
		List<Employee> emps2 = employees.stream().filter(employee -> employee.getName().startsWith("s")).collect(Collectors.toList());/* TO DO 5 */;


	/* TO DO 6: Retourner true si il y a au min un employ�s dont le salaire > 1000, false si non
	*/
	boolean test = employees.stream().anyMatch(employee -> employee.getSalary()>1000);/* TO DO 6 */
		System.out.println(test);
	/* TO DO 7: Afficher le premier employ� dont le nom commence avec s avec deux mani�res diff�rentes */
	/*First way*/
	employees.stream().filter(employee -> employee.getName().startsWith("s")).findFirst();

	System.out.println(employees.stream().filter(employee -> employee.getName().startsWith("s")).findFirst().get());
	/* TO DO 7 */
	/*Second way*/
	employees.stream().filter(employee -> employee.getName().startsWith("s")).findFirst().ifPresent(System.out::println);/* TO DO 7 */

	/* TO DO 8: Afficher le second employ� dont le nom commence avec s */
	employees.stream().filter(employee -> employee.getName().startsWith("s")).skip(1).findFirst().ifPresent(System.out::println);/* TO DO 8 */


	}
}
