package atividadejava06;

import java.util.Scanner;

public class AtividadeFor {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);
		int impares = 0;
		int pares = 0;

		for (int cont = 1; cont <= 10; cont++) {
			System.out.printf("\nDigite o %d número: \n", cont);
			int numero = lerScanner.nextInt();

			if (numero % 2 == 0) {
				pares++;

			} else {
				impares++;

			}
		}

		System.out.print("\nTotal de números pares: " + pares);
		System.out.print("\nTotal de números ímpares: " + impares);

		lerScanner.close();

	}
}