package com.leticia.cursojavaintermediario.aula85;

import java.util.Date;

public class TesteDate {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date hoje = new Date();
		
		System.out.println(hoje);
		
		System.out.println("Milisegundos desde 1 de junho de 1970" + hoje.getTime());
		
		System.out.println(hoje.getDate());
	}

}
