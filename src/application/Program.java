package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Enade;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = "/Users/warakia/Projetos/Java/Course-Java/enade.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Enade> list = new ArrayList<Enade>();

			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				try {
					String[] aux = line.split(";");
					Integer codeCourse = Integer.parseInt(aux[1]);
					String nameCourse = aux[2];
					String university = aux[4];
					String shortUniversity = aux[5];
					Integer concept = Integer.parseInt(aux[20]);
					list.add(new Enade(codeCourse, university, shortUniversity, concept, nameCourse));
				} catch (Exception e) {
					// Caso queira tratar os curso inválidos
				}
				line = br.readLine();
			}

			// Verifica as maiores notas
			Comparator<Enade> comp = (s1, s2) -> s1.getConcept().compareTo(s2.getConcept());

			// Filtra cursos e faz média
			List<Enade> course = list.stream().filter(p -> p.getCodeCourse() == 4006).collect(Collectors.toList());
			Integer media = course.stream().map(n -> n.getConcept()).reduce(0,
					(subtotal, element) -> subtotal + element);

			System.out.println(Enade.mediaNacional(course.get(0).getNameCourse(),
					(int) Math.ceil(media / (double) course.size())));

			// Filtra e ordena pelas maiores notas
			System.out.println("Cursos Acima da Média: " + (int) Math.ceil(media / (double) course.size()));
			List<Enade> topCourse = course.stream()
					.filter(p -> p.getConcept() > (int) Math.ceil(media / (double) course.size()))
					.sorted(comp.reversed()).collect(Collectors.toList());

			for (Enade s : topCourse) {
				System.out.println(s.toString());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
