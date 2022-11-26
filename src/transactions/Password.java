package transactions;

import users.Holders;
import java.util.Scanner;
import screens.HomeScreen;
import program.Start;
import program.TransactionPassword;

public class Password {
	static Scanner sc = new Scanner(System.in);
	public static boolean consult(double value) {
		if(Holders.saldo >= value) {
			return true;
		}else {
			System.out.println("Saldo Insuficiente!");
			return false;
		}
	}
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
	public static boolean authorization() {
		System.out.print("Digite 1 para autorizar ou 0 para cancelar: ");
		int aux = sc.nextInt();
		if(aux == 1) {
			System.out.println("Transação realizada com sucesso!");
			return true;
			//colocar para receber como parâmetro o nome da transação
		}else if(aux == 0) {
			System.out.println("Transação cancelada!");
			HomeScreen.menu();
		}else {
			System.out.println("Opção Inválida");
		}
		return false;		
	}
}
