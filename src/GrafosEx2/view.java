package GrafosEx2;

import java.util.Scanner;

import GrafosEx2.Controller;

public class view {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Controller control = new Controller();
		System.out.println("Valor de n: ");
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		control.preencher(matriz);
		control.print(matriz);
		control.listaAdj(matriz);
	}
}
