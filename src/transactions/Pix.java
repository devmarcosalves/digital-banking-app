package transactions;

import java.util.Scanner;
import users.Holders;

public class Pix {
	public static void transfer(){
		double aux;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t\tPIX");
		do {
			System.out.println("1. Celular 2.CPF/CNPJ 3.E-mail 0.Sair");
			System.out.print("Informe o tipo da chave pix da conta destino: ");
			aux = sc.nextInt();
			if(aux == 1 || aux == 2 || aux == 3) {
				System.out.print("Digite a chave Pix: ");
				String key = sc.next();
				System.out.print("Digite o valor: ");
				double value = sc.nextDouble();
				if(Holders.saldo >= value) {
					System.out.print("Digite 1 para Confirmar ou 0 para Cancelar: ");
					aux = sc.nextInt();
					if(aux == 1) {
						System.out.println("Pix Realizado com Sucesso!");
						Holders.saldo -= value;
						//Saldo da conta destino recebe o valor do Pix
						break;
					}else if(aux == 0){
						System.out.println("Pix Cancelado!");
					}else {
						System.out.println("Opção Inválida!\n");
					}
				}else {
					System.out.println("Saldo Insuficiente!\n");
				}
			}else if(aux == 0){
				break;
			}else{
				System.out.println("Chave Pix não encontrada, tente novamente!\n");
			}
		}while(aux!=0);
    }
}
