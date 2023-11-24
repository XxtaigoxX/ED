package GrafosEx1;

import GrafosEx1.Controller;

public class view {
	public static void main(String[] args) {
		Controller controller = new Controller();
		int[][] matriz = { { 0, 1, 0, 1, 0 }, { 1, 0, 1, 1, 1 }, { 0, 1, 1, 0, 0 }, { 1, 1, 0, 0, 1 },
				{ 0, 1, 0, 1, 0 } };

		controller.arestas(matriz);
		controller.tipoAresta(matriz);
		controller.grau(matriz);
		if (controller.eConexo(matriz)) {
			System.out.println("E conexo");
		} else {
			System.out.println("Não é conexo");
		}

		if (controller.eCiclico(matriz)) {
			System.out.println("O grafo é ciclico");
		} else {
			System.out.println("o grafo não é ciclico");
		}
		controller.listaAdjacencias(matriz);
	}
}
