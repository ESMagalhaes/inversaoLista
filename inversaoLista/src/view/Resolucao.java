package view;

import esmagalhaes.fateczl.edu.lista.ListaGenerica;
import controller.InversorController;

public class Resolucao {

	public static void main(String[] args) throws Exception {
		ListaGenerica<Integer> L = new ListaGenerica<>();
		InversorController ic = new InversorController();

		L.addLast(3);
		L.addLast(5);
		L.addLast(18);
		L.addLast(12);
		L.addLast(9);
		L.addLast(7);
		L.addLast(6);
		L.addLast(2);
		L.addLast(13);
		L.addLast(4);
		L.addLast(16);

		for (int i = 0; i < L.size(); i++) {
			System.out.print(L.get(i) + " ");
		}
		System.out.println();

		ic.inverterLista(L);
		ic.printInvertido(L);

	}

}
