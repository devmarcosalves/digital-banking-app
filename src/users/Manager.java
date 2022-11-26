package users;

import java.util.Scanner;

import transactions.Financing;

public class Manager {
	static Scanner sc = new Scanner(System.in);
	public static boolean analysis() {
		System.out.println("\n\t\tMANAGER\n");
		System.out.println("SOLICITAÇÃO DE FINANCIAMENTO");
		System.out.println("Nome: "+Holders.name);
		System.out.println("CPF: "+Holders.cpf);
		System.out.println("Valor do Imóvel: "+Financing.valimovel);
		System.out.println("Valor de Entrada: "+Financing.valentrada);
		System.out.println("Valor total do financiamento: "+Financing.finantotal);
		System.out.print("\nDigite 1 para AUTORIZAR ou 0 para NEGAR: ");
		int x = sc.nextInt();
		if(x == 1) {
			return true;
		}else if(x == 0) {
			return false;
		}else {
			System.out.println("Opção Inválida!");
		}
		//sc.close();
		return false;
	}
}