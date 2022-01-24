package com.leticia.cursojavaintermediario.exer56;

/*
 *  Escreva um Enum que represente as quatro operações matemáticas:
 *  somar, subtrair, multiplicar e dividir
 *  
 *  O Enum deve ter um construtor que receba o símbolo da operação (+,-,*,/)
 *  
 *  Sobrescreva o método toString que retorne somente o símbolo da operação
 *  
 *  Implemente um método abstrato com a seguinte assinatura 
 *  double executarOperacao(double x, double y)
 *  Cada opção do Enum deve implementar esse método realizando a operação
 *  de acordo com sua descrição
 *  
 *  Escreve um método main para teste que realize todas as operações do Enum.
 *  Dica: você pode usar o método values para iterar o Enum e executar
 *  todas as operações.
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
