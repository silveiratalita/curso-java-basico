package com.talita.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("	Entre com o dia da semana (1-7):");
		int diaSemana = scan.nextInt();
		
		
/*	if(diaSemana==1) {//o if sempre vai usar expressõeslogicas, true or false, sempre é isso.
			System.out.println("Domingo");
		}  else if (diaSemana==2) {
			System.out.println("	Segunda");
		}else if (diaSemana==3) {
			System.out.println("	Terça");
		}else if (diaSemana==4) {
			System.out.println("	Quarta");
		}else if (diaSemana==5) {
			System.out.println("	Quinta");
		}else if (diaSemana==6) {
			System.out.println("	Sexta");
		}else if (diaSemana==7) {
			System.out.println("	Sabado");
		} else {
			System.out.println("	Não é um dia da semana válido");
		}
	
		
		switch (diaSemana) {
		case 1: System.out.println("	Domigo");  break;
		case 2: System.out.println("	Segunda"); break;
		case 3: System.out.println("	Terça"); break;
		case 4: System.out.println("	Quarta"); break;
		case 5: System.out.println("	Quinta"); break;
		case 6: System.out.println("	Sexta"); break;
		case 7: System.out.println("	Sabado"); break;
		default:System.out.println("	Não é um dia da semana válido");
		}*/
		
		/*exemplo sem o break
		switch (diaSemana) {
		case 1: System.out.println("	Domigo"); 
		case 2: System.out.println("	Segunda"); 
		case 3: System.out.println("	Terça"); 
		case 4: System.out.println("	Quarta");
		case 5: System.out.println("	Quinta"); 
		case 6: System.out.println("	Sexta"); 
		case 7: System.out.println("	Sabado"); break
		default:System.out.println("	Não é um dia da semana válido");
		}*/ 
		switch (diaSemana) {//o switch aceita byte,short, int, char ou enun e também aceita string
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.println("	dia útil"); break;
		case 1: 
		case 7:System.out.println("	fim de semana"); break;
		default:System.out.println("	Não é um dia da semana válido");
		}
		
	}

}
