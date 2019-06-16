package com.talita.cursojava.exerciciosaula47a52;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class TesteAgenda {

	Scanner scan=new Scanner(System.in);


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int contador=0;
		Agenda agenda =new Agenda();
		int opcao;

		System.out.println("Digite 1 para adicionar e 2 para consultar os contatos na agenda, 0 para sair");
		do {
			opcao   = scan.nextInt();
			if(opcao==1) {
				criaObj(contador);
				contador+=1;
			}else if(opcao==2) {
				agenda.consultarContato();
			}
		}while(opcao!=0);








	}

	public static int criaObj(int contador)   {
		try {
			String nomeObj="cont"+contador;
			Scanner scan=new Scanner(System.in);
			System.out.println("informe o nome do contatdo");
			String nome=scan.nextLine();
			System.out.println("informe o telefone do contatdo");
			String telefone=scan.nextLine();
			Contato nomeObjeto=new Contato(nome, contador+1, telefone);
		
			addListinha(nomeObjeto );

			return contador;
		}catch(Exception e) {
			System.out.println("entrada invalida");
		}
		return contador;
	}
	public static Contato addListinha(Contato cont)  {
		try {
			Contato contatos[]=new Contato[2];
			for(int i=0; i<contatos.length; i++) {
				if(contatos[i]==null) {
			contatos[i]=cont;
				}else {
					System.out.println("não há espaço na lista");
					
				}
			
			Agenda agenda =new Agenda();
			agenda.adicionarContato(contatos[i]);
			}
			return  cont;
		}catch(Exception e) {
			System.out.println("Não foi possivel add um contato ");
		}
		return  cont;
	}

}






