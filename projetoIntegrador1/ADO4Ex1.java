/*Utilizando a instru��o switch escreva um programa que recebe um valor inteiro de
1 a 7 e retorna o correspondente dia da semana. Considere que 1 corresponde a
domingo, 2 a segunda-feira, ..., 7 a s�bado. Al�m disso, no caso de uma entrada
errada, como por exemplo 0, deve ser impresso �Valor inv�lido!�;*/
package projetoIntegrador1;

import java.util.Scanner;

public class ADO4Ex1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int diaSemana;

		System.out.println("Digite um valor inteiro de 1 a 7. ");
		diaSemana = entrada.nextInt();

		switch (diaSemana) {

		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Ter�a-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6: 
			System.out.println("Sexta-feira");
			break;
		case 7: 
			System.out.println("S�bado");
			break;
		default:
			System.out.println("Valor inv�lido!");

		}

		entrada.close();
	}

}