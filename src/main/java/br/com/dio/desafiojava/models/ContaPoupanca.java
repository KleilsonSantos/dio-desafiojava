package br.com.dio.desafiojava.models;

/**
 * Classe referência para conta poupança.
 * @author Kleilson dos Santos
 * @version 1.0
 */
public class ContaPoupanca extends Conta {
    /**
     * Método para imprimir dados da conta poupança.
     */
    @Override
    protected String imprimeExtrato(Conta conta) {
        return String.format("Imprimindo Extrato Conta Poupança {agencia=%d, conta=%d, saldo=%s}", conta.getAgencia(), conta.getConta(), conta.getSaldo());
    }
}
