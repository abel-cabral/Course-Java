package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<Product>();
		String path = "/home/warakia/produtos.csv";
		char quit = 'n';

		// Inicializa no try para serem fechados automaticamente no final
		try (Scanner sc = new Scanner(System.in); BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

			do {
				System.out.println("Product Registration");

				System.out.print("Product Name, Price, Quantity: ");
				String[] prod = sc.nextLine().split(",");
				list.add(new Product(prod[0], Double.parseDouble(prod[1]), Integer.parseInt(prod[2])));

				System.out.print("Continue register products? y/n -> ");
				quit = sc.next().charAt(0);
				sc.nextLine();

			} while (quit == 'y' || quit == 'Y');

			bw.write("Product,Amount");
			bw.newLine();

			for (Product line : list) {
				bw.write(line.toString());
				bw.newLine();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Bye, bye!");
		}

	}

}
