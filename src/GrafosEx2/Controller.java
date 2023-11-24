package GrafosEx2;

import java.util.Scanner;

public class Controller {

	public void preencher(int[][] matriz) {
		Scanner sc = new Scanner(System.in);
		System.out.println("inserir valor de:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("(" + i + ", " + j + ")");
				matriz[i][j] = sc.nextInt();
			}
		}
	}

	public void listaAdj(int[][] matriz) {
		System.out.println("Arestas: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(i + ": ");
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] != 0)
					System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public void print(int[][] matriz) {
		System.out.println("Matriz:{");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("}");
	}

}