package transactions;

import java.util.Scanner;
import program.Confirmation;

public class Deposit {
	public static double deposito(double x) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe quanto deseja depositar: ");
		double depuser = sc.nextDouble();
		if(Confirmation.authorization() == 1) {
			x = x + depuser;
			System.out.println("Depósito realizado com sucesso.");
		}else 
			System.out.println("Senha Incorreta.");

			return x;
	}
}
