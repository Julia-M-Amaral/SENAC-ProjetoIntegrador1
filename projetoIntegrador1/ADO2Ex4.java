//Dado um nome (String) não composto, imprimir a quantidade de caracteres deste nome.
//Julia Mangabeira Amaral Santos - Turma A
package projetoIntegrador1;

import java.util.Scanner;

public class ADO2Ex4 {
public static void main(String[] args) {
		
		String nome = new String();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro nome ");
		nome = entrada.next();
				
		int stringLength = nome.length();
		
		System.out.println("A quantidade de caracteres do seu nome é " + stringLength);
		
		entrada.close();
	}

}
