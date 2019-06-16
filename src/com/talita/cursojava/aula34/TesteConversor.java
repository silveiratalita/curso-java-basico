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
		System.out.println("Informe a opção de conversão desejada:");
		System.out.println("1:Metro quadrado->Pés quadrados");
		System.out.println("2:Pés quadrados->Metros quadrados");
		System.out.println("3:Pés quadrados->Centimetros quadrados");
		System.out.println("4:Centimetros quadrados->Pés quadrados");
		System.out.println("5:Milha quadradas->Acres");
		System.out.println("6:Acres->Milha quadradas");
		System.out.println("7:Milha quadradas->Acres");
		System.out.println("8:Acres->Pés Quadrados");
		System.out.println("7:Pés quadrados->Acres");
		
		int opcao=scan.nextInt();
		
		
		switch (opcao) {
		case 1: 
			System.out.println("informe de quantia em metros para conversão para pes quadrados");
			
			metros	=scan.nextInt();
			ConversaoDeUnidadesDeArea.metrosQuadradosParaPesQuadrados(metros);
			
			break;
		case 2: 
			
			System.out.println("informe de quantia em pés para conversão em metros");
			
			pes	=scan.nextInt();
			
			ConversaoDeUnidadesDeArea.pesQuadradosParaMetrosQuadrados(pes);
			
			break;
		case 3: 
			System.out.println("informe de quantia em pés  para conversão em centimetro quadrado");
			
			pes	=scan.nextInt();
			ConversaoDeUnidadesDeArea.pesQuadradosParaCentimetrosQuadrados(pes);
			break;
			
		case 4: 
			System.out.println("informe de quantia em centimetros quadrados para conversão em pés quadrados");
			
			cm=scan.nextInt();
			ConversaoDeUnidadesDeArea.centimetrosQuadradosParaPesQuadrados(cm);
			
			break;
		case 5: 
			System.out.println("informe a quantia em Milha quadrada para conversão em Acres");
			
			mq=scan.nextInt();
			ConversaoDeUnidadesDeArea.MilhaQuadradaParaAcres(mq);
			break;
		case 6: 
			System.out.println("informe a quantia em Acres para conversão em Milha quadrada");
			
			acres=scan.nextInt();
			ConversaoDeUnidadesDeArea.acresParaMilhasQuadradas(acres);
			
			break;
		case 7: 
			System.out.println("informe a quantia em Acres para conversão em Pes quadrados");
			
			acres=scan.nextInt();
			ConversaoDeUnidadesDeArea.acresParaPesQuadrados(acres);
			break;
		case 8:
			System.out.println("informe a quantia em Pés Quadrados para conversão em Acres");
			
			pes=scan.nextInt();
			ConversaoDeUnidadesDeArea.pesQuadradosParaAcres(pes);
			
		default:
			System.out.println("Opção invalida");
			
		}
	}

}
