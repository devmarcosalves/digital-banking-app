package screens;

import java.util.Scanner;
import transactions.Pix;
import transactions.Recharge;
import transactions.Balance;
import transactions.Deposit;
import transactions.Loan;
import transactions.Transfer;
import transactions.Financing;
import transactions.Payment;
import users.Holders;
import program.transactionPassword;

public class HomeScreen {
	static Scanner sc = new Scanner(System.in);
	public static void menu(){
        int opc;
        do{
        	if(Holders.transactionPassword != 0) {
		        System.out.println("\n1.PIX - 2.RECARGA - 3.SALDO 4.DEPÓSITO");
		        System.out.println("5.TRANSFERÊNCIA 6.EMPRESTIMO 7.FINANCIAMENTO");
		        System.out.println("8.PAGAMENTO 9.REDEFINIR SENHA DE TRANSAÇÕES 0.SAIR");
		        System.out.print("Escolha uma opção: ");
		        opc = sc.nextInt();
		        switch(opc){
		            case 1: 
		                Pix.transfer();
		                break;
		            case 2: 
		                Recharge.operators();
		                break;
		            case 3:
		                Balance.saldo(Holders.saldo);
		                break;
		            case 4:
		            	Deposit dep = new Deposit();
		                dep.deposito(Holders.saldo);
		                break;
		            case 5:
		                Transfer.values();
		                break;
		            case 6: 
		                Loan.money();
		                break;
		            case 7:
		                Financing.realEstate();
		                break;
		            case 8:
		                Payment.billet();
		                break;
		            case 9:
		            	transactionPassword.reset();
		            	break;
		            case 0:
		            	System.out.print("\n");
		            	break;
		            default:
		                System.out.println("Opção Inválida!");
		                break;
		        }
        	}else {
        		System.out.println("Senha de Transações Bloqueada!");
        		System.out.print("Digite 1 para Desbloquear ou 0 para Sair: ");
        		opc = sc.nextInt();
        		if(opc == 1) {
        			transactionPassword.reset();
        		}else if(opc == 0) {
        			break;
        		}else
        			System.out.println("Opção Inválida!");
        	}
        }while(opc!=0);
    //sc.close();
    }
}
