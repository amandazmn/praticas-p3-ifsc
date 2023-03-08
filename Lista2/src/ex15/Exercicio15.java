package ex15;

public class Exercicio15 {
	
	public static Integer menor(Integer[] vetor) {
		int menornum=vetor[0];
		for (int i = 0; i < vetor.length; i++) {
			if(menornum>vetor[i]) {
				menornum=vetor[i];
			}
		}
		return menornum;
	}
}
