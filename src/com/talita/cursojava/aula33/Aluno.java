package com.talita.cursojava.aula33;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aluno{
	
	 Scanner scan=new Scanner(System.in);
	  DecimalFormat df=new DecimalFormat("#;##");
	    private String nomeAluno;
	    private long matricula;
	    private String  nomeDisciplina1;
	    private String  nomeDisciplina2;
	    private String  nomeDisciplina3;
	    private String curso;
	    private double nota1Discp1;
	    private double nota2Discp1;
	    private double nota3Discp1;
	    private double nota4Discp1;
	    
	    private double nota1Discp2;
	    private double nota2Discp2;
	    private double nota3Discp2;
	    private double nota4Discp2;
	    
	    private double nota1Discp3;
	    private double nota2Discp3;
	    private double nota3Discp3;
	    private double nota4Discp3;
	    
	    private double mediaD1;
	    private double mediaD2;
	    private double mediaD3;
	    
	    
	    
		public Aluno() {}

		public Aluno(String nomeAluno, long matricula, String nomeDisciplina1, String nomeDisciplina2,
					String nomeDisciplina3, String curso, double nota1Discp1, double nota2Discp1, double nota3Discp1,
					double nota4Discp1, double nota1Discp2, double nota2Discp2, double nota3Discp2, double nota4Discp2,
					double nota1Discp3, double nota2Discp3, double nota3Discp3, double nota4Discp3,double mediaD1, double mediaD2, double mediaD3) {
				super();
				this.nomeAluno = nomeAluno;
				this.matricula = matricula;
				this.nomeDisciplina1 = nomeDisciplina1;
				this.nomeDisciplina2 = nomeDisciplina2;
				this.nomeDisciplina3 = nomeDisciplina3;
				this.curso = curso;
				this.nota1Discp1 = nota1Discp1;
				this.nota2Discp1 = nota2Discp1;
				this.nota3Discp1 = nota3Discp1;
				this.nota4Discp1 = nota4Discp1;
				this.nota1Discp2 = nota1Discp2;
				this.nota2Discp2 = nota2Discp2;
				this.nota3Discp2 = nota3Discp2;
				this.nota4Discp2 = nota4Discp2;
				this.nota1Discp3 = nota1Discp3;
				this.nota2Discp3 = nota2Discp3;
				this.nota3Discp3 = nota3Discp3;
				this.nota4Discp3 = nota4Discp3;
				this.mediaD1 = mediaD1;
				this.mediaD2 = mediaD2;
				this.mediaD3 = mediaD3;
				
	    
		}    
	    
	  

	public String getNomeAluno() {
			return nomeAluno;
		}





		public void setNomeAluno(String nomeAluno) {
			this.nomeAluno = nomeAluno;
		}





		public long getMatricula() {
			return matricula;
		}





		public void setMatricula(long matricula) {
			this.matricula = matricula;
		}





		public String getNomeDisciplina1() {
			return nomeDisciplina1;
		}





		public void setNomeDisciplina1(String nomeDisciplina1) {
			this.nomeDisciplina1 = nomeDisciplina1;
		}





		public String getNomeDisciplina2() {
			return nomeDisciplina2;
		}





		public void setNomeDisciplina2(String nomeDisciplina2) {
			this.nomeDisciplina2 = nomeDisciplina2;
		}





		public String getNomeDisciplina3() {
			return nomeDisciplina3;
		}





		public void setNomeDisciplina3(String nomeDisciplina3) {
			this.nomeDisciplina3 = nomeDisciplina3;
		}





		public String getCurso() {
			return curso;
		}





		public void setCurso(String curso) {
			this.curso = curso;
		}





		public double getNota1Discp1() {
			return nota1Discp1;
		}





		public void setNota1Discp1(double nota1Discp1) {
			this.nota1Discp1 = nota1Discp1;
		}





		public double getNota2Discp1() {
			return nota2Discp1;
		}





		public void setNota2Discp1(double nota2Discp1) {
			this.nota2Discp1 = nota2Discp1;
		}





		public double getNota3Discp1() {
			return nota3Discp1;
		}





		public void setNota3Discp1(double nota3Discp1) {
			this.nota3Discp1 = nota3Discp1;
		}





		public double getNota4Discp1() {
			return nota4Discp1;
		}





		public void setNota4Discp1(double nota4Discp1) {
			this.nota4Discp1 = nota4Discp1;
		}





		public double getNota1Discp2() {
			return nota1Discp2;
		}





		public void setNota1Discp2(double nota1Discp2) {
			this.nota1Discp2 = nota1Discp2;
		}





		public double getNota2Discp2() {
			return nota2Discp2;
		}





		public void setNota2Discp2(double nota2Discp2) {
			this.nota2Discp2 = nota2Discp2;
		}





		public double getNota3Discp2() {
			return nota3Discp2;
		}





		public void setNota3Discp2(double nota3Discp2) {
			this.nota3Discp2 = nota3Discp2;
		}





		public double getNota4Discp2() {
			return nota4Discp2;
		}





		public void setNota4Discp2(double nota4Discp2) {
			this.nota4Discp2 = nota4Discp2;
		}





		public double getNota1Discp3() {
			return nota1Discp3;
		}





		public void setNota1Discp3(double nota1Discp3) {
			this.nota1Discp3 = nota1Discp3;
		}





		public double getNota2Discp3() {
			return nota2Discp3;
		}





		public void setNota2Discp3(double nota2Discp3) {
			this.nota2Discp3 = nota2Discp3;
		}





		public double getNota3Discp3() {
			return nota3Discp3;
		}





		public void setNota3Discp3(double nota3Discp3) {
			this.nota3Discp3 = nota3Discp3;
		}





		public double getNota4Discp3() {
			return nota4Discp3;
		}





		public void setNota4Discp3(double nota4Discp3) {
			this.nota4Discp3 = nota4Discp3;
		}


	
	public void pegaNomeMatriculaCurso() {
		System.out.println("Por favor, informe o Nome do Aluno");
      nomeAluno=scan.nextLine();
        System.out.println("Por favor, informe o curso");
      curso=scan.nextLine();
	}
		
	public void disciplinas() {
		System.out.println("Por favor, informe as disciplinas cursadas");
        System.out.print("Disciplina1");
        nomeDisciplina1=scan.nextLine();
        System.out.print("Disciplina2");
        nomeDisciplina2=scan.nextLine();
        System.out.print("Disciplina3");
       nomeDisciplina3=scan.nextLine();
		
	}
	
	public void pegaNotas() {
		System.out.println("Por favor, informe as notas das disciplinas ");
		System.out.println(nomeDisciplina1);
        nota1Discp1=scan.nextDouble();
        
        nota2Discp1=scan.nextDouble();
        
        nota3Discp1=scan.nextDouble();
        
        System.out.println(nomeDisciplina2);
        nota1Discp2=scan.nextDouble();
        
        nota2Discp2=scan.nextDouble();
        
        nota3Discp2=scan.nextDouble();
        
        System.out.println(nomeDisciplina3);
        nota1Discp3=scan.nextDouble();
        
        nota2Discp3=scan.nextDouble();
        
        nota3Discp3=scan.nextDouble();
      
	}
		public double calculaMediaD1() {
			
			System.out.println("Calculando a media da " +nomeDisciplina1);
	       mediaD1= (nota1Discp1+ nota2Discp1+ nota3Discp1)/3;
	       df.format(mediaD1);
	       return  mediaD1;
		}
		
		public double calculaMediaD2() {
			
			System.out.println("Calculando a media da " +nomeDisciplina2);
		       mediaD2= (nota1Discp2+ nota2Discp2+ nota3Discp2)/3;
		       df.format(mediaD2);
		       return mediaD2;
			
		}
	public double calculaMediaD3() {
			
			System.out.println("Calculando a media da " +nomeDisciplina3);
		       mediaD3= (nota1Discp3+ nota2Discp3+ nota3Discp3)/3;
		       df.format(mediaD3);
		       return mediaD3;
		}
	
	public void mostraMediasEAprovadoOuNão() {
		
		System.out.println("Media da  " +nomeDisciplina1+" = "+mediaD1);
		if (mediaD1<7) {
			System.out.println("Reprovado");
		}else {
			System.out.println("Aprovado");
		}
		System.out.println("Media da  " +nomeDisciplina2+" = "+mediaD2);  
		if (mediaD2<7) {
			System.out.println("Reprovado");
		}else {
			System.out.println("Aprovado");
		}
		System.out.println("Media da  " +nomeDisciplina3+" = "+mediaD3);
		if (mediaD3<7) {
			System.out.println("Reprovado");
		}else {
			System.out.println("Aprovado");
		}
	}
		public void mostraTudo() {
			
			System.out.println("");
			
			pegaNomeMatriculaCurso();
			
			pegaNotas();
			calculaMediaD1();
			calculaMediaD2();
			calculaMediaD3();
			mostraMediasEAprovadoOuNão();
			
			
			
			
		}
		
		}









	



	
	

	