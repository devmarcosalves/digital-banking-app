package transactions;

import java.util.Scanner;
import users.Manager;

public class Financing {
	static Scanner sc = new Scanner(System.in);
	public static double valimovel;
	public static double valentrada;
	public static double finantotal;
	public static void realEstate() {
  	  int aux;
  	  System.out.println("\nFINANCIAMENTO IMOBILIÁRIO");
  	  System.out.print("Informe o valor do imóvel: ");
  	  valimovel = sc.nextDouble();
  	  System.out.print("Valor de entrada (mínimo de R$"+String.format("%.2f", valimovel*0.25)+"): ");
  	  valentrada = sc.nextDouble();
  	  while(valentrada < valimovel*0.25 || valentrada > valimovel) {
  		  System.out.println("--Valor Inválido--");
  		  System.out.println("Mínimo de R$"+String.format("%.2f", valimovel*0.25)+" e Máximo de R$"+String.format("%.2f", valimovel));
  		  System.out.println("Informe a sua entrada: ");
  		  valentrada = sc.nextDouble();
  	  }
  	  finantotal = (valimovel - valentrada);
  	  System.out.println("1. Casa 2. Apartamento 3.Terreno/Lote");
  	  System.out.print("Informe qual o tipo do seu imóvel: ");
  	  int opc = sc.nextInt();
  	  if(opc == 1) {
  		  System.out.print("Digite a quantidade de anos: ");
  		  double anosimovel = sc.nextDouble();
  		  double parcelas = (finantotal + (finantotal*0.09)) / (anosimovel * 12);
  		  System.out.println("\nPROPOSTA DE FINANCIAMENTO");
  		  System.out.println("Parcela Fixa de R$"+String.format("%.2f", parcelas)+" ao mês durante "+anosimovel+" anos");
  		  System.out.print("Digite 1 para aceitar ou 0 para negar: ");
  		  aux = sc.nextInt();
  		  System.out.println( (aux == 1) ? "Sua solicitação foi enviada para análise!" : (aux == 0) ? "Simulação cancelada!" : "Opção Inválida!" );
  		  if(Manager.analysis() == 1) {
  			  System.out.print("Financiamento Autorizado!");
  		  }else
  			  System.out.println("Sua solicitação de financiamento foi Indeferida");
  	  }else if(opc == 2) {
  		  
  	  }else if(opc == 3) {
  		  
  	  }else {
  		  System.out.println("Opção Inválida!");
  	  }
  	  //sc.close();
    }
}
