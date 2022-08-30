/* Implemente uma quest�o de m�ltipla escolha referente a alguma das outras
disciplinas que voc� est� cursando neste semestre. Primeiro dever� ser apresentado
o enunciado da quest�o com as 5 op��es/alternativas de resposta, que s�o (a), (b),
(c), (d) e (e). Depois que o usu�rio escolher uma op��o, se for a resposta correta
dever� ser impresso �Resposta correta�, caso contr�rio �Resposta incorreta�.
Utilize a instru��o switch, inv�s de if, na implementa��o.*/
package projetoIntegrador1;

import java.util.Scanner;

public class ADO4Ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String alternativa;

		System.out.println("Pesquisa, Tecnologia e Sociedade - Exerc�cio 1");
		System.out.println("Segundo Casarin e Casarin (2011), o m�todo cient�fico-experimental \r\n"
				+ "ou emp�rico segue a seguinte ordem: experimenta��o; formula��o de hip�teses; \r\n"
				+ "repeti��o do experimento e formula��o da lei para explicar o fen�meno. Qual a \r\n"
				+ "finalidade da fase de repeti��o do experimento?\n");
		System.out.println("a) A finalidade � a consolida��o do experimento como um modelo a ser seguido.");
		System.out.println("b) A finalidade � o teste das hip�teses previamente formuladas.");
		System.out.println("c) A finalidade � garantir a precis�o e a certeza dos resultados aferidos.");
		System.out.println("d) A finalidade � provar o quanto a pesquisa experimental � o melhor e mais confi�vel m�todo que existe para se fazer pesquisa.");
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
