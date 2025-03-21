package atividadejava06;

import java.util.Scanner;

public class AtividadeWhile {

	public static void main(String[] args) {

		Scanner Scanner = new Scanner(System.in);
		int menor21 = 0;
		int maior50 = 0;

		while (true) {

			System.out.print("Digite uma idade: ");
			int idade = Scanner.nextInt();

			if (idade < 0) {
				break;
			}

			else if (idade < 21) {
				menor21++;
			}

			else if (idade > 50) {
				maior50++;
			}
		}

		System.out.println("Total de pessoas menores de 21 anos: " + menor21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior50);
		Scanner.close();
	}
	

}
