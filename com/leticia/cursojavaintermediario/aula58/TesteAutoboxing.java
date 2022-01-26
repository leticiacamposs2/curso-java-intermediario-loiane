package com.leticia.cursojavaintermediario.aula58;

public class TesteAutoboxing {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//autoboxing
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 10000l;
		Float num11 = 3.5f;
		Double num12 = 3.5555;
		Boolean flag2 = true;
		Character x = 'x';
		
		//auto unboxing
		 int num13 = num9;//num7.intValue();
		 
		 //autoboxing em expressões
		 num9++;
		 
		 System.out.println(num9);
		 
		 //auto unboxing num9 -> autoboxing num13/num9 -> num14
		 Integer num14 = num13/num9;
		 
		 System.out.println(num14);
		 
		 //mau uso
		 Double a, b, c;
		 a = 10.0;
		 b = 12.2;
		 c = 4.7;
		 
		 Double media = (a+b+c)/3;
		 System.out.println(media);
	}

}
