package GrafosEx3;

import java.util.regex.MatchResult;

public class Controller {

	public void listaArestas(int[][] grafo) {
		for (int i = 0; i < grafo.length; i++) {
			for (int j = 0; j < grafo.length; j++) {
				if (grafo[i][j] != 0)
					System.out.println("(" + i + ", " + j + ") Peso: " + grafo[i][j]);
			}
		}
	}

}