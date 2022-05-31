package desafiosDeProjeto.bancoDio;

import java.util.LinkedHashMap;
import java.util.Map;

public class BancoDeDados {

    private static Map<Integer, Conta> bancoDeContas = new LinkedHashMap<>();



    static public void addNovaConta(Conta conta, Integer numeroConta) {
        bancoDeContas.put(numeroConta, conta);

    }

    static public Conta buscarConta(Integer numeroConta) {

        return bancoDeContas.get(numeroConta);

    }

    static public boolean isContaExistente(Integer numeroConta) {
         boolean contaExiste = false;
        if (bancoDeContas.containsKey(numeroConta)) {
            contaExiste = true;
        }
        return contaExiste;
    }


}
