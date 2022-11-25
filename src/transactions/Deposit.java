package transactions;

import java.util.Scanner;

public class Deposit {
	static Scanner sc = new Scanner(System.in);
	public double deposito(double x) {
		System.out.print("Informe quanto deseja depositar: ");
		double depuser = sc.nextDouble();
		if(Password.confirmation()) {
			x = x + depuser;
			System.out.println("Depósito realizado com sucesso!");
		}
		//sc.close();
		return x;
	}
}