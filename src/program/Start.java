package program;

import java.util.Scanner;
import users.FullManager;
import users.Holders;
import screens.HomeScreen;
//import users.Manager;

public class Start {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		HomeScreen.menu();
		//private static int opc = 0;
		System.out.print("\t\tDIGITAL BANK\n");
		int opc;
		
		do {
			System.out.print("\n1. Login 2.Cadastro \n3.Depósito 0.Sair");
			System.out.print("\nEscolha uma opção: ");
			opc = sc.nextInt();
			switch(opc) {
			case 1:
				login();
				break;
			case 2:
				registration();
				break;
			case 3:
				deposit();
				break;
			case 0:
				break;
			default:
				System.out.print("\nOpção inválida!");
			}
		}while(opc!=0);
		System.out.print("\nPrograma encerrado com sucesso.");
		//sc.close();
	}

	public static void login(){
		System.out.print("\nLogin: ");
		double login = sc.nextDouble();
		System.out.print("Senha: ");
		int Password = sc.nextInt();
		if(login == Holders.cpf && Password == Holders.loginPassword) {
			HomeScreen.menu();	
		}else
			System.out.println("Login ou senha inválido!");
		//Precisa conferir no banco de dados se já possui cadastro
		//para depois redirecionar ao menu
		//sc.close();
	}
	public static void registration(){
		System.out.print("\nInforme seu Nome Completo: ");
		Holders.name = sc.next();
		System.out.print("Informe seu CPF: ");
		Holders.cpf = sc.nextDouble();
		System.out.print("Digite sua Idade: ");
		Holders.yearsOld = sc.nextInt();
		System.out.print("Informe seu E-mail: ");
		Holders.email = sc.next();
		System.out.print("Crie sua Senha de Login (máximo de 8 números): ");
		Holders.loginPassword = sc.nextInt();
		System.out.print("Crie sua Senha para Transações (apenas 6 números): ");
		Holders.transactionPassword = sc.nextInt(); 
		int attempts = 3; 
		while(Holders.transactionPassword == Holders.loginPassword && attempts > 0) {
			System.out.print("\nSenhas iguais, crie uma senha diferente para Transações");
			System.out.print("\nVocê tem (" +attempts+ ") tentativa(s)" );
			System.out.print("\nSenha para Transações (apenas 6 números): ");
			Holders.transactionPassword = sc.nextInt();
			attempts--;
			if(attempts == 0) {
				System.out.print("\nVocê excedeu a quantidade máxima de tentativas");
				System.out.print("\nPor favor, entre em contato com o Banco");
			}
		}
		System.out.println("Solicitação de cadastro finalizado com sucesso, aguarde aprovação\n");
		if(Holders.transactionPassword != Holders.loginPassword && FullManager.authorization() == 1) {
			Holders.saldo = 0;
			System.out.println("Conta criada com Sucesso!");
		}
		//sc.close();
	}
	public static void deposit() {
		System.out.print("\nInforme o CPF da conta de destino: ");
		double cpfdestino = sc.nextDouble();
		System.out.print("Digite o valor que deseja depositar: ");
		double valordep = sc.nextDouble();
		//Pesquisa no Banco de Dados os dados da pessoa e exibe abaixo
		if(cpfdestino == Holders.cpf) {
			System.out.print("\nConfirme os dados");
			System.out.println("\nNome: "+Holders.name);
			System.out.println("CPF: "+Holders.cpf);
			System.out.println("Valor: R$"+valordep);
			System.out.print("\nTecle 1 para confirma ou 0 para cancelar: ");
			int aux = sc.nextInt();
			if(aux == 1) {
				System.out.print("\nProcedimento finalizado com sucesso!");
				System.out.print("\nO valor será liberado após a confirmação do Gerente.");
				//Manager.confirmation();
			}else if(aux == 0) {
				System.out.println("Procedimento Cancelado");
			}else
				System.out.println("Opção Inválida");
		}else 
			System.out.println("Conta não identificada");
		
		//cpfdestino = sc.nextInt();
		//sc.close();
	}

}