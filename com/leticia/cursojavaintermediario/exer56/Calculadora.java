package com.leticia.cursojavaintermediario.exer56;

import com.leticia.cursojavaintermediario.aula54.DiaSemana;

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
