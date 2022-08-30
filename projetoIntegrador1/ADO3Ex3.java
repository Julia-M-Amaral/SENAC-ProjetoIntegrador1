//Dado um ano com 4 dígitos dizer ser ele é um ano bissexto ou não. (Lembre-se
//que um ano é bissexto se ele for divisível por 400 ou se ele for divisível por 4 e
//não por 100.)

//Julia Mangabeira Amaral Santos - Turma A
package projetoIntegrador1;

import java.util.Scanner;

public class ADO3Ex3 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int ano;
		
		System.out.println("Digite o ano para saber se ele é bissexto.");
		ano = entrada.nextInt();
		
		if (ano % 400 == 0 || ano % 4 == 0 && !(ano % 100 == 0)) {
			System.out.println("O ano é bissexto.");
		}
		else {
			System.out.println("O ano não é bissexto");
		}
			
		entrada.close();
	}

}