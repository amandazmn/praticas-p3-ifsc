package ex10;

import java.util.Scanner;

public class Exercicio10 {

	public static float mf(float n1, float n2, float n3) {
		float mf =0;
		mf = (n1+n2+n3)/3;
		return mf;
	}
	public static void main(String[] args) {
		
		Float mf;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Nota 1: ");
		String n1str = leitura.nextLine();
		Float n1 = Float.valueOf(n1str);
		System.out.println("Nota 2: ");
		String n2str = leitura.nextLine();
		Float n2 = Float.valueOf(n2str);
		System.out.println("Nota 3: ");
		String n3str = leitura.nextLine();
		Float n3 = Float.valueOf(n3str);
		
		mf=mf(n1, n2, n3);
		if(mf>=6) {
			System.out.println("Parabens! Aprovado(a) com media final = " + mf);
		}
		if(mf>=4&&mf<6) {
			System.out.println("Recuperacao. Media final = " + mf);
		}
		if(mf<4) {
			System.out.println("Reprovado(a). Media final = " + mf);
		}
		
	}

}
