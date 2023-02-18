package ex11;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		String numStr = leitura.nextLine();
		Integer num = Integer.valueOf(numStr);
		num++;
		System.out.println("O sucessor do numero digitado eh  " + num);

	}

}
