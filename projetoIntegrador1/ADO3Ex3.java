//Dado um ano com 4 d�gitos dizer ser ele � um ano bissexto ou n�o. (Lembre-se
//que um ano � bissexto se ele for divis�vel por 400 ou se ele for divis�vel por 4 e
//n�o por 100.)

//Julia Mangabeira Amaral Santos - Turma A
package projetoIntegrador1;

import java.util.Scanner;

public class ADO3Ex3 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int ano;
		
		System.out.println("Digite o ano para saber se ele � bissexto.");
		ano = entrada.nextInt();
		
		if (ano % 400 == 0 || ano % 4 == 0 && !(ano % 100 == 0)) {
			System.out.println("O ano � bissexto.");
		}
		else {
			System.out.println("O ano n�o � bissexto");
		}
			
		entrada.close();
	}

}