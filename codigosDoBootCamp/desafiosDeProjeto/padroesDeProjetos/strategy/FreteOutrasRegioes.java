package desafiosDeProjeto.padroesDeProjetos.strategy;

public class FreteOutrasRegioes implements ValorFrete{

    @Override
    public void calculaFrete(int distanciaKM) {
        System.out.println(distanciaKM * 1.10);

    }
}
