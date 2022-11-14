package program;
import java.util.Scanner;

public class Start {
	public static int login;
	public static int loginPassword;
	public static String name;
	public static int cpf;
	public static String email;
	public static int transactionPassword;
	public static int yearsOld;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//private static int opc = 0;
		System.out.print("\t\tDIGITAL BANK");
		System.out.print("\n\n1. Login 2.Cadastrar 0.Sair");
		System.out.print("\nEscolha uma opção: ");
		int opc = sc.nextInt();
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
				
		sc.close();
	}

	public static void login(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nLogin: ");
		login = sc.nextInt();
		System.out.print("Senha: ");
		loginPassword = sc.nextInt();

		//Precisa conferir no banco de dados se já possui cadastro
		//para depois redirecionar ao menu
		
		sc.close();
	}
	public static void cadastro(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nInforme seu Nome Completo: ");
		name = sc.next();
		System.out.print("Informe seu CPF: ");
		cpf = sc.nextInt();
		System.out.print("Digite sua Idade: ");
		yearsOld = sc.nextInt();
		System.out.print("Informe seu E-mail: ");
		email = sc.next();
		System.out.print("Crie sua Senha de Login (apenas números): ");
		loginPassword = sc.nextInt();
		System.out.print("Crie sua Senha para Transações (apenas números): ");
		transactionPassword = sc.nextInt(); 
		int attempts = 3; 
		while(transactionPassword == loginPassword && attempts>0) { 
			System.out.print("\nSenhas iguais, crie uma senha diferente para Transações");
			System.out.print("\nVocê tem (" +attempts+ ") tentativa(s)" );
			System.out.print("\nSenha para Transações (apenas números): ");
			transactionPassword = sc.nextInt();
			attempts--;
			if(attempts == 0) {
				System.out.print("\nVocê excedeu a quantidade máxima de tentativas");
				System.out.print("\nPor favor, entre em contato com o Banco");
			}
		}
		
		sc.close();
	}

}