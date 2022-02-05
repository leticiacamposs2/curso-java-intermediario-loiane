package com.leticia.cursojavaintermediario.aula83;

import java.util.StringTokenizer;

public class TesteTokenizer {

	public static void main(String[] args) {
		
		String doArquivo = "1;Leticia;30;";
		
		StringTokenizer st = new StringTokenizer(doArquivo, ";");
		
		while (st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

	}

}
