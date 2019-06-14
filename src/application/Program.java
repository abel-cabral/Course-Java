package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AccountException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Account> list = new ArrayList<Account>();

		try {

			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();

			System.out.print("Holder: ");
			String holder = sc.next();
			
			sc.next();

			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();

			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();

			list.add(new Account(number, holder, balance, withdrawLimit));

			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			list.get(0).withdraw(amount);

			System.out.println("New balance: $ " + list.get(0).getBalance());

		} catch (AccountException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		} finally {
			System.out.println("End of operation");
			sc.close();
		}

	}

}
