package users;

import java.util.Scanner;

import transactions.Financing;

public class Manager {
	static Scanner sc = new Scanner(System.in);
	public static int analysis() {
		System.out.println("\nSOLICITAÇÃO DE FINANCIAMENTO");
		System.out.println("Nome: "+Holders.name);
		System.out.println("CPF: "+Holders.cpf);
		System.out.println("Valor do Imóvel: "+Financing.valimovel);
		System.out.println("Valor de Entrada: "+Financing.valentrada);
		System.out.println("Valor total do financiamento: "+Financing.finantotal);
		System.out.print("\nDigite 1 para AUTORIZAR ou 0 para NEGAR: ");
		int x = sc.nextInt();
		//sc.close();
		return x;
	}
}
