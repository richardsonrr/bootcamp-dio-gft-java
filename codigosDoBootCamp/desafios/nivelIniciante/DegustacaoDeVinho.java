package desafios.nivelIniciante;

import javax.swing.*;

public class DegustacaoDeVinho {

    public static void main(String[] args) {

        String T = JOptionPane.showInputDialog("Digite o tipo de vinho(1,2,3,4,5):");
        String respostasCompetidores =
                JOptionPane.showInputDialog
                        ("Digite o tipo de vinho escolhido por cada participante(em linha unica):");

        String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");

        int count = 0;
        for (String resposta: respostasCompetidoresSplit ) {
            if (resposta.equals(T))
                count++;
        }

        System.out.println("O vinho "+T + " foi escolhido: "+count+" vezes.");

    }

}
