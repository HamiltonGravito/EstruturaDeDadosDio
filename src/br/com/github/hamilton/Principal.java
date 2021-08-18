package br.com.github.hamilton;

import br.com.github.hamilton.fila.Fila;
import br.com.github.hamilton.pilha.Pilha;

public class Principal {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		pilha.testePilha();
		System.out.println("========= FINAL PILHA==========\n");
		
		Fila fila = new Fila();
		fila.testarFila();
		System.out.println("========= FINAL FILA ==========\n");
	}

}
