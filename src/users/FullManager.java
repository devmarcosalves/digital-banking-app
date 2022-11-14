package users;

import java.util.Scanner;

public class FullManager {

	
	public static int authorization() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNOVO CADASTRO DE USUÁRIO");
		System.out.print("Nome: "+Holders.name);
		System.out.print("CPF: "+Holders.cpf);
		System.out.print("Digite 1 para AUTORIZAR ou 0 para NEGAR: ");
		int x = sc.nextInt();
		
		
		sc.close();

		return x;
	}
	
}
