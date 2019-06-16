package com.talita.cursojava.aula34;

public class ConversaoDeUnidadesDeTempo {

	static double x;
	

	//mituto para segundo
	
	static double minutoParaSegundo(double minuto) {
		x=minuto*60;
		System.out.println(minuto+" minutos são "+x+" segundos");
		return x;
	}
	
	//segundo para minuto
	static double segundoParaMinuto(double segundo) {
		x=segundo/60;
		System.out.println(segundo+" segundos são "+x+" minutos");
		return x;
	}
	//hora para minuto
	
	static double horaParaMinuto(double hora) {
		x=hora*60;
		System.out.println(hora+" horas são "+x+" minutos");
		return x;
	}
	//minuto para hora
	
	static double minutoParaHora(double minuto) {
		x=minuto/60;
		System.out.println(minuto+" minutos são "+x+" horas");
		return x;
	}
	//dia para hora
	static double diaParaHora(double dia) {
		x=dia*24;
		System.out.println(dia+" dias são "+x+" horas");
		return x;
	}
	//hora para dia
	static double horaParaDia(double hora) {
		x=hora/24;
		System.out.println(hora+" horas são "+x+" dias");
		return x;
	}
	
	//semana para dia
	static double semanaParaDia(double semana) {
		x=semana*7;
		System.out.println(semana+" semanas são "+x+" dias");
		return x;
	}
	//dia para semana
	static double diaParaSemana(double dia) {
		x=dia/7;
		System.out.println(dia+" dias são "+x+" semanas");
		return x;
	}
	//mes para dia
	static double mesParaDia(double mes) {
		x=mes*30;
		System.out.println(mes+" meses são "+x+" dias");
		return x;
	}
	//dia para mes
	static double diaParaMes(double dia) {
		x=dia/30;
		System.out.println(dia+" dias são "+x+" meses");
		return x;
	}
	//ano para dia
	
	static double anoParaDia(double ano) {
		x=365*ano;
		System.out.println(ano+" anos são "+x+" dias");
		return x;
	}
	//dia para ano
	static double diaParaAno(double dia) {
		x=dia/365;
		System.out.println(dia+" dias são "+x+" anos");
		return x;
	}

}