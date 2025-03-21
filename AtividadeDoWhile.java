package atividadejava06;

import java.util.Scanner;

public class AtividadeDoWhile {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);
		int somaNumerosPositivos = 0;
		int numero;

		do {
			System.out.print("Digite um número: ");
			numero = lerScanner.nextInt();

			if (numero == 0)
				break;

			if (numero > 0)
				somaNumerosPositivos = somaNumerosPositivos + numero;

		}

		while (true);
		System.out.println("Soma números positivos: " + somaNumerosPositivos);
		lerScanner.close();
	}
}