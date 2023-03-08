package ex13;

public class Exercicio13 {

	public static float calc(float n1, float n2, String operador) {
		float result = 0;
		if (operador == "+") {
			result = n1 + n2;
		}
		if (operador == "-") {
			result = n1 - n2;
		}
		if (operador == "*") {
			result = n1 * n2;
		}
		if (operador == "/") {
			result = n1 / n2;
		}
		return result;
	}
}
