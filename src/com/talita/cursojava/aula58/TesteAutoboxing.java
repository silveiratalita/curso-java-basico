package com.talita.cursojava.aula58;

public class TesteAutoboxing {

	public static void main(String[] args) {
		
		
		//autoboxing ou auto un-boxing � o processo de transformar um tipo primitivo em um tipoobjeto e vice e versa
		//aqui para o autoboxing � pegar  o objeto e passar o tipo primitivo diretamente
		//ao inves de chamar o consturot da classe chama diretamente
		//o autoboxin vem apartir do java5
		
		Short num7=1;
		Byte num8=10;
		Integer num9 =100;
		Long num10 =100l;//new Long(100000l);
		Float num11 =3.5f;//new float(3.5f);
		Double num12 =3.555;
		Boolean flag2=true;
		Character f='f';

		
		//d� pra fazer o inverso tbm, de um primitvo para um obj diretamente
		//isso � auto un=boxing
		int num13=num9;//num9.intValue();
		
		//d� pra utilizar as wrappers em express�es
		//aqui � feito autoboxing em express�es
		num9++;
System.out.println(num9);
//autoboxin- um objeto do tipo primitivo faz a express�o o resultado q � do tipo primitivo eu transformo em objsto novamente.
//pq o num14 � tipo objeto

Integer num14=num13/num9;
//o cuidado �utilizar o java 100% orientado objeto e fazer mal uso do autoboxing e do um boxing
//mal uso
Double a,b,c;
a=10.0;
b=12.2;
c=4.7;

Double media=(a+b+c)/3;//aqui se faz o auto un boxing, dentro da express�o o resultado vem em tipo primitivo, e tranforma em media q � tipo objeto
System.out.println(media);

//se for usar express�es muito, melhor usar os tipos primitivos, e ai ao final pode fazer o autoboxing, cuidado pra n�o fazer, mau uso

	}

}
