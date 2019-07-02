package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Entities.LogEntities;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();//Users/warakia/Projetos/Java/Course-Java/logSite.txt
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			// Instância uma lista do tipo SET
			Set<LogEntities> set = new HashSet<LogEntities>();
			
			// Lê o arquivo
			String line = br.readLine();
			while (line != null) {
				String[] aux = line.split(" ");
				String userName = aux[0];
				// Converte de String para Date
				Date moment = Date.from(Instant.parse(aux[1]));
				set.add(new LogEntities(userName, moment));
				// É importante descer a linha para nao deixar no loop infinito
				line = br.readLine();
			}
			System.out.println("Total Users: " + set.size());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}


