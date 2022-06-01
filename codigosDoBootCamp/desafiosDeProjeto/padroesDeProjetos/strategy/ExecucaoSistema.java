package desafiosDeProjeto.padroesDeProjetos.strategy;

import java.util.Scanner;

public class ExecucaoSistema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Frete frete = new Frete();
        FreteOutrasRegioes freteOutrasRegioes;
        FreteNordeste freteNordeste;

        System.out.println("Digite (1) para regiao nordeste, (2) para o resto do brasil");
        String regiao = scanner.next();
        if (regiao.equals("1")){
            freteNordeste = new FreteNordeste();
            System.out.println("Digite a distancia em KM");
            String distancia = scanner.next();
            freteNordeste.calculaFrete(Integer.parseInt(distancia));
        }else {
            freteOutrasRegioes = new FreteOutrasRegioes();
            System.out.println("Digite a distancia em KM");
            String distancia = scanner.next();
            freteOutrasRegioes.calculaFrete(Integer.parseInt(distancia));

        }






    }
}
