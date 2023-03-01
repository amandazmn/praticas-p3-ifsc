/*Escreva um método (função) que recebe um vetor de números 
 * inteiros (Integer) como parâmetro e faz a soma de todos 
 * os elementos do vetor. O retorno desta função deverá ser 
 * a própria soma.
*/
package ex8;

import java.util.Scanner;

public class Exercicio8 {

	public static int somaVetor(Integer[] vetor) {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma = soma + vetor[i];
		}
		return soma;

	}

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		System.out.println("Tamnho do vetor: ");
		String tamStr = leitura.nextLine();
		Integer tam = Integer.valueOf(tamStr);
		Integer[] vetor = new Integer[tam];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Valor da posicao " + i + ": ");
			String numStr = leitura.nextLine();
			int num = Integer.valueOf(numStr);
			vetor[i] = num;
		}

		int soma = somaVetor(vetor);
		System.out.println("Soma dos elementos do vetor: " + soma);

	}

}
