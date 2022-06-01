package desafiosDeProjeto.padroesDeProjetos.strategy;

public class Frete {

    private ValorFrete comportamento;


    public void setComportamento(ValorFrete comportamento) {
        this.comportamento = comportamento;
    }

    public void calcularFrete(int distanciaKM){
        comportamento.calculaFrete(distanciaKM);
    }

}
