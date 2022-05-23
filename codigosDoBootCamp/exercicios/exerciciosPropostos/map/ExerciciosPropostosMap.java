package exercicios.exerciciosPropostos.map;

import java.util.*;


public class ExerciciosPropostosMap {

    protected static Map<String,Double> notaAlunos = new HashMap<>();
    protected static Scanner scanner = new Scanner(System.in);
/*
* O codigo Busca a maior nota de uma turma de alunos
* Mostra qual foi a maior nota e quem foi o responsavel.
* tbm pode buscar a nota de um aluno especifico
* */



    public static void chamaMetodos(){

        adicionarNotas();
        maiorNotaDasala();
        buscarKey();



    }


    private static void adicionarNotas(){

        notaAlunos.put("rafael",22.0);
        notaAlunos.put("joao",12.0);
        notaAlunos.put("fernando",32.0);
        notaAlunos.put("gustavo",42.0);
        notaAlunos.put("leticia",1.0);

        System.out.println("Alunos com notas Lançadas: ");
        System.out.println(notaAlunos.keySet());
        System.out.println();


    }

    private static void buscarKey(){
        System.out.println("Digite o nome do aluno cujo qual deseja saber a nota:");
        String nome = scanner.next().toLowerCase();

      if(notaAlunos.containsKey(nome)){
          System.out.println(notaAlunos.get(nome));

      }else {
          System.out.println("Nota do aluno não encontrada");

      }




    }

    private static void maiorNotaDasala(){
       String alunoComMaiorNota = "";
       double maiorNota = Collections.max(notaAlunos.values());

        for (Map.Entry<String, Double> entry : notaAlunos.entrySet()) {
            if (entry.getValue().equals(maiorNota)){
               alunoComMaiorNota = entry.getKey();
            }
        }

            System.out.println("A maior nota é: "+ maiorNota);
            System.out.println("O aluno que tirou a maior nota foi: " + alunoComMaiorNota);
            System.out.println();
    }



}
