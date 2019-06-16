package com.talita.cursojava.aula34;

public class ConversaoDeUnidadesDeVolume {

	static double x;
	static double litrosParaCentimetroCubico(double litro){
		x=(litro*1000)/1;
		return x;
		
		}
	static double CentimetroCubicoParaLitro(double cmCub){
		x=(cmCub*1)/1000;
		return x;
		
		}
	static double metrosCubicosParaLitro(double mCub){
		x=(1000*mCub)/1;
		return x;
		
		}
	static double LitrosParaMetrosCubicos(double litro){
		x=(litro*1)/1000;
		return x;
		
		}
	
	static double metrosCubicosPataPesCubicos(double mCub){
		x=(mCub*35.32)/1;
		return x;
		
		}
	static double pesCubicosPataMetrosCubicos(double pesCub){
		x=(pesCub*1)/35.32;
		return x;
		
		}
	static double galaoAmericanoParaPolegadasCubicas(double galao){
		x=(231*galao)/1;
		return x;
		
		}	
	static double polegadasCubicasParaGalao(double polCub){
		x=(polCub*1)/231;
		return x;
		
		}		
	static double galaoAmericanoParaLitros(double galao){
		x=(galao*3785)/1;
		return x;
		
		}		
	static double litrosParaGalaoAmericano(double litro){
		x=(litro*1)/3785;
		return x;
		
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
