package projetoIntegrador1;

import java.util.Random;
import java.util.Scanner;

public class ADO10Ex1 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		double valorDigitado = 0;
		boolean acertou = false;
		int tentativas = 0;

		int numeroAleatorio = random.nextInt((100 - 1) + 1);

		System.out.println("Adivivinhe o valor escolhido pelo computador! ");

		do {
			valorDigitado = input.nextDouble();

			if (valorDigitado == numeroAleatorio) {
				System.out.println("Parabéns, você ganhou o jogo!");
				acertou = true;
				break;
			}

			if (valorDigitado < numeroAleatorio) {
				System.out.println("O número digitado é menor que o valor escolhido pelo computador");
			} else if (valorDigitado > numeroAleatorio) {
				System.out.println("O número digitado é maior que o valor escolhido pelo computador");
			} if (valorDigitado + 1 == numeroAleatorio || valorDigitado - 1 == numeroAleatorio) {
				System.out.println("TA QUENTE!!! \n"
									+ "Adivinhe outro valor. ");
			}

			tentativas++;
			
			if (tentativas == 5) {
				System.out.println("GAME OVER! O número escolhido pelo computador era : " + numeroAleatorio);
			}
			
		} while (acertou || tentativas <= 4); 
		
		
		
		input.close();
	}
}
