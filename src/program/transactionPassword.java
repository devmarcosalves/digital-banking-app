package program;

import java.util.Scanner;

import screens.HomeScreen;
import users.Holders;

public class TransactionPassword {
	static Scanner sc = new Scanner(System.in);

	public static void reset() {
		int newPassword, confPassword, attemps = 3;;
		System.out.println("\n\tREDEFINIÇÃO DA SENHA DE TRANSAÇÕES\n");
		do {
			System.out.print("Digite a nova Senha de Transações: ");
			newPassword = sc.nextInt();
			while(newPassword == 0) {
				System.out.println("A senha nova não pode ser (0)\n");
				System.out.print("Digite a nova Senha de Transações: ");
				newPassword = sc.nextInt();
			}
			while(newPassword == Holders.transactionPassword) {
				System.out.println("A senha nova não pode ser igual a senha anterior!\n");
				System.out.print("Digite a nova Senha de Transações: ");
				newPassword = sc.nextInt();
			}
			System.out.print("Redigite a nova Senha de Transações: ");
			confPassword = sc.nextInt();
			if(newPassword == confPassword) {
				System.out.println("Alteração Concluída com Sucesso!");
				Holders.transactionPassword = newPassword;
				HomeScreen.menu();
			}else if(newPassword != confPassword && attemps > 0) {
				System.out.println("A confirmação não confere!\n");
			}
			if(attemps == 0) {
				System.out.println("Você excedeu a quantidade de tentativas!");
				System.out.println("Tente novamente após 24 horas.");
				break;
			}
			System.out.println("Você possui "+attemps+" tentaviva(s)");
			attemps--;
		}while(newPassword != confPassword);
	}
}