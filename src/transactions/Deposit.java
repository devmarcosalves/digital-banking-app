package transactions;

import java.util.Scanner;
import program.Confirmation;

public class Deposit {
	static Scanner sc = new Scanner(System.in);
	public double deposito(double x) {
		System.out.print("Informe quanto deseja depositar: ");
		double depuser = sc.nextDouble();
		if(Confirmation.authorization() == 1) {
			x = x + depuser;
			System.out.println("Depósito realizado com sucesso.");
		}else {
			System.out.println("Senha Incorreta!");
		}
		//sc.close();
		return x;
	}
}
