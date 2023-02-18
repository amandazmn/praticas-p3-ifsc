package ex12;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		String numStr = leitura.nextLine();
		Integer num = Integer.valueOf(numStr);
		if (num < 0) {
			System.out.println(num + " eh negativo");
		} else {
			System.out.println(num + " eh positivo");
		}
	}

}
