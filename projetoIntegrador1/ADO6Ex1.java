/*Utilize a instru��o switch e o la�o/loop do-while para implementar uma
quest�o de m�ltipla escolha referente a alguma das outras disciplinas que voc�
est� cursando neste semestre. Primeiro dever� ser apresentado o enunciado da
quest�o com as 5 op��es/alternativas de resposta, que s�o (a), (b), (c), (d) e (e).
Depois que o usu�rio escolher uma op��o, se for a resposta correta dever� ser
impresso �Resposta correta�, caso contr�rio �Resposta incorreta�. No caso de
�Resposta incorreta� a quest�o deve ser apresentada novamente para outra
tentativa. Deve ser permitido no m�ximo 3 tentativas, quando a resposta
correta for escolhida deve ser informado em qual tentativa isso ocorreu, caso
isso n�o ocorra em nenhuma das 3 tentativas deve ser impresso �Resposta
incorreta nas 3 tentativas�.*/
package projetoIntegrador1;

import java.util.Scanner;

public class ADO6Ex1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String alternativa;
		boolean alternativaCorreta = false;
		int tentativa = 0;

		do {
			
			System.out.println("Pesquisa, Tecnologia e Sociedade - Exerc�cio 1 \n\n"
					
					+ "Segundo Casarin e Casarin (2011), o m�todo cient�fico-experimental \r\n"
					+ "ou emp�rico segue a seguinte ordem: experimenta��o; formula��o de hip�teses; \r\n"
					+ "repeti��o do experimento e formula��o da lei para explicar o fen�meno. Qual a \r\n"
					+ "finalidade da fase de repeti��o do experimento? \r\n\n" 
					
					+ "a) A finalidade � a consolida��o do experimento como um modelo a ser seguido.\r\n"
					+ "b) A finalidade � o teste das hip�teses previamente formuladas.\r\n"
					+ "c) A finalidade � garantir a precis�o e a certeza dos resultados aferidos.\r\n"
					+ "d) A finalidade � provar o quanto a pesquisa experimental � o melhor e mais confi�vel m�todo que existe para se fazer pesquisa.\r\n"
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
