/*Crie um vetor de String de tamanho 10 (dez) 
 * com valores pré-definidos. 
 * Você não deve usar Scanner. 
 * Em seguida, exiba no console os dados do vetor 
 * (um a um) e o tamanho dele. 
 * Além disso, exiba apenas o último elemento 
 * acessando-o diretamente.
 */

package ex7;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		String[] vetor = new String[10];
		for (int i = 0; i < 10; i++) {
			String num = String.valueOf(i);
			vetor[i] = num;
		}

	}

}
