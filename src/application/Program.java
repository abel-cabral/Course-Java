package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = "/Users/warakia/Projetos/Java/Course-Java/funcionarios.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Employee> list = new ArrayList<Employee>();

			System.out.printf("Enter salary: ");
			Double minSalary = sc.nextDouble();

			System.out.printf("Email of people whose salary is more than %.2f\n", minSalary);

			String line = br.readLine();
			while (line != null) {
				try {
					String[] aux = line.split(",");
					String name = aux[0];
					String email = aux[1];
					Double salary = Double.parseDouble(aux[2]);

					list.add(new Employee(name, email, salary));
				} catch (Exception e) {
					// Caso queira tratar os inválidos
				}
				line = br.readLine();
			}

			List<String> employeeEmail = list.stream().filter(p -> p.getSalary() >= minSalary).map(p -> p.getEmail())
					.sorted().collect(Collectors.toList());

			employeeEmail.forEach(System.out::println);

			double media = list.stream().filter(x -> x.getName().charAt(0) == 'M').map(n -> n.getSalary()).reduce(0.0,
					(identificator, accumulator) -> identificator + accumulator);
			
			System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", media));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
