package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// Linux Open File
		File homedir = new File(System.getProperty("user.home"));
		File path = new File(homedir, "qualquer.txt");

		// Declara variavel no try
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			// Java 7 > o fechamento é automatico no bloco try/cath
			System.out.println("Error: " + e.getMessage());
		}

	}

}
