package com.leticia.cursojavaintermediario.exer56;

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
		
		double x = 2.0;
		double y = 2.0;
		
		for (OperacoesMatematicas operacao : OperacoesMatematicas.values()) {
			System.out.println(x + " - ");
			System.out.println(operacao.toString() + " ");
			System.out.println(y + " - ");
			System.out.println(operacao.toString() + " ");
			System.out.println(operacao.executarOperacao(x, y));
		}		
	}

}
