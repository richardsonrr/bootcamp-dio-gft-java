package exercicios.estruturasDeRepeticaoEArrays;

import java.util.Scanner;

public class NotaCerta {
//  Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor
//  seja inválido e continue pedindo até que o usuário informe um valor válido.


    public static void nota(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota entra 0 e 10:");
        double nota = scanner.nextDouble();


            while (nota < 0 || nota > 10){
                System.out.println("Nota invalida");
                System.out.println("Digite uma nota entre 0 e 10");
                nota = scanner.nextDouble();
            }

            System.out.println("Nota valida");


    }



}
