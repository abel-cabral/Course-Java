package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Person> list = new ArrayList<Person>();
		
		System.out.print("Enter the number of tax payers: ");
		int looping = sc.nextInt();
		for (int i = 0; i < looping; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data:");
						
			System.out.print("Individual or company (i/c)? ");
			char descision = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Anual income: ");
			Double income = sc.nextDouble();
									
			if(descision == 'c') {
				System.out.print("Number of employees: ");
				Integer numberEmployee = sc.nextInt();
				list.add(new LegalPerson(name, income, numberEmployee));
			} else {
				System.out.print("Health expenditures: ");
				Double healthCoast = sc.nextDouble();
				list.add(new PhysicalPerson(name, income, healthCoast));
			}
		}
		
		System.out.println("######################################");
		System.out.println("TAXES PAID: ");
		double sum = 0;
		for(Person c : list) {
			sum += c.calcTaxes();
			System.out.println(c.toString());
		}
		
		System.out.println("TOTAL TAXES: $ " + sum);
		
		
		sc.close();
	}

}
