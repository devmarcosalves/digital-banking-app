package transactions;

import program.Confirmation;

public class Balance {
	public static void saldo(double x) {
		if(Confirmation.authorization() == 1) {
			System.out.println("Você tem R$" + x);
		} else 
			System.out.println("Senha Incorreta");
	}
}