package ex14;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		System.out.println("Primeiro numero: ");
		String numUmStr = leitura.nextLine();
		Integer numUm = Integer.valueOf(numUmStr);
		Integer maior = numUm;
		System.out.println("Segundo numero: ");
		String numDoisStr = leitura.nextLine();
		Integer numDois = Integer.valueOf(numDoisStr);
		if (numDois > maior) {
			maior = numDois;
		}
		System.out.println("Terceiro numero: ");
		String numTresStr = leitura.nextLine();
		Integer numTres = Integer.valueOf(numTresStr);
		if (numTres > maior) {
			maior = numTres;
		}
		System.out.println("O maior numero eh " + maior);

	}

}
