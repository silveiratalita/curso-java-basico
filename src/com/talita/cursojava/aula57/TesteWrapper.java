package com.talita.cursojava.aula57;

public class TesteWrapper {

	public static void main(String[] args) {
		
		short num1=1;
		byte num2=10;
		int num3=100;
		long num4=10000l;
		float num5=3.5f;
		boolean flag =true;
		char a='a';
		
		Short num7= new Short((short) 1);//declara��o com casting-cuidado q vai s[o ate 127, e d� a volta e vc pode perder o valor.
		Byte num8=new Byte((byte) 10);
		Integer num9 =new Integer(100);//n�o precisou de casting
		Long num10 =new Long(1000000);//limite muito maior q o do float
		Float num11 =new Float(3.5f);//sem casting
		Double num12 =new Double(3.555);//sem casting
		Boolean flag2=new Boolean(true);
		Character b=new Character('b');
		
		Integer num13 = new Integer("1000");//pode disparar exce��o do tipo numberformatexception, se for numero passado como string n�o d� nada, pq ele aceita string
		//mas no caso se eu colocar tipo"hhh" vai dar pau.
		
		
		Double num14=new Double("3.5");//tem q ser 3,5 para q	uem usar pc em pt br
		
		System.out.println(num13.intValue());
		
		
		
		
		//as classes wrappers tem metodos que retornam valores.
		//o 13 � do tipo inteiro se eu usar o long value, eu consigo fazer a convers�o de um tipo para o outro.
		Long num15=num13.longValue();
		num13.intValue();
		//de string para tipos primitivos tbm d�.
		
		int num16=Integer.parseInt("1000"); //atribui ao num16 o valor que � de uma string "1000" convertida para inteiro 1000, mas cuidado q se n�o
		//passar numero pode gerra um numberformatexcpetion
		
		
		double num17=Double.parseDouble("3.555");
		System.out.println(num17);
		
		Integer num18 =Integer.valueOf(1343);//faz esse numero virar uma instancia da classe integer de um objeto.
		System.out.println(num18);
		
		//para comparra tipos primitivos usa-se o ==, como essas s�o classes n�o d� pra usar o ==, tem q usar o equals.
		
		//num9 � iteger  e o 13 tbm, pra comparar e�assim, se usar o == vai dar false, pq ele compara endere�o de memoria pq isso � objeto.
		System.out.println(num9==num13);
		
		
	}

}
