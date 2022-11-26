package transactions;

import java.util.Scanner;

import screens.HomeScreen;
import users.Manager;

public class Financing {
	static Scanner sc = new Scanner(System.in);
	public static double valimovel;
	public static double valentrada;
	public static double finantotal;
	public static int aux;
	public static double taxaCasa = 0.09, taxaApart = 0.15, taxaTerLot = 0.05;
	public static void realEstate() {
  	  System.out.println("\n\t\tFINANCIAMENTO IMOBILIÁRIO\n");
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
  	  int opc;
  	  do {
	  	  System.out.println("1. Casa 2. Apartamento 3.Terreno/Lote 0.Sair");
	  	  System.out.print("Informe qual o tipo do seu imóvel: ");
	  	  opc = sc.nextInt();
	  	  switch(opc) {
		  	  case 1:
		  		  properties(taxaCasa);
		  		  break;
		  	  case 2:
		  		  properties(taxaApart);
		  		  break;
		  	  case 3:
		  		  properties(taxaTerLot);
		  		  break;
		  	  case 0:
		  		  HomeScreen.menu();
		  	  default:
		  		  System.out.println("Opção Inválida!\n");
		  	  }
  	  }while(opc != 0);
	}
  	  public static void properties(double taxa) {
  		System.out.print("Digite a quantidade de anos: ");
		  double anosimovel = sc.nextDouble();
		  double parcelas = (finantotal + (finantotal*taxa)) / (anosimovel * 12);
		  System.out.println("\nPROPOSTA DE FINANCIAMENTO");
		  System.out.print("Parcela Fixa de R$"+String.format("%.2f", parcelas)+" ao mês durante "+anosimovel+" anos");
		  if(Password.confirmation() && Password.authorization()){
			  System.out.println("Sua solicitação foi enviada para análise!");
			  if(Manager.analysis()) {
				  System.out.print("Financiamento Autorizado!\n");
			  }else
				  System.out.println("Sua solicitação de financiamento foi Indeferida!");
		  }
  	  }
  	  //sc.close();
}