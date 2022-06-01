package desafiosDeProjeto.padroesDeProjetos.strategy;

public class FreteNordeste implements  ValorFrete {
    @Override
    public void calculaFrete(int distanciaKM) {
        System.out.println(distanciaKM * 1.50);
    }
}
