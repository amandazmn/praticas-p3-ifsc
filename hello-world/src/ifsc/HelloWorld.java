package ifsc;

import java.util.Iterator;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// Viabiliza a leitura de dados
		Scanner leitura = new Scanner(System.in);
		
		// Output
		System.out.println("Nome: ");
		
		// Faz a leitura e guarda o conteudo em uma variavel
		String nome = leitura.nextLine();
		
		System.out.println("Idade: ");
		String idadeStr = leitura.nextLine();
		
		// Converte de String para Integer
		int idade = Integer.valueOf(idadeStr);
		
		// Converte de String para Double
//		double idade = Double.valueOf(idadeStr);
		
		System.out.println(nome + " tem " + idade + " anos");
		
		// Exibe o conteudo lido
//		System.out.println(conteudoLido);
		}

	}


