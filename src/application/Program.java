package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import entities.Course;
import entities.Student;
import entities.Teacher;

public class Program {

	public static void main(String[] args) {		
		Teacher teacher = new Teacher();
		
		String path = "/Users/warakia/Projetos/Java/Course-Java/courses.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			// Lê o arquivo
			String line = br.readLine();
			while (line != null) {
				String[] aux = line.split(" ");
				String studentClass = aux[0];
				Integer studentCode = Integer.parseInt(aux[1]);
							
				teacher.addClass(studentClass, studentCode);

				line = br.readLine();
			}
			
			for (Course c : teacher.getSets()) {
				System.out.println(c.toString());
			}
						
			System.out.println("Total Users: " + teacher.amountStudents());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}

}
