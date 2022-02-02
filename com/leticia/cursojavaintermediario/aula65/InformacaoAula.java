package com.leticia.cursojavaintermediario.aula65;

@interface InformacaoAula {
	
	String autor();
	
	int aulaNumero();
	
	String blog() default "http://loiane.com";
	
	String site() default "https://loiane.training/";
}
