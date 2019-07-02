package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import entities.Candidate;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = "/Users/warakia/Projetos/Java/Course-Java/eleicao.csv";
		Map<Candidate, Integer> candidate = new HashMap<>();	
				
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			// Abre e lê as linhas do arquivo
			String line = br.readLine();
			while (line != null) {
				// Tratamento de linha em csv para Array String
				String[] aux = line.split(",");
				String userName = aux[0];
				Integer vote = Integer.parseInt(aux[1]);
				
				// Inicialozacao de Candidato
				Candidate ls = new Candidate(userName); 
				
				// Tratamento para add de dados
				if (candidate.get(ls) != null) {
					candidate.put(ls, candidate.get(ls) + vote);
				} else {
					candidate.put(ls, vote);
				}
																
				line = br.readLine();
			}
			
			for(Candidate can : candidate.keySet()) {
				System.out.println(can.getName() + ": " + candidate.get(can));
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
