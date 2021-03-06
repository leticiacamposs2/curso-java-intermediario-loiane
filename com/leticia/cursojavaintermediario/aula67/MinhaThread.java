package com.leticia.cursojavaintermediario.aula67;

public class MinhaThread extends Thread {
	
	private String nome;
	private int valorAdormecida;
	
	public MinhaThread(String nome, int valorAdormecida) {
		this.nome = nome;
		this.valorAdormecida = valorAdormecida;
		start();
	}
	
	public void run() {
		System.out.println(nome + " foi iniciada");

		try {
			
			for (int i=0; i<6; i++) {
				System.out.println(nome + " tem contador valor " + i);
				Thread.sleep(valorAdormecida);
			}
			
		} catch (InterruptedException e) {
			System.out.println(nome + " foi interrompida");		
		}
		
		System.out.println(nome + " foi terminada");		
	}
	
}
