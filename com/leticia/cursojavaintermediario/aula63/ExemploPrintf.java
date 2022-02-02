package com.leticia.cursojavaintermediario.aula63;

public class ExemploPrintf {

	public static void main(String[] args) {
		
		System.out.printf("Olá, %s", "Mundo!");
		System.out.println();
		System.out.printf("Olá, %S", "Mundo!"); //deixa tudo em caixa alta
		System.out.println();
		
		System.out.printf("%c", 'c');
		System.out.println();
		System.out.printf("%C", 'c');	
		System.out.printf("%n"); //pula linha n é boa pratica \n com printf
		
		int valor = 123456789;
		System.out.printf("%d", valor);	
		System.out.printf("%n");
		
		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante);	
		System.out.printf("%n");
		
		String olaMundo = "Olá, Mundo!";
		System.out.printf("%20s", olaMundo); //         Olá, Mundo!
		System.out.printf("%n");
		System.out.printf("%-20s", olaMundo); //Olá, Mundo!         
		System.out.printf("%n");

		System.out.printf("%+d", valor); //+123456789
		System.out.printf("%n");
		System.out.printf("%015d", valor); //000000123456789
		System.out.printf("%n");
		System.out.printf("%,d", valor); //123.456.789
		System.out.printf("%n");

		int valor2 = -123456789;
		System.out.printf("% d", valor2); //-123456789
		System.out.printf("%n");
		System.out.printf("% d", valor); // 123456789
		System.out.printf("%n");

		System.out.printf("%.3f", pontoFlutuante);	//3,146
		System.out.printf("%n");

		System.out.printf("R$%10.2f", pontoFlutuante);	//R$      3,15
		System.out.printf("%n");

		testeMaisCompleto();
	}
	
	public static void testeMaisCompleto() {
		double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};
		
		for (int i=0; i<precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
		}
		
		/*
		 * Retorno
		 * Item 01: total de R$ 10.000,00
		 * Item 02: total de R$    123,54
		 * Item 03: total de R$  7.843,57
		 * Item 04: total de R$      1,00
		 * Item 05: total de R$      4,57
		 */
	}

}
