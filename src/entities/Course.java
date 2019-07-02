package entities;

import java.util.HashSet;
import java.util.Set;

public class Course {
	private String courseName;
	private Set<Student> sets = new HashSet<Student>();
	
	public Course(String courseName) {		
		setCourseName(courseName);
	}

	public void addStudent(Student value) {
		sets.add(value);
	}		
			
	public void printCodeStudents() {
		for (Student code : sets) {
			System.out.println(code.getCode());
		}
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
		Course other = (Course) obj;
		if (sets == null) {
			if (other.sets != null)
				return false;
		} else if (!sets.equals(other.sets))
			return false;
		return true;
	}

	public Set<Student> getSets() {
		return sets;
	}

	public String getCourseName() {
		return courseName;
	}

	private void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "How many students for course " + getCourseName() + "?" + sets.size();
	}
	
	
}
