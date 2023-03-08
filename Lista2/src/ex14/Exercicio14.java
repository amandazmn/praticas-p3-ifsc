package ex14;

public class Exercicio14 {

	public static Integer soma(Integer[] vetor) {
		int soma=0;
		for (int i = 0; i < vetor.length; i++) {
			soma=soma+vetor[i];
		}
		return soma;
	}

}
