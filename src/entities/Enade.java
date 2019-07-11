package entities;

public class Enade {
	private Integer codeCourse;
	private String nameCourse;
	private String university;
	private String shortUniversity;
	private Integer concept;

	public Enade(Integer codeCourse, String university, String shortUniversity, Integer concept, String nameCourse) {
		this.codeCourse = codeCourse;
		this.nameCourse = nameCourse;
		this.university = university;
		this.shortUniversity = shortUniversity;
		this.concept = concept;
	}

	public Integer getCodeCourse() {
		return codeCourse;
	}

	public String getUniversity() {
		return university;
	}

	public String getShortUniversity() {
		return shortUniversity;
	}

	public Integer getConcept() {
		return concept;
	}

	@Override
	public String toString() {
		return " Curso: " + nameCourse + ", Universidade: " + university.toUpperCase() + ", Conceito: " + concept;
	}

	public static String mediaNacional(String course, Integer n) {
		return "A média nacional do curso de " + course + " é: " + (int) n;
	}

	public String getNameCourse() {
		return nameCourse;
	}

}
