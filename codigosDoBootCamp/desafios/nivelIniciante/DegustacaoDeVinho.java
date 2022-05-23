package desafios.nivelIniciante;

import java.util.Scanner;

public class DegustacaoDeVinho {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tipo de vinho(1,2,3,5):");
        String T = scan.nextLine();
        System.out.println("Digite o tipo de vinho escolhido por cada participante(em linha unica):");

        String respostasCompetidores = scan.nextLine();
        String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");

        int count = 0;
        for (String resposta: respostasCompetidoresSplit ) {
            if (resposta.equals(T))
                count++;
        }

        System.out.println("O vinho "+T + " foi escolhido: "+count+" vezes.");

    }

}
