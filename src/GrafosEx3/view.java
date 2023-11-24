package GrafosEx3;


import GrafosEx3.Controller;

public class view {
	public static void main(String[] args) {
		int[][] grafo = {
	            {0, 3, 0, 2},
	            {0, 0, 0, 0},
	            {0, 4, 0, 0},
	            {5, 0, 0, 0}
	        };
		Controller controle=new Controller();
		controle.listaArestas(grafo);
	}
}