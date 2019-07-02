package application;

import java.util.Scanner;

import entities.Course;
import entities.Student;
import entities.Teacher;

public class Program {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		Scanner sc = new Scanner(System.in);
	
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		Course courseA = new Course("A");
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			courseA.addStudent(new Student(number));
		}
		teacher.addClass(courseA);

		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		Course courseB = new Course("B");		
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			courseB.addStudent(new Student(number));
		}
		teacher.addClass(courseB);

		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		Course courseC = new Course("C");
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			courseC.addStudent(new Student(number));
		}
		teacher.addClass(courseC);

		
		for (Course c : teacher.getSets()) {
			System.out.println(c.toString());
		}
		System.out.println("Total students: " + teacher.amountStudents());

		sc.close();
	}

}
