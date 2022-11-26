package transactions;

import java.util.Scanner;

public class Deposit {
	static Scanner sc = new Scanner(System.in);
	public double deposito(double x) {
		System.out.print("\t\tDEPÓSITO\n");
		System.out.print("Informe quanto deseja depositar: ");
		double depuser = sc.nextDouble();
		if(Password.confirmation() && Password.authorization()) {
			x = x + depuser;
			}
		//sc.close();
		return x;
	}
}