/*Crie um programa que permite ler uma variável (do tipo String) usando Scanner. 
 * Exiba no console o conteúdo da variável.
*/
package ex1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		String conteudoLido = leitura.nextLine();

		System.out.println(conteudoLido);

	}

}
