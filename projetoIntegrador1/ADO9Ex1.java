/*Uma equação do 1º grau é da forma ax + b = 0, com a ≠ 0. Utilizando a classe
Random (.nextInt((max - min) + 1) + min;) ou o método random
((Math.random() * ((max - min) + 1)) + min;) implemente um programa que
receba do usuário os valores min e max, escolha aleatoriamente os valores de
a e b no intervalo [min, max], exiba a equação ax + b = 0, e mostre a solução
correspondente.*/
package projetoIntegrador1;

import java.util.Random;
import java.util.Scanner;

public class ADO9Ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int valorMax = 0, valorMin = 0;
		double x = 0;

		System.out.println("Escolha um valor mínimo (O valor mínimo não pode ser 0).");

		while (valorMin == 0) {
			valorMin = input.nextInt();

			if (valorMin == 0) {
				System.out.println("O valor mínimo não pode ser 0. Digite novamente.");
			}

		}

		System.out.println("Escolha um valor máximo. ");
		valorMax = input.nextInt();

		while (valorMax <= valorMin) {

			if (valorMax <= valorMin) {

				System.out.println("O valor máximo não pode ser menor ou igual ao valor mínimo. Digite novamente.");
			}
			valorMax = input.nextInt();
		}

		double a = 0;
		while (a == 0) {
			a = random.nextInt((valorMax - valorMin)) + valorMin;

		}
		double b = random.nextInt((valorMax - valorMin)) + valorMin;

		System.out.println("Equação: " + a + "x " + "+ " + b + " = " + 0);

		// ax + b = 0
		x = -b / a;

		System.out.println("Resposta da equação: " + x);

		input.close();
	}
}
