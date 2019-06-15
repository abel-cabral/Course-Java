package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// Linux Open File
		File homedir = new File(System.getProperty("user.home"));
		File path = new File(homedir, "qualquer.txt");

		String[] toppings = new String[3];
		toppings[0] = "Regina Casé";
		toppings[1] = "Samira Close";
		toppings[2] = "Queiroz de Mattos";
		
		// Criando e salvando dados em arquivo - Ira gravar no final da linha
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for( String c : toppings) {
				bw.write(c);
				bw.newLine(); // Quebra de linha
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
