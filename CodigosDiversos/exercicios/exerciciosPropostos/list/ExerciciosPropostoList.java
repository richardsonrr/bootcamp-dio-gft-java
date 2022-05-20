package exercicios.exerciciosPropostos.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciciosPropostoList {

    /*

    Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.

    Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,e
    em que mês elas ocorreram (Mostras o mês por extenso: 1-janeiro).
   */

    static Scanner scanner = new Scanner(System.in);
    static List<Integer> mesesDoAno = new ArrayList<>();
    static int contador = 1;



    //So essa propriedade deve ser chamada no main.
    public static void chamaMetodos() {
        gravarMeses();
        listarTemperaturaPorMes();

        media();

    }




    private static void gravarMeses() {
        do {
            System.out.println("digit a " + contador + "ª" + " temperatura:");
            mesesDoAno.add(scanner.nextInt());
            contador++;
        } while (contador <= 6);

    }

    private static void listarTemperaturaPorMes() {
        System.out.println("As temperaturas em seus respectivos meses foram:");
        System.out.println();
        System.out.print("Janeiro:" + mesesDoAno.get(0) + "º" + ", ");
        System.out.print("Fevereiro:" + mesesDoAno.get(1) + "º" + ", ");
        System.out.print("Março:" + mesesDoAno.get(2) + "º" + ", ");
        System.out.print("Abril:" + mesesDoAno.get(3) + "º" + ", ");
        System.out.print("Maio:" + mesesDoAno.get(4) + "º" + ", ");
        System.out.print("Junho:" + mesesDoAno.get(5) + "º" + ".");
        System.out.println();

    }

    private static void media() {
        int result = 0;
        for (int item : mesesDoAno) {
            result += item;

        }
        System.out.println();
        System.out.println("A temperatura media dos meses foi: " + result / contador + "º");
    }


}
