package com.leticia.cursojavaintermediario.aula55;

public class TesteEnum {

	public static void main(String[] args) {

		DiaSemana[] dias = DiaSemana.values();
		
		for (int i=0; i<dias.length; i++) {
			System.out.println(dias[i]);
		}
		
		System.out.println("\n");
		
		for (DiaSemana dia : DiaSemana.values()) {
			System.out.println(dia);
		}
	}

}
