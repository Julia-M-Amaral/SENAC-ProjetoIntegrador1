//Dados 3 valores (poss�veis lados) verificar se eles formam um tri�ngulo, e em caso positivo, 
//dizer se � equil�tero, is�sceles ou escaleno;

//Julia Mangabeira Amaral Santos - Turma A

package projetoIntegrador1;

import java.util.Scanner;

public class ADO3Ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Digite o valor do lado A do seu tri�ngulo: ");
		a = entrada.nextDouble();
		System.out.println("Digite o valor do lado B do seu tri�ngulo: ");
		b = entrada.nextDouble();
		System.out.println("Digite o valor do lado C do seu tri�ngulo: ");
		c = entrada.nextDouble();
		
		if ((a + b >= c) && (b + c >= a) && (a + c >= b)) {
			if (a == b && a == c && b == c) {
				System.out.println("� um tri�ngulo Equil�tero.");
			} else if (a == b || a == c) {
				System.out.println("� um tri�ngulo Is�celes.");
			} else {
				System.out.println("� um tri�ngulo Escaleno.");
			}
		} else {
			System.out.println("N�o � um tri�ngulo!");
		}
		entrada.close();
	}

}