package program;
import java.util.Scanner;
import users.FullManager;
import users.Holders;
//import users.Manager;

public class Start {
	private static int aux;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//private static int opc = 0;
		System.out.print("\t\tDIGITAL BANK");
		int opc;
		
		do {
			System.out.print("\n\n1. Login 2.Cadastrar 0.Sair");
			System.out.print("\nEscolha uma opção: ");
			opc = sc.nextInt();
			switch(opc) {
			case 1:
				login();
				break;
			case 2:
				cadastro();
				break;
			case 0:
				System.out.print("\nSaindo...");
				break;
			default:
				System.out.print("\nOpção inválida!");
			}
		}while(opc!=0);
				
		sc.close();
	}

	public static void login(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nLogin: ");
		int login = sc.nextInt();
		System.out.print("Senha: ");
		int Password = sc.nextInt();
		if(login == Holders.cpf && Password == Holders.loginPassword) {
			//HomeScreen hom = new HomeScreen();
				
		}
		//Precisa conferir no banco de dados se já possui cadastro
		//para depois redirecionar ao menu
		
		sc.close();
	}
	public static void cadastro(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nInforme seu Nome Completo: ");
		Holders.name = sc.next();
		System.out.print("Informe seu CPF: ");
		Holders.cpf = sc.nextInt();
		System.out.print("Digite sua Idade: ");
		Holders.yearsOld = sc.nextInt();
		System.out.print("Informe seu E-mail: ");
		Holders.email = sc.next();
		System.out.print("Crie sua Senha de Login (apenas números): ");
		Holders.loginPassword = sc.nextInt();
		System.out.print("Crie sua Senha para Transações (apenas números): ");
		Holders.transactionPassword = sc.nextInt(); 
		int attempts = 3; 
		while(Holders.transactionPassword == Holders.loginPassword && attempts>0) { 
			System.out.print("\nSenhas iguais, crie uma senha diferente para Transações");
			System.out.print("\nVocê tem (" +attempts+ ") tentativa(s)" );
			System.out.print("\nSenha para Transações (apenas números): ");
			Holders.transactionPassword = sc.nextInt();
			attempts--;
			if(attempts == 0) {
				System.out.print("\nVocê excedeu a quantidade máxima de tentativas");
				System.out.print("\nPor favor, entre em contato com o Banco");
			}
		}
		FullManager ful = new FullManager();
		aux = ful.authorization();
		if(aux == 1) {
			Holders.saldo = 0;
		}
		
		sc.close();
	}

}