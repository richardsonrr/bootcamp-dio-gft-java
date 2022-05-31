package desafiosDeProjeto.bancoDio;

import javax.swing.*;
import java.math.BigDecimal;

abstract public class Conta {
    private Integer numero;
    String proprietario;
    private Integer senha;

    private double saldo = 0;

    Conta(Integer numero, String proprietario) {
        this.numero = numero;
        this.proprietario = proprietario;
    }


    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    protected void depositar(double valor) {
        this.saldo += valor;
    }

    protected void sacar(double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;
            JOptionPane.showMessageDialog(null,"Saque Efetuado!");
        }
        else {
            JOptionPane.showMessageDialog(null,"Saldo Insuficiente");
        }


    }

    protected void transferir(Conta destinatario, double valor) {
        destinatario.depositar(valor);
        this.sacar(valor);

    }





}


