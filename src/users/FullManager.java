package users;

import java.util.Scanner;

public class FullManager extends Manager{
	static Scanner sc = new Scanner(System.in);
	
	public static int authorization() {
		System.out.println("\n\t\tFULL MANAGER\n");
		System.out.println("\nNOVO CADASTRO DE USUÁRIO");
		System.out.println("Nome: "+Holders.name);
		System.out.println("CPF: "+Holders.cpf);
		System.out.print("Digite 1 para AUTORIZAR ou 0 para NEGAR: ");
		int x = sc.nextInt();
		
		
		//sc.close();

		return x;
	}
	
}
