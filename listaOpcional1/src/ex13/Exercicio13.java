package ex13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		System.out.println("Base: ");
		String baseStr = leitura.nextLine();
		Float base = Float.valueOf(baseStr);
		System.out.println("Altura: ");
		String alturaStr = leitura.nextLine();
		Float altura = Float.valueOf(alturaStr);
		Float area = altura * base;
		System.out.println("Area: " + area);

	}

}
