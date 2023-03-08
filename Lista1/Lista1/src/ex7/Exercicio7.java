/*Crie um vetor de String de tamanho 10 (dez) 
 * com valores pré-definidos. 
 * Você não deve usar Scanner. 
 * Em seguida, exiba no console os dados do vetor 
 * (um a um) e o tamanho dele. 
 * Além disso, exiba apenas o último elemento 
 * acessando-o diretamente.
 */

package ex7;

public class Exercicio7 {

	public static void main(String[] args) {
		
		String[] vetor = new String[10]; //Iniciar vetor
		
		// Para preencher na hora de declarar: String[] vetor = {"a", "b"};
		
		//Preencher vetor sm leitura
		for (int i = 0; i < vetor.length; i++) {
			String num = String.valueOf(i);
			vetor[i] = num;
		}
		
		//Imprimir tamnho do veotr
		System.out.println("Tamanho do vetor: " + vetor.length);
		
		//Imprimir todos os valoes do vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		//Imprimir apenas o ultimo valor do vetor
		System.out.println("Valor do ultimo elemento: " + vetor[vetor.length-1]);
		

	}

}
