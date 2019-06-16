package com.talita.cursojava.exerciciosaula27;

import java.text.DecimalFormat;

public class Aluno {
	DecimalFormat df= new DecimalFormat("#.#");
String nome;
long matricula;
String curso;
String [] disciplina=new String[3];
//String disciplina[];
///double notasCivil[];
//double notasPenal[];
//double notasTributario[];
boolean aprovado;
double mediaCivil=0;
double mediaPenal=0;
double mediaTrib=0;
double somaCivil=0;
double somaPenal=0;
double somaTrib=0;
double []notasCivil=new double[3];
double []notasPenal=new double[3];
double []notasTributario=new double[3];
	
boolean calcularAprovacaoCivil() {
for (int i=0; i<notasCivil.length; i++) {
	 somaCivil+=notasCivil[i];
}
mediaCivil=somaCivil/3;

if(mediaCivil< 7) {
	aprovado=false;
	
	System.out.println("Reprovado em Direito civil. "+df.format(mediaCivil));
	
}else {
	aprovado=true;
	System.out.println("Aprovado em Direito civil. " + df.format(mediaCivil));
}
	return aprovado;
	
	
	

}
boolean calcularAprovacaoPenal() {
for (int i=0; i<notasPenal.length; i++) {
	 somaPenal+=notasPenal[i];
}
mediaPenal=somaCivil/3;

if(mediaPenal<7) {
	aprovado=false;
	System.out.println("Reprovado em Direito Penal. "+ df.format(mediaPenal));
	
}else {
	aprovado=true;
	System.out.println("Aprovado em Direito Penal. "+ df.format(mediaPenal));
}
	return aprovado;
	
	
	

}
boolean calcularAprovacaoTributario() {
for (int i=0; i<notasTributario.length; i++) {
	 somaTrib+=notasTributario[i];
}
mediaTrib=somaTrib/3;

if((mediaTrib/3)<7) {
	aprovado=false;
	System.out.println("Reprovado em Direito Tributario. "+ df.format(mediaTrib));
	
}else {
	aprovado=true;
	System.out.println("Aprovado em Direito Tributário."+ df.format(mediaTrib));
}
	return aprovado;
	
	
	

}

}


