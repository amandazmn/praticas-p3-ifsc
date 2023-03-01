/*Crie um programa simples em Java que faça dez leituras de dados (tipo inteiro) 
 * usando o método nextLine() do Scanner e usando um for array. 
 * Exiba no console o conteúdo lido cada vez que uma leitura é feita. Não utilize vetor.
 */
package ex4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um numero: ");
			String numStr = leitura.nextLine();
			Integer num = Integer.valueOf(numStr);
			System.out.println("\n" + num + "\n");
		}

	}

}
