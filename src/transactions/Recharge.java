package transactions;

import java.util.Scanner;

import users.Holders;

public class Recharge {
	static Scanner sc = new Scanner(System.in);
	public static void operators(){
		double aux;
		System.out.println("\n\t\tRECARGA\n");
		do {
			System.out.println("1. TIM 2. VIVO 3.CLARO 0.SAIR");
			System.out.print("Selecione a sua Operadora: ");
			aux = sc.nextInt();
			if(aux == 1 || aux == 2 || aux == 3) {
				System.out.print("Digite o número: ");
				@SuppressWarnings("unused")
				double number = sc.nextDouble();
				System.out.print("Informe o valor da Recarga: ");
				int recarga = sc.nextInt();
				if(Password.consult(recarga) && Password.confirmation() && Password.authorization()) {
					Holders.saldo -= recarga;
					break;
				}
			}else if(aux == 0){
				break;
			}else{
				System.out.println("Operadora não indentificada, tente novamente!\n");
			}
		}while(aux!=0);
		//sc.close();
    }
}