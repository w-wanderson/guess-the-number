package Application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			int qtdNum = 100;

			System.out.println("Insira um palpite de 0 a 100");
			int palpite = sc.nextInt();

			int valor = new Random().nextInt(qtdNum);

			if (palpite == valor) {
				System.out.println("Parab�ns, voc� acertou na primeira tentativa, " + " Seu palpite: " + palpite + ". N�mero Sorteado: " + valor);

			}

			for (int i = 1 + 1; palpite != valor; i++) {

				if (palpite > valor) {
					System.out.println("Seu palpite foi maior que o n�mero sorteado");

				} else if (palpite < valor) {
					System.out.println("Seu palpite foi menor que o n�mero sorteado");
				}

				System.out.print("tente novamente: ");
				palpite = sc.nextInt();
				System.out.println();

				if (palpite == valor) {
					System.out.println("Parab�ns, voc� acertou. " + " Seu palpite: " + palpite + ". N�mero Sorteado: " + valor);
					System.out.println("Quantidade de tentativas at� acertar: " + i);
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Inser��o inv�lida");
			
			System.out.println("Fim do Programa");
		}

		

		sc.close();
	}

}