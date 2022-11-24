package program;

import java.util.Scanner;
import static users.Holders.transactionPassword;

public class Confirmation {
	static Scanner sc = new Scanner(System.in);
	public static int authorization() {
		System.out.print("Confirme sua Senha de Transações: ");
		int confsenha = sc.nextInt();
		
		if(transactionPassword == confsenha) {
			return 1;
		}else { 
			return 0;
		}
		//sc.close();
	}
}
