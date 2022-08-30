//Dados 3 valores (possíveis lados) verificar se eles formam um triângulo, e em caso positivo, 
//dizer se é equilátero, isósceles ou escaleno;

//Julia Mangabeira Amaral Santos - Turma A

package projetoIntegrador1;

import java.util.Scanner;

public class ADO3Ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Digite o valor do lado A do seu triângulo: ");
		a = entrada.nextDouble();
		System.out.println("Digite o valor do lado B do seu triângulo: ");
		b = entrada.nextDouble();
		System.out.println("Digite o valor do lado C do seu triângulo: ");
		c = entrada.nextDouble();
		
		if ((a + b >= c) && (b + c >= a) && (a + c >= b)) {
			if (a == b && a == c && b == c) {
				System.out.println("É um triângulo Equilátero.");
			} else if (a == b || a == c) {
				System.out.println("É um triângulo Isóceles.");
			} else {
				System.out.println("É um triângulo Escaleno.");
			}
		} else {
			System.out.println("Não é um triângulo!");
		}
		entrada.close();
	}

}