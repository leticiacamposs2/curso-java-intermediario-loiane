package com.leticia.cursojavaintermediario.aula71;

public class Teste {

	public static void main(String[] args) {

		int[] arrayNums = {1, 2, 3, 4, 5};
		
		MinhaThreadSoma t1 = new MinhaThreadSoma("#1", arrayNums);
		MinhaThreadSoma t2 = new MinhaThreadSoma("#2", arrayNums);
		MinhaThreadSoma t3 = new MinhaThreadSoma("#3", arrayNums);
	}

}
