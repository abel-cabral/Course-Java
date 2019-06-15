package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Linux Open File
		File homedir = new File(System.getProperty("user.home"));
		File address = new File(homedir, "qualquer.txt");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		System.out.println("getPath: " + path.getPath());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getName: " + path.getName());
		System.out.println("getSpace: " + path.toString());
		sc.close();

	}

}
