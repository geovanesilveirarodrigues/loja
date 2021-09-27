package lado;

import java.util.Scanner;

public class Lados {

	public static void main(String[] args) {
		Scanner valores = new Scanner(System.in);
		double a, b, c;

		System.out.println("Insira o primeiro valor");
		a = valores.nextDouble();

		System.out.println("Insira o segundo valor");
		b = valores.nextDouble();

		System.out.println("Insira o terceiro valor");
		c = valores.nextDouble();

		if (a < (b + c) && b < (a + c) && c < (a + b)) {
//		Quando forma o triangulo

			{
				if (a == b && b == c) {
					System.out.println("Triangulo Equilatero.");

				} else if (a == b || b == c || c == a) {
					System.out.println("Triangulo Isósceles.");

				} else {
					System.out.println("Triangulo Escaleno.");
				}
			}
		}
	}
}
