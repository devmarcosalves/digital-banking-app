package users;

import java.util.Scanner;

public class FullManager extends Manager{

	
	public static int authorization() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNOVO CADASTRO DE USUÁRIO");
		System.out.println("Nome: "+Holders.name);
		System.out.println("CPF: "+Holders.cpf);
		System.out.print("\nDigite 1 para AUTORIZAR ou 0 para NEGAR: ");
		int x = sc.nextInt();
		
		
		sc.close();

		return x;
	}
	
}
