//Dado um valor inteiro N imprimir os 3 primeiros múltiplos deste valor;

//Julia Mangabeira Amaral Santos - Turma A
package projetoIntegrador1;

import java.util.Scanner;

public class ADO2Ex2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numeroInteiro, multiplo1, multiplo2, multiplo3;
		
		System.out.println("Digite um número inteiro ");
		numeroInteiro = entrada.nextInt();
		
		multiplo1 = numeroInteiro*1;
		multiplo2 = numeroInteiro*2;
		multiplo3 = numeroInteiro*3;
		
		System.out.println("O primeiro multiplo de " + numeroInteiro + " é " + multiplo1);
		System.out.println("O segundo multiplo de " + numeroInteiro + " é " + multiplo2);
		System.out.println("O terceiro multiplo de " + numeroInteiro + " é " + multiplo3);
			
		entrada.close();
	}

}
