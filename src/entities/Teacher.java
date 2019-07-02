package entities;

import java.util.HashSet;
import java.util.Set;

public class Teacher {
	Set<Course> sets = new HashSet<Course>();
			
	public Teacher() {	
	}

	public void addClass(String className, Integer studentCode) {
		Course initCourse = new Course(className);
		initCourse.addStudent(new Student(studentCode));
		sets.add(initCourse);
	}
	
	public int amountStudents() {
		Set<Integer> aux = new HashSet<Integer>();
		// Acessa lista de Cursos
		for (Course curse : sets) {
			// Acessa lista de Estudantes 
			for (Student c : curse.getSets()) {
				// Acessa o codigo do aluno e add a lista do professor
				aux.add(c.getCode());
			}
		}
		return aux.size();
	}

	public Set<Course> getSets() {
		return sets;
	}	
}
