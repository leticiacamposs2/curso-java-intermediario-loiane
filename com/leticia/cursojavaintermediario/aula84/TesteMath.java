package com.leticia.cursojavaintermediario.aula84;

public class TesteMath {

	public static void main(String[] args) {
		
		System.out.println(Math.pow(2, 3)); //8

		System.out.println(Math.round(4.7)); //5
		
		System.out.println(Math.round(4.4)); //4

		System.out.println(Math.ceil(4.4)); //5.0

		System.out.println(Math.ceil(4.7)); //5.0
		
		System.out.println(Math.floor(4.4)); //4.0

		System.out.println(Math.floor(4.7)); //4.0
		
		System.out.println(Math.round(Math.random() * 100)); //numero de 0 a 100
		
		System.out.println(Math.sin(Math.toRadians(30)));
		
		System.out.println(Math.cos(Math.toRadians(1)));
		
		System.out.println(Math.tan(Math.toRadians(45)));
	}
}
