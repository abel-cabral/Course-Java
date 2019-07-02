package entities;

import java.util.HashSet;
import java.util.Set;

public class Teacher {
	Set<Course> sets = new HashSet<Course>();
			
	public Teacher() {	
	}

	public void addClass(Course course) {		
		sets.add(course);
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sets == null) ? 0 : sets.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (sets == null) {
			if (other.sets != null)
				return false;
		} else if (!sets.equals(other.sets))
			return false;
		return true;
	}	
}
