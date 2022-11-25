package transactions;

public class Balance {
	public static void saldo(double x) {
		if(Password.confirmation()) {
			System.out.println("Você tem R$" + x);
		}
	}
}