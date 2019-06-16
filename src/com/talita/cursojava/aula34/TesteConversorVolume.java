package com.talita.cursojava.aula34;

import java.util.Scanner;

public class TesteConversorVolume {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double litro;
		double cmCub;
		double mCub;
		double pesCub;
		double polCub;
		double galao;
		System.out.println("Informe a opção de conversão desejada:");
		System.out.println("1:Litros ->Centimetros Cubicos");
		System.out.println("2:Centimetros cubicos->Litros");
		System.out.println("3:metro cubico->litro");
		System.out.println("4:litro->metro cubico");
		System.out.println("5:Metro cubico -> pes cubicos");
		System.out.println("6:pes cubicos->metros cubicos");
		System.out.println("7:galão americano->polegada cubica");
		System.out.println("8:polegada cubica->Galão americano");
		System.out.println("9:Galão americano ->Litros");
		System.out.println("10: Litros->Galão americano");

		int opcao = scan.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("informe de quantia em litros para conversão para Centimetros cubicos");

			litro = scan.nextDouble();
			ConversaoDeUnidadesDeVolume.litrosParaCentimetroCubico(litro);

			break;
		case 2:

			System.out.println("informe de quantia em Centimetros cubicos para conversão em litros");

			cmCub = scan.nextDouble();

			ConversaoDeUnidadesDeVolume.CentimetroCubicoParaLitro(cmCub);

			break;
		case 3:
			System.out.println("informe de quantia em metros cubicos  para conversão em litros");

			mCub = scan.nextDouble();
			ConversaoDeUnidadesDeVolume.metrosCubicosParaLitro(mCub);
			break;

		case 4:
			System.out.println("informe de quantia em litros para conversão em metros cubicos");

			mCub = scan.nextDouble();
			ConversaoDeUnidadesDeVolume.metrosCubicosParaLitro(mCub);

			break;
		case 5:
			System.out.println("informe a quantia em metros cubicos para conversão em pes cubicos");

			mCub = scan.nextDouble();
			ConversaoDeUnidadesDeVolume.metrosCubicosPataPesCubicos(mCub);
			break;
		case 6:
			System.out.println("informe a quantia em pes cubicos para conversão em metros cubicos");

			pesCub = scan.nextDouble();
			ConversaoDeUnidadesDeVolume.pesCubicosPataMetrosCubicos(pesCub);

			break;
		case 7:
			System.out.println("informe a quantia em Galao americano para conversão em Polegadas cubicas");

			galao = scan.nextDouble();
			ConversaoDeUnidadesDeVolume.galaoAmericanoParaPolegadasCubicas(galao);
			break;
		case 8:
			System.out.println("informe a quantia em polegadas cubicas  para conversão em Galão americano");

			polCub = scan.nextDouble();

			ConversaoDeUnidadesDeVolume.polegadasCubicasParaGalao(polCub);
		case 9:
			System.out.println("informe a quantia em galão americano  para conversão em litros");

			galao = scan.nextDouble();
			ConversaoDeUnidadesDeVolume.galaoAmericanoParaLitros(galao);

		case 10:
			System.out.println("informe a quantia em litros  para conversão em galao americano");

			litro = scan.nextDouble();
			ConversaoDeUnidadesDeVolume.galaoAmericanoParaLitros(litro);

		default:
			System.out.println("Opção invalida");

		}
	}

}
