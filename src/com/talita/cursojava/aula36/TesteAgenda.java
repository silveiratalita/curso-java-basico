package com.talita.cursojava.aula36;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();

		System.out.println("Qual o nome da agenda?");
		String nomeAgenda = scan.nextLine();
		String telefones[] = new String[3];
		System.out.println("Agernda : " + nomeAgenda);
		agenda.setNomeAgenda(nomeAgenda);

		System.out.println("Você deve inserir 3 contatos");
		System.out.println("CONTATO 1-");

		Contato contato1 = new Contato();
		System.out.println("Insira o nome do contato");
		String nome = scan.nextLine();
		contato1.setNome(nome);
		System.out.println("Insira o email do contato");
		String email = scan.nextLine();
		contato1.setEmail(email);

		System.out.println("Insira o Telefone da casa");
		telefones[0] = scan.nextLine();
		contato1.setTelefone(telefones);
		System.out.println("Insira o Telefone do trabalho");
		telefones[1] = scan.nextLine();
		contato1.setTelefone(telefones);
		System.out.println("Insira o Telefone da escola");
		telefones[2] = scan.nextLine();
		contato1.setTelefone(telefones);
		agenda.adicionarContato(contato1);

		Contato contato2 = new Contato();
		System.out.println("Insira o nome do contato");
		nome = scan.nextLine();
		contato2.setNome(nome);
		System.out.println("Insira o email do contato");
		email = scan.nextLine();
		contato2.setEmail(email);

		System.out.println("Insira o Telefone da casa");
		telefones[0] = scan.nextLine();
		contato2.setTelefone(telefones);
		System.out.println("Insira o Telefone do trabalho");
		telefones[1] = scan.nextLine();
		contato2.setTelefone(telefones);
		System.out.println("Insira o Telefone da escola");
		telefones[2] = scan.nextLine();
		contato2.setTelefone(telefones);
		
		
		
		Contato contato3 = new Contato();
		System.out.println("Insira o nome do contato");
		nome = scan.nextLine();
		contato3.setNome(nome);
		System.out.println("Insira o email do contato");
		email = scan.nextLine();
		contato3.setEmail(email);
		System.out.println("Insira o Telefone da casa");
		telefones[0] = scan.nextLine();
		contato3.setTelefone(telefones);
		System.out.println("Insira o Telefone do trabalho");
		telefones[1] = scan.nextLine();
		contato3.setTelefone(telefones);
		System.out.println("Insira o Telefone da escola");
		telefones[2] = scan.nextLine();
		contato3.setTelefone(telefones);
		agenda.adicionarContato(contato2);

		agenda.retornaTodosOsContatos();

	}

}
