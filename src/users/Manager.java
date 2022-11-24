package users;

import java.util.Scanner;

import transactions.Financing;

public class Manager {
	public static int analysis() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nSOLICITAÇÃO DE FINANCIAMENTO");
		System.out.println("Nome: "+Holders.name);
		System.out.println("CPF: "+Holders.cpf);
		System.out.println("Valor do Imóvel: "+Financing.valimovel);
		System.out.println("Valor de Entrada: "+Financing.valentrada);
		System.out.println("Valor total do financiamento: "+Financing.finantotal);
		System.out.print("\nDigite 1 para AUTORIZAR ou 0 para NEGAR: ");
		int x = sc.nextInt();
		return x;
	}
}
