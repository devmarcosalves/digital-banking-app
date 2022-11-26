package transactions;

import java.util.Scanner;
import users.Holders;

public class Pix {
	static Scanner sc = new Scanner(System.in);
	public static void transfer(){
		double aux;
		do {
			System.out.println("\n\t\tPIX\n");
			System.out.println("1. Celular 2.CPF/CNPJ 3.E-mail 0.Sair");
			System.out.print("Informe o tipo da chave pix da conta destino: ");
			aux = sc.nextInt();
			if(aux == 1 || aux == 2 || aux == 3) {
				System.out.print("Digite a chave Pix: ");
				@SuppressWarnings("unused")
				String key = sc.next();
				//Conferir se a chave pix é válida
				System.out.print("Digite o valor: ");
				double value = sc.nextDouble();
				if(Password.consult(value) && Password.confirmation() && Password.authorization()) {
					Holders.saldo -= value;
					//Saldo da conta destino recebe o valor do Pix
					break;
				}
			}else if(aux == 0){
				break;
			}else{
				System.out.println("Chave Pix não encontrada, tente novamente!");
			}
		}while(aux!=0);
		//sc.close();
    }
}