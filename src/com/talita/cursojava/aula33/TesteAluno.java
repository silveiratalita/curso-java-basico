package com.talita.cursojava.aula33;


import java.io.ObjectInputStream.GetField;import java.security.GeneralSecurityException;
import java.util.Scanner;



public class TesteAluno {

	 public static void main(String[] args){
	        
		 	
		 
	        Scanner scan = new Scanner(System.in);
	        
	        Aluno aluno = new Aluno();//instancia
	     
	        System.out.println("");
	       aluno.pegaNomeMatriculaCurso();
	        aluno.disciplinas();
	        aluno.pegaNotas();
	        aluno.calculaMediaD1();
	        aluno.calculaMediaD2();
	        aluno.calculaMediaD3();
	        aluno.mostraMediasEAprovadoOuNão();
	        aluno.mostraTudo();
	        
	        
	        
	        		 
	        		
	       
	        
	        
	        }
	    }
