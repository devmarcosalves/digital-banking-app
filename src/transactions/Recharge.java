package transactions;

import java.util.Scanner;

import users.Holders;

public class Recharge {
	static Scanner sc = new Scanner(System.in);
	public static void operators(){
		double aux;
		System.out.println("\n\t\tRECARGA");
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
				if(Holders.saldo >= recarga) {
					System.out.print("Digite 1 para Confirmar ou 0 para Cancelar: ");
					aux = sc.nextInt();
					if(aux == 1) {
						System.out.println("Recarga Realizada com Sucesso!");
						Holders.saldo -= recarga;
						break;
					}else if(aux == 0) {
						System.out.println("Solicitação de Recarga Cancelada!");
					}else {
						System.out.println("Opção Inválida!\n");
					}
				}else {
					System.out.println("Saldo Insuficiente!\n");
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
