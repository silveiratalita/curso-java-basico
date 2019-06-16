package com.talita.cursojava.exerciciosaula37a43LABS;

import java.util.Arrays;

public class TesteContribuintes  {

	public static void main(String[] args) {
		ReceitaFederal rec=new ReceitaFederal();
		
		
		PessoaFisica cont1=new PessoaFisica();
		cont1.setNomeContribuinte("andrey");
		cont1.setRenda(13000);
		cont1.setCpf("12345678920");
		cont1.impostoPF(cont1.getRenda());
		 Contribuinte[] listaCont=new Contribuinte[6];
		 listaCont[0]=cont1;
		
		 PessoaFisica cont2=new PessoaFisica();
			cont2.setNomeContribuinte("talita");
			cont2.setRenda(2000);
			cont2.setCpf("89563589547");
			cont2.impostoPF(cont2.getRenda());
			 
			 listaCont[1]=cont2;
		
			 PessoaFisica cont3=new PessoaFisica();
				cont3.setNomeContribuinte("gustavo");
				cont3.setRenda(10000);
				cont3.setCpf("8956789588");
				cont3.impostoPF(cont3.getRenda());
				 
				 listaCont[2]=cont3;
				 
			 
				 PessoaJuridica cont4=new PessoaJuridica();
					cont4.setNomeContribuinte("alfredo");
					cont4.setRenda(5000);
					cont4.setCnpj("8957415587");
					cont4.impostoPF(cont4.getRenda());
					 listaCont[3]=cont4;
			 
					 PessoaJuridica cont5=new PessoaJuridica();
					 cont5.setNomeContribuinte("glaidis");
					 cont5.setRenda(3000);
					 cont5.setCnpj("85274196385");
					 cont5.impostoPF(cont5.getRenda());
					 listaCont[4]=cont5;
						 
					 PessoaJuridica cont6=new PessoaJuridica();
					 cont6.setNomeContribuinte("jair");
					 cont6.setRenda(33000);
					 cont6.setCnpj("85274198745");
					 cont6.impostoPF(cont6.getRenda());
					 listaCont[5]=cont6;
					 
					 for (int i=0; i<listaCont.length;i++) {
						 System.out.println(listaCont[i]);
					 }
					 for (int i=0; i<listaCont.length;i++) {
						 rec.adicionaContribuintesNoArray(listaCont[i]);
					 }
					 
					 rec.mostraTodosOsContribuintes();//não está funcionando direito, deve ser problemA DE  ARRAY
	}

	

}
