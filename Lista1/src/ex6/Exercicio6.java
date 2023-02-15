/*Crie um vetor de tipo int e tamanho 10 (dez). Preencha este vetor via console usando o Scanner 
 * em um laço de repetição (for array). Mostre o maior número e o menor número ao final.
 *  Não é necessário exibir todo o conteúdo do vetor, apenas o maior e menor número.
 */

package ex6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		Integer[] vetor = new Integer[10];
		int maiornum = 0;
		int menornum = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Valor: ");
			String valStr = leitura.nextLine();
			Integer val = Integer.valueOf(valStr);
			vetor[i] = val;
			if (i == 0) {
				maiornum = vetor[i];
				menornum = vetor[i];
			}
			if (vetor[i] > maiornum) {
				maiornum = vetor[i];
			}
			if (vetor[i] < menornum) {
				menornum = vetor[i];
			}
		}
		System.out.println("Maior numero: " + maiornum + "\nMenor numero: " + menornum);

	}

}
