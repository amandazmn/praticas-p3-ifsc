/*Faça um programa para ler o nome (tipo String) e idade (tipo Integer) de uma pessoa usando o método 
 * nextLine() do Scanner. Exiba no console o conteúdo lido.
 */
package ex2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.println("Nome: ");

		String nome = leitura.nextLine();

		System.out.println("Idade: ");

		String idadeStr = leitura.nextLine();

		int idade = Integer.valueOf(idadeStr);

		System.out.println("Nome: " + nome + "\nIdade: " + idade);

	}

}
