package exercicios.estruturasDeRepeticaoEArrays;


/* Desenvolver um programa para verificar a recebeRespostas do aluno em uma prova com 10 questões,
   o programa deve perguntar ao aluno a resposta de cada questão e ao final comparar com o gabarito da prova e assim
   calcular o total de acertos e a recebeRespostas (atribuir 1 ponto por resposta certa). Após cada aluno utilizar o sistema deve ser feita uma
   pergunta se outro aluno vai utilizar o sistema. Após todos os alunos terem respondido informar:
   Maior e Menor Acerto;
   Total de Alunos que utilizaram o sistema;
   A Média das Notas da Turma.

Gabarito da Prova:

        01 - A
        02 - B
        03 - C
        04 - D
        05 - E
        06 - E
        07 - D
        08 - C
        09 - B
        10 - A
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NotasAlunos {


    public static void resultados() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        ArrayList notas = new ArrayList();
        int quantidadeDeAlunos = 0;

        do{
            System.out.println("Digite as suas repostas logo a baixo");
            notas.add(comparaComGabarito());
            System.out.println("Para adicionar nova prova aperte qualquer tecla, caso nao queria aperte 'N'. ");
            quantidadeDeAlunos++;


            if(scanner.next().equalsIgnoreCase("n")){
                continuar = false;
            System.out.println(quantidadeDeAlunos + " Alunos usaram o sistema.");
             mediaNotas(notas);
            maiorEMenorNota(notas);


            }


        }while (continuar);

    }

    private static int comparaComGabarito() {
        ArrayList gabarito = new ArrayList<String>();
        ArrayList respostasAluno = recebeRespostas();
        List<String> lista = List.of("a", "b", "c", "d", "e", "e", "d", "c", "b", "a");
        gabarito.addAll(lista);
        int notaAluno = 0;

        for (int i = 0; i < 10; i++) {
            if (gabarito.get(i).equals(respostasAluno.get(i))) {

                notaAluno++;
            }

        }

        return notaAluno;


    }

    private static ArrayList recebeRespostas() {
        Scanner scanner = new Scanner(System.in);
        ArrayList respostas = new ArrayList<String>();
        for (int i = 1; i < 11; i++) {
            System.out.println("Digite a resposta da questão: " + i );
            respostas.add(scanner.next().toLowerCase());


        }

        return respostas;

    }

    private static void mediaNotas(ArrayList notas){
        int somaNotas = 0;

        for (int i = 0; i < notas.size();i++){

            somaNotas += (int)notas.get(i);

        }

           System.out.println("A nota media dos alunos é: " + somaNotas/notas.size());
    }

    private static void maiorEMenorNota(ArrayList notas){
        int maiornota , menorNota;
        Collections.sort(notas);

        if (notas.size() > 0){

       maiornota = (int) notas.get(notas.size() -1);
       menorNota = (int) notas.get(0);

        System.out.println("A maior nota da sala foi: "+ maiornota);

        System.out.println("A menor nota da sala foi: "+ menorNota);

        }else {

            System.out.println("Não a notas suficientes para comparar");
        }

    }


}
