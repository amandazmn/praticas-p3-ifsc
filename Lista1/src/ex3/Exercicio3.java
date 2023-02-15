/*Faça um programa para ler uma variável (tipo Long) usando o método nextLine() do Scanner.
 *  Exiba  no console se este inteiro é par ou não. 
 *  Lembre-se: você terá que fazer uma conversão de tipo (casting).
 */

package ex3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		String valorStr = leitura.nextLine();
		Long valor = Long.valueOf(valorStr);
		if (valor % 2 == 0) {
			System.out.println(valor + " eh par");
		} else {
			System.out.println(valor + " eh impar");
		}

	}

}
