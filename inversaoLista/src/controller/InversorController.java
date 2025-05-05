package controller;

import esmagalhaes.fateczl.edu.lista.*;

public class InversorController {
	public static void inverterLista(ListaGenerica<Integer> L) throws Exception {
		int aux = 0;
		for (int i = 0; i < L.size(); i++) {
			aux = L.get(L.size() - 1); // recebe o valor no final
			L.removeLast();
			L.addValor(aux, i); // adiciona o valor na auxiliar na posição i
		}
	}

	public static void printInvertido(ListaGenerica<Integer> L) throws Exception {
		for (int i = 0; i < L.size(); i++) {
			System.out.print(L.get(i) + " ");
		}
		System.out.println();
	}
}