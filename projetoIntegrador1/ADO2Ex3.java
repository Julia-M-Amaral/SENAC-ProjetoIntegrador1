//Dado um valor inteiro de 1 até 10, imprimir a “tabela” da tabuada deste valor;
//Julia Mangabeira Amaral Santos - Turma A
package projetoIntegrador1;

import java.util.Scanner;

public class ADO2Ex3 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valorInteiro;
		
		System.out.print("Digite um número inteiro de 1 a 10: ");
		valorInteiro = entrada.nextInt();
		
		System.out.println("A tabuada de " + valorInteiro + " é ");		
		System.out.println(valorInteiro + " x 1  = " + valorInteiro*1);
		System.out.println(valorInteiro + " x 2  = " + valorInteiro*2);
		System.out.println(valorInteiro + " x 3  = " + valorInteiro*3);
		System.out.println(valorInteiro + " x 4  = " + valorInteiro*4);
		System.out.println(valorInteiro + " x 5  = " + valorInteiro*5);
		System.out.println(valorInteiro + " x 6  = " + valorInteiro*6);
		System.out.println(valorInteiro + " x 7  = " + valorInteiro*7);
		System.out.println(valorInteiro + " x 8  = " + valorInteiro*8);
		System.out.println(valorInteiro + " x 9  = " + valorInteiro*9);
		System.out.println(valorInteiro + " x 10 = " + valorInteiro*10);
			
		entrada.close();
	}

}
