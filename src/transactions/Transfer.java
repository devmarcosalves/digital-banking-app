package transactions;

import java.util.Scanner;

import screens.HomeScreen;
import users.Holders;

public class Transfer {
	static Scanner sc = new Scanner(System.in);
	public static void values(){
		//Scanner sc = new Scanner(System.in)
		int bank;
		do {
			System.out.println("\n\t\tTRANSFERÊNCIA\n");
			System.out.println("1.Caixa 2.Itaú 3.Bradesco \n4.Banco do Brasil 5.Santander 0.Sair");
			System.out.print("Selecione o banco da conta destino: ");
			bank = sc.nextInt();
			switch(bank) {
			case 1:
				bank();
				break;
			case 2:
				bank();
				break;
			case 3:
				bank();
				break;
			case 4:
				bank();
				break;
			case 5:
				bank();
				break;
			case 0:
				break;
			default:
				System.out.print("Opção Inválida!\n");
			}
		}while(bank != 0);
	}
			
	
	private static void bank() {
		System.out.print("\n1.Conta Corrente 2.Conta Poupança 3.Conta Pagamanto ");
		int type = sc.nextInt();
		while(type != 1 && type != 2 && type != 3) {
			System.out.println("Tipo de conta inválida!");
			System.out.print("Insira um tipo de conta válido: ");
			type = sc.nextInt();
		}
		System.out.print("Agência: ");
		@SuppressWarnings("unused")
		int agency = sc.nextInt();
		System.out.print("Conta (com dígito verificador): ");
		@SuppressWarnings("unused")
		int account = sc.nextInt();
		System.out.print("1.Pessoa Física 2.Pessoa Jurídica ");
		int typeperson = sc.nextInt();
		while(typeperson != 1 && typeperson != 2) {
			System.out.println("Tipo de pessoa inválido!");
			System.out.print("Insira um tipo de pessoa válido: ");
			typeperson = sc.nextInt();
		}
		System.out.print("Insira o valor: ");
		double value = sc.nextDouble();
		while(value > Holders.saldo) {
			System.out.println("Saldo Insuficiente!");
			System.out.print("Insira o valor: ");
			value = sc.nextDouble();
		}
		if(Password.consult(value) && Password.confirmation() && Password.authorization()) {
			Holders.saldo -= value;
			HomeScreen.menu();
			//Creditar o valor na conta destino
		}
		//sc.close();
	}
}