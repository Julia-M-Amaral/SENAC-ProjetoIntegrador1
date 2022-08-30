//Uma loja oferece para seus clientes um desconto de acordo com o valor da compra. 
//Este desconto é de 20% se o valor da compra for maior ou igual a 
//R$300,00 e 15% se for menor. Dado o valor do produto, mostre o valor (descontado)
//da compra do cliente e o valor do desconto obtido;

//Julia Mangabeira Amaral Santos - Turma A
package projetoIntegrador1;

import java.util.Scanner;

public class ADO3Ex1 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double valorCompra, valorFinal;

		System.out.println("Digite o valor de sua compra: ");
		valorCompra = entrada.nextDouble();

		if (valorCompra >= 300) {
			valorFinal = (valorCompra - (0.20 * valorCompra));
			System.out.println("O total de sua compra, já com o desconto é de: " + valorFinal);
		} else {
			valorFinal = (valorCompra - (0.15 * valorCompra));
			System.out.println("O total de sua compra, já com o desconto é de: " + valorFinal);
		}

		entrada.close();

	}

}