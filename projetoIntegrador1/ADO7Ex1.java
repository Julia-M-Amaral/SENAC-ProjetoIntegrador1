package projetoIntegrador1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ADO7Ex1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        ArrayList<String> alternativas = new ArrayList<String>();

        alternativas.add("110111"); //originalmente a
        alternativas.add("11111011100"); //originalmente b
        alternativas.add("111110111000"); //originalmente c
        alternativas.add("111110111"); //originalmente d
        alternativas.add("1111010101"); //originalmente e

        boolean acertou = false;

        do {
            Collections.shuffle(alternativas);

            //Vetor de alternativas que correesponde as respostas
            String vetorAlternativas[] = {"a", "b", "c", "d", "e"};

            //Variável auxiliar para jogar na constante posteriormente
            String respostaCorreta = "";

            //Encontrar a resposta correta no meio das alternativas embaralhadass
            for (int i = 0; i < alternativas.size(); i++) {
                if(alternativas.get(i) == "11111011100") {
                    respostaCorreta = vetorAlternativas[i];
                    break;
                }
            }

            //Constante com resposta correta
            //final String respostaCorreta = auxiliar;

            System.out.println("Matemática para Tecnologia da Informação - Exercício 1 \n\n"
                                + "Os computadores utilizam o sistema binário ou de base 2 que \n"
                                + "é um sistema de numeração em que todas as quantidades se representam \n"
                                + "com base em dois números, ou seja, (0 e 1). Em um computador o número 2012,\n"
                                + "em base decimal, será representado, em base binária, por: \r\n");

            System.out.println("a) " + alternativas.get(0)
                                + "\nb) " + alternativas.get(1)
                                + "\nc) " + alternativas.get(2)
                                + "\nd) " + alternativas.get(3)
                                + "\ne) " + alternativas.get(4) + "\n");

            String respostaSelecionada = entrada.next();

//            switch (resposta) {
//                case respostaCorreta:
//                    System.out.println("Resposta correta.");
//                    acertou = true;
//                    break;
//                default:
//                    System.out.println("Resposta incorreta.");
//            }

            if(respostaCorreta.equals(respostaSelecionada)) {
                System.out.println("\nResposta correta.");
                acertou = true;
            } else {
                System.out.println("Resposta incorreta.");
            }
        } while (acertou == false);
        entrada.close();
    }

}
