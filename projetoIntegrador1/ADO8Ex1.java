/*Utilizando a classe Random (java.util.Random) ou o método random
(Math.random()) implemente um programa que simule o lançamento de 1
dado de 6 faces 1.000.000 (1 milhão) de vezes consecutivas. Ao final apresente
a porcentagem de vezes que cada face apareceu, lembrando que a soma de
todas as porcentagens será 100% (aproximadamente).*/
package projetoIntegrador1;

import java.util.Random;

public class ADO8Ex1 {
	public static void main(String[] args) {

		Random random = new Random();

		
		
		double faceUm = 0, faceDois = 0, faceTres = 0, faceQuatro = 0, faceCinco = 0, faceSeis = 0;

		double limite = 1000000;
		
		for (int i = 0;  i < limite; i++) {
			
			int numero = random.nextInt(6) + 1;

			if (numero == 1) {
				faceUm = faceUm + 1;
				
			} else if (numero == 2) {
				faceDois = faceDois + 1;
				
			} else if (numero == 3) {
				faceTres = faceTres + 1;
				
			} else if (numero == 4) {
				faceQuatro = faceQuatro + 1;
				
			} else if (numero == 5) {
					faceCinco = faceCinco + 1;
					
			} else if (numero == 6) {
					faceSeis = faceSeis + 1;
			}

		}
		
		System.out.println("A porcentagem da face no número 1 é: " + (faceUm*100/limite));
		System.out.println("A porcentagem da face no número 2 é: " + (faceDois*100/limite));
		System.out.println("A porcentagem da face no número 3 é: " + (faceTres*100/limite));
		System.out.println("A porcentagem da face no número 4 é: " + (faceQuatro*100/limite));
		System.out.println("A porcentagem da face no número 5 é: " + (faceCinco*100/limite));
		System.out.println("A porcentagem da face no número 6 é: " + (faceSeis*100/limite));
		
		System.out.println("A soma total da porcentagem das faces do cubo é: " + (faceUm*100/limite+ faceDois*100/limite + faceTres*100/limite + faceQuatro*100/limite + faceCinco*100/limite + faceSeis*100/limite) );
		
		
		
	}
}
