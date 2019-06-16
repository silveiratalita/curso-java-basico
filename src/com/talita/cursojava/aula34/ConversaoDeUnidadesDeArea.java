package com.talita.cursojava.aula34;

import java.text.DecimalFormat;

public class ConversaoDeUnidadesDeArea {

static double x;	
static DecimalFormat df= new DecimalFormat("###,###");
	
static double metrosQuadradosParaPesQuadrados(double metros) {//op01
	
	x=(10.76*metros)/1;
	System.out.println(metros+" metros equivalem a "+df.format(x)+"Pés quadrados");
	return x;
}
static double pesQuadradosParaMetrosQuadrados(double pes) {
	
	x=(1*pes)/10.76;
	System.out.println(pes+" pés quadrados equivalem a "+df.format(x)+"metros quadrados");
	return x;
}
	

static double pesQuadradosParaCentimetrosQuadrados(double pes) {
	x=(929*pes)/1;
	System.out.println(pes+" pes quadrados equivalem a "+df.format(x)+" centimetros quadrados");
	return x;
}
static double centimetrosQuadradosParaPesQuadrados(double cm) {
	x=(cm*1)/929;
	System.out.println(cm+" centimetros quadrados equivalem a "+df.format(x)+"Pés quadrados");
	return x;
}
static double MilhaQuadradaParaAcres(double mq) {
	x=(640*mq)/1;
	System.out.println(mq+" milhas quadradas equivalem a "+df.format(x)+"Acres");
	return x;
}
static double acresParaMilhasQuadradas(double acres) {
	x=(acres*1)/640;
	System.out.println(acres+" Acres equivalem a "+df.format(x)+" Milhas quadradas");
	return x;
}

static double 	acresParaPesQuadrados(double acres) {
	x=(acres*43560)/1;
	System.out.println(acres+" Acres equivalem a "+df.format(x)+" Pés quadrados");
	return x;
}
static double pesQuadradosParaAcres(double pes) {
	x= (pes*1)/43.560;
	System.out.println(pes+" Pes quadrados equivalem a "+df.format(x)+"Acres");
	return x;
}
}
