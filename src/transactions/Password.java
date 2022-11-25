package transactions;

import users.Holders;
import java.util.Scanner;

import program.Start;
import program.TransactionPassword;

public class Password {
	static Scanner sc = new Scanner(System.in);
	public static boolean confirmation() {
		int password = 0, attemps = 3;
		while(password != Holders.transactionPassword) {
			System.out.print("\nInsira a Senha de Transações: ");
			password = sc.nextInt();
			if(password == Holders.transactionPassword) {
				return true;
			}
			if(attemps == 0) {
				System.out.println("Você excedeu a quantidade máxima de tentativas!");
				System.out.println("Senha de Transações Bloqueada!");
				Holders.transactionPassword = 0;
				System.out.print("Digite 1 para Desbloquear ou 0 para Fechar: ");
				int opc = sc.nextInt();
				if(opc == 1) {
					TransactionPassword.reset();
				}else {
					Start.main(null);
				}
			}
			System.out.println("Senha Incorreta!");
			System.out.print("\nVocê tem "+attemps+" tentativa(s)");
			attemps--;
		}
		return null != null;
	}
}