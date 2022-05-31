package desafiosDeProjeto.bancoDio;

import javax.swing.*;

public class ExecucaoSistema {

    public static void main(String[] args) {
        //ContasFixas sendo salvas no "banco de dados", pode-se criar um metodo de cadastros de clientes com base nisso.
        ContaCorrente contaDojoao = new ContaCorrente(1, "João almeida");
        BancoDeDados.addNovaConta(contaDojoao, 1);

        ContaCorrente contaDoFrancisco = new ContaCorrente(2, "Francisco linhares");
        BancoDeDados.addNovaConta(contaDoFrancisco, 2);

        ContaCorrente contaDoJose = new ContaCorrente(3, "Jose Antonio");
        BancoDeDados.addNovaConta(contaDoJose, 3);


        // Busca do cliente no "banco de dados"
        JOptionPane.showMessageDialog(null, "Bem Vindo ao DioBank");
        String numeroConta = JOptionPane.showInputDialog("Digite o numero da sua conta: ");
        if (BancoDeDados.isContaExistente(Integer.parseInt(numeroConta))) {

            Conta conta = BancoDeDados.buscarConta(Integer.parseInt(numeroConta));

            String operacao = JOptionPane.showInputDialog("Ola! " + conta.proprietario + ",  digite a operação desejada que deseja. " +
                    "1 -- Deposito, 2 -- Saque 3 --- transferencia. ");
            switch (operacao) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Deposito realizado!");
                    break;

                case "2":
                    JOptionPane.showMessageDialog(null, "Saque efetuado!");
                    break;

                case  "3":
                    String contaDestinatario = JOptionPane.showInputDialog("Digite o numero da conta do destinatario:");
                    Integer contaConvertida = Integer.parseInt(contaDestinatario);
                    if (BancoDeDados.isContaExistente(contaConvertida)){
                        String valorAtrasferir = JOptionPane.showInputDialog("Destinatario encontrado, qual valor deseja transferir?");
                       double valorAtrasferirConvertido = Double.parseDouble(valorAtrasferir);
                        conta.transferir(BancoDeDados.buscarConta(contaConvertida),valorAtrasferirConvertido);
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Conta Destinataria não encontrada");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite uma operação valida! (1,2,3)");
                    break;


            }

            //Operações que o cliente pode executar


        } else {
            JOptionPane.showMessageDialog(null, "Conta Não cadastrada!");
        }


    }
}
