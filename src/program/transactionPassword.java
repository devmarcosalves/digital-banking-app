package program;

import java.util.Scanner;
import users.Holders;

public class transactionPassword {
	static Scanner sc = new Scanner(System.in);

	public static void reset() {
		int newPassword, confPassword, attemps = 3;;
		System.out.println("\n\tREDEFINIÇÃO DA SENHA DE TRANSAÇÕES");
		do {
			System.out.print("Digite a nova Senha de Transações: ");
			newPassword = sc.nextInt();
			System.out.print("Redigite a nova Senha de Transações: ");
			confPassword = sc.nextInt();
			if(newPassword == confPassword) {
				System.out.println("Alteração Concluída com Sucesso!");
				Holders.transactionPassword = newPassword;
				break;
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