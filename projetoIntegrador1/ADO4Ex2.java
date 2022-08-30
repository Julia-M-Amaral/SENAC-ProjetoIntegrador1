/* Implemente uma questão de múltipla escolha referente a alguma das outras
disciplinas que você está cursando neste semestre. Primeiro deverá ser apresentado
o enunciado da questão com as 5 opções/alternativas de resposta, que são (a), (b),
(c), (d) e (e). Depois que o usuário escolher uma opção, se for a resposta correta
deverá ser impresso “Resposta correta”, caso contrário “Resposta incorreta”.
Utilize a instrução switch, invés de if, na implementação.*/
package projetoIntegrador1;

import java.util.Scanner;

public class ADO4Ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String alternativa;

		System.out.println("Pesquisa, Tecnologia e Sociedade - Exercício 1");
		System.out.println("Segundo Casarin e Casarin (2011), o método científico-experimental \r\n"
				+ "ou empírico segue a seguinte ordem: experimentação; formulação de hipóteses; \r\n"
				+ "repetição do experimento e formulação da lei para explicar o fenômeno. Qual a \r\n"
				+ "finalidade da fase de repetição do experimento?\n");
		System.out.println("a) A finalidade é a consolidação do experimento como um modelo a ser seguido.");
		System.out.println("b) A finalidade é o teste das hipóteses previamente formuladas.");
		System.out.println("c) A finalidade é garantir a precisão e a certeza dos resultados aferidos.");
		System.out.println("d) A finalidade é provar o quanto a pesquisa experimental é o melhor e mais confiável método que existe para se fazer pesquisa.");
		System.out.println("e) N/A nenhuma das alternativas acima\n");

		System.out.println("Digite a alternativa correta: \n");
		alternativa = entrada.next();

		switch (alternativa) {

		case "b":
			System.out.println("Resposta correta.");
			break;
		default:
			System.out.println("Resposta incorreta.");

		}

		entrada.close();
	}

}
