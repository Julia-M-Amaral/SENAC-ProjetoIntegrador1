//Dados 3 valores reais (float ou double) imprimir o valor do produto destes valores;
//Julia Mangabeira Amaral Santos - Turma A

package projetoIntegrador1;

import java.util.Scanner;

public class ADO2Ex1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double valor1, valor2, valor3, produto;

		System.out.println("Digite o primeiro n�mero ");
		valor1 = entrada.nextDouble();

		System.out.println("Digite o segundo n�mero");
		valor2 = entrada.nextDouble();

		System.out.println("Digite o terceiro n�mero");
		valor3 = entrada.nextDouble();

		produto = valor1 * valor2 * valor3;

		System.out.println("O produto dos 3 numeros �: " + produto);

		entrada.close();
	}

}
