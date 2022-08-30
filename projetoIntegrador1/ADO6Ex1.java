/*Utilize a instrução switch e o laço/loop do-while para implementar uma
questão de múltipla escolha referente a alguma das outras disciplinas que você
está cursando neste semestre. Primeiro deverá ser apresentado o enunciado da
questão com as 5 opções/alternativas de resposta, que são (a), (b), (c), (d) e (e).
Depois que o usuário escolher uma opção, se for a resposta correta deverá ser
impresso “Resposta correta”, caso contrário “Resposta incorreta”. No caso de
“Resposta incorreta” a questão deve ser apresentada novamente para outra
tentativa. Deve ser permitido no máximo 3 tentativas, quando a resposta
correta for escolhida deve ser informado em qual tentativa isso ocorreu, caso
isso não ocorra em nenhuma das 3 tentativas deve ser impresso “Resposta
incorreta nas 3 tentativas”.*/
package projetoIntegrador1;

import java.util.Scanner;

public class ADO6Ex1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String alternativa;
		boolean alternativaCorreta = false;
		int tentativa = 0;

		do {
			
			System.out.println("Pesquisa, Tecnologia e Sociedade - Exercício 1 \n\n"
					
					+ "Segundo Casarin e Casarin (2011), o método científico-experimental \r\n"
					+ "ou empírico segue a seguinte ordem: experimentação; formulação de hipóteses; \r\n"
					+ "repetição do experimento e formulação da lei para explicar o fenômeno. Qual a \r\n"
					+ "finalidade da fase de repetição do experimento? \r\n\n" 
					
					+ "a) A finalidade é a consolidação do experimento como um modelo a ser seguido.\r\n"
					+ "b) A finalidade é o teste das hipóteses previamente formuladas.\r\n"
					+ "c) A finalidade é garantir a precisão e a certeza dos resultados aferidos.\r\n"
					+ "d) A finalidade é provar o quanto a pesquisa experimental é o melhor e mais confiável método que existe para se fazer pesquisa.\r\n"
					+ "e) N/A nenhuma das alternativas acima\r\n"
					
					+ "Digite a alternativa correta: \r\n");


			alternativa = entrada.next();

			switch (alternativa) {

			case "b":
				System.out.println("Resposta correta!");
				alternativaCorreta = true;
				break;

			default:
				tentativa++;

				if (tentativa == 3) {
					System.out.println("Resposta incorreta nas 3 tentativas.");
				}

				break;
			}

		} while (tentativa < 3 && !alternativaCorreta);

		entrada.close();
	}
}
