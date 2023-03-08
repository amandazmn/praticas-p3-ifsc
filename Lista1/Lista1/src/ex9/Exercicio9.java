package ex9;

public class Exercicio9 {
	public static double precoPagar(Double precoLitro, Double quantidadeLitros) {
		if(precoLitro==0 || quantidadeLitros==0) {
			return 0;
		}
		double precoTotal = precoLitro * quantidadeLitros;
		return precoTotal;
	}
}
