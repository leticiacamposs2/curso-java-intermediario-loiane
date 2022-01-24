package com.leticia.cursojavaintermediario.exer56;

import com.leticia.cursojavaintermediario.aula54.DiaSemana;

/*
 *  Escreva um Enum que represente as quatro opera��es matem�ticas:
 *  somar, subtrair, multiplicar e dividir
 *  
 *  O Enum deve ter um construtor que receba o s�mbolo da opera��o (+,-,*,/)
 *  
 *  Sobrescreva o m�todo toString que retorne somente o s�mbolo da opera��o
 *  
 *  Implemente um m�todo abstrato com a seguinte assinatura 
 *  double executarOperacao(double x, double y)
 *  Cada op��o do Enum deve implementar esse m�todo realizando a opera��o
 *  de acordo com sua descri��o
 *  
 *  Escreve um m�todo main para teste que realize todas as opera��es do Enum.
 *  Dica: voc� pode usar o m�todo values para iterar o Enum e executar
 *  todas as opera��es.
 */
public class Calculadora {

	public static void main(String[] args) {
		
		OperacoesMatematicas somar = OperacoesMatematicas.SOMAR;
		OperacoesMatematicas subtrair = OperacoesMatematicas.SUBTRAIR;
		OperacoesMatematicas multiplicar = OperacoesMatematicas.MULTIPLICAR;
		OperacoesMatematicas dividir = OperacoesMatematicas.DIVIDIR;
		
		System.out.println(somar.toString() + " - " + somar.executarOperacao(2, 2));
		System.out.println(subtrair.toString() + " - " + subtrair.executarOperacao(2, 2));
		System.out.println(multiplicar.toString() + " - " + multiplicar.executarOperacao(2, 2));
		System.out.println(dividir.toString() + " - " + dividir.executarOperacao(2, 2));
	}

}
