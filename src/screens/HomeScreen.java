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

public class HomeScreen {
	public static void menu(){
        Scanner sc = new Scanner(System.in);
        int opc;
        do{
	        System.out.println("\n1.PIX - 2.RECARGA - 3.SALDO");
	        System.out.println("4.DEPÓSITO 5.TRANSFERÊNCIA 6.EMPRESTIMO");
	        System.out.println("7. FINANCIAMENTO 8.PAGAMENTO 0.SAIR");
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
	            case 0:
	            	break;
	            default:
	                System.out.println("Opção Inválida!");
	                break;
	        }
        }while(opc!=0);
    //sc.close();
    }
}
