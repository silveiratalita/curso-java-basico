package com.talita.cursojava.aula34;

import java.util.Scanner;

public class TesteConversor {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int metros;
		int pes;
		int cm;
		int mq;
		int acres;
		System.out.println("Informe a op��o de convers�o desejada:");
		System.out.println("1:Metro quadrado->P�s quadrados");
		System.out.println("2:P�s quadrados->Metros quadrados");
		System.out.println("3:P�s quadrados->Centimetros quadrados");
		System.out.println("4:Centimetros quadrados->P�s quadrados");
		System.out.println("5:Milha quadradas->Acres");
		System.out.println("6:Acres->Milha quadradas");
		System.out.println("7:Milha quadradas->Acres");
		System.out.println("8:Acres->P�s Quadrados");
		System.out.println("7:P�s quadrados->Acres");
		
		int opcao=scan.nextInt();
		
		
		switch (opcao) {
		case 1: 
			System.out.println("informe de quantia em metros para convers�o para pes quadrados");
			
			metros	=scan.nextInt();
			ConversaoDeUnidadesDeArea.metrosQuadradosParaPesQuadrados(metros);
			
			break;
		case 2: 
			
			System.out.println("informe de quantia em p�s para convers�o em metros");
			
			pes	=scan.nextInt();
			
			ConversaoDeUnidadesDeArea.pesQuadradosParaMetrosQuadrados(pes);
			
			break;
		case 3: 
			System.out.println("informe de quantia em p�s  para convers�o em centimetro quadrado");
			
			pes	=scan.nextInt();
			ConversaoDeUnidadesDeArea.pesQuadradosParaCentimetrosQuadrados(pes);
			break;
			
		case 4: 
			System.out.println("informe de quantia em centimetros quadrados para convers�o em p�s quadrados");
			
			cm=scan.nextInt();
			ConversaoDeUnidadesDeArea.centimetrosQuadradosParaPesQuadrados(cm);
			
			break;
		case 5: 
			System.out.println("informe a quantia em Milha quadrada para convers�o em Acres");
			
			mq=scan.nextInt();
			ConversaoDeUnidadesDeArea.MilhaQuadradaParaAcres(mq);
			break;
		case 6: 
			System.out.println("informe a quantia em Acres para convers�o em Milha quadrada");
			
			acres=scan.nextInt();
			ConversaoDeUnidadesDeArea.acresParaMilhasQuadradas(acres);
			
			break;
		case 7: 
			System.out.println("informe a quantia em Acres para convers�o em Pes quadrados");
			
			acres=scan.nextInt();
			ConversaoDeUnidadesDeArea.acresParaPesQuadrados(acres);
			break;
		case 8:
			System.out.println("informe a quantia em P�s Quadrados para convers�o em Acres");
			
			pes=scan.nextInt();
			ConversaoDeUnidadesDeArea.pesQuadradosParaAcres(pes);
			
		default:
			System.out.println("Op��o invalida");
			
		}
	}

}
