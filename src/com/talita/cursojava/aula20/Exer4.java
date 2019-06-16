package com.talita.cursojava.aula20;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		
		int dia=0;
		
		int hora=0;
		
		int opcao=0;
		
		int comp=0;
		
		int agendaIDia=0;
		int agendaJHora=0;
		int compK=0;
		
		Scanner scan=new Scanner(System.in);
	
		
		//criar a matriz 30*24
		int agenda[][][]=new int [30][23][1];
		System.out.println(" dimensao  1="+agenda.length+" ");
		System.out.println(" dimensao  2="+agenda[1].length+" ");
		System.out.println(" dimensao  3="+agenda[1][1].length+" ");
		
		 for(int i=0; i<=agenda.length-1;i++) {
			 for(int j=0; j<=agenda[j].length-1; j++) {
				 for(int k=0;k<=agenda[j][k].length-1; k++) {
				agenda[i][j][k]+=1;//erro nessa linha
					System.out.println(agenda[i][j][k]);
					 
					 
				 }
			 }
		
			 
			 
		 }
			
	
	//criar a opçãode consultar
		
		
	//criar a opção de alterar
		
		System.out.println("informe 1 para consulta e 2 para alteração");
		opcao=scan.nextInt();
		System.out.println("Informe o dia que deseja alterar");
		dia=scan.nextInt();
		System.out.println("Informe a hora que deseja alterar de 0 a 23 horas- sendo 0 hora para meia noite.");
		hora=scan.nextInt();
		
	//na opção consultar, entrar na matriz e mostrar as posições requeridas
		
		
	//na opção alterar, primeiro eu mostro o consultado e depois mostro o alterado
		
		
		switch(opcao) {
		//========================================================
		case 1://na opção consultar, entrar na matriz e mostrar as posições requeridas
			for(int i=0; i<=agenda.length;i++) {
				for(int j=0;j<=agenda[i][j].length; j++) {
					for(int k=0; j<=agenda[i][j][k];k++) {
						
					
					agendaIDia=i+1;
					agendaJHora=hora;
					compK=agenda [i][j][k];
					if(agendaIDia==dia){
					//mostrar na telao dia 
						System.out.print(" Dia "+dia+". ");
					}
					if(agendaJHora==hora) {
						//mostrar hora
						System.out.print(" Hora "+hora+". ");
						String compromisso=""; 
						if(compK==1) {
							compromisso="trabalhar";
						}if(compK==2) {
							compromisso="estudar";
						}if(compK<2) {
							compromisso=" Não consta nenhum compromisso";
						}//mostrar compromisso
						System.out.println("o comprimisso é "+compromisso+" . ");
						
					}
					}
					
				}
				
			}
			break;
			//===========================================================
		case 2:////na opção alterar, primeiro eu mostro o consultado e depois mostro o alterado
			
			//mostrar a consulta
			for(int i=0; i<=agenda.length;i++) {
				for(int j=0;j<=agenda[i][j].length; j++) {
					for(int k=0; j<=agenda[i][j][k];k++) {
						
					
					agendaIDia=i+1;
					agendaJHora=hora;
					compK=agenda [i][j][k];
					if(agendaIDia==dia){
					//mostrar na telao dia 
						System.out.print(" Dia "+dia+". ");
					}
					if(agendaJHora==hora) {
						//mostrar hora
						System.out.print(" Hora "+hora+". ");
						String compromisso=""; 
						if(compK==1) {
							compromisso="trabalhar";
						}if(compK==2) {
							compromisso="estudar";
						}if(compK<2) {
							compromisso=" Não consta nenhum compromisso";
						}//mostrar compromisso
						System.out.println("o comprimisso é "+compromisso+" . ");
						
					}
					}
					
				}
				
			}
		}
		
		//agora mostre a alteração
		
		System.out.println("Informe o dia que deseja alterar");
		dia=scan.nextInt();
		System.out.println("Informe a hora que deseja alterar de 0 a 23 horas- sendo 0 hora para meia noite.");
		hora=scan.nextInt();
		for(int i=0; i<=agenda.length;i++) {
			for(int j=0;j<=agenda[i][j].length; j++) {
				for(int k=0; j<=agenda[i][j][k];k++) {
					
				
				agendaIDia=i+1;
				agendaJHora=hora;
				compK=agenda [i][j][k];
				if(agendaIDia==dia){
				//mostrar na telao dia 
					System.out.print(" Dia "+dia+". ");
				}
				if(agendaJHora==hora) {
					//mostrar hora
					System.out.print(" Hora "+hora+". ");
					String compromisso=""; 
					if(compK==1) {
						compromisso="trabalhar";
					}if(compK==2) {
						compromisso="estudar";
					}if(compK<2) {
						compromisso=" Não consta nenhum compromisso";
					}//mostrar compromisso
					System.out.println("o comprimisso é "+compromisso+" . ");
					
				}
				}
				
			}
			break;
		}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}

