package com.leticia.cursojavaintermediario.aula60;

public class Teste {

	public static void main(String[] args) {
		
		EscopoVariaveis escopo = new EscopoVariaveis();
		escopo.setValor(10);
		
		System.out.println(escopo.getValor()); //10
		System.out.println(escopo.calculaValor(20)); //30
		System.out.println(escopo.getValor()); //10
		System.out.println(escopo.teste()); //4
		System.out.println(escopo.getValor()); //10
		
		escopo.outroTeste(); // 0 1 2 3 4 5 6 7 8 9 10
		escopo.maisUmTeste(); // 11
		escopo.maisUmOutroTeste(0);
	}

}
