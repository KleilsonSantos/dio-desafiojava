package br.com.dio.desafiojava.models;

/**
 * Classe referência para conta corrente.
 * @author Kleilson dos Santos
 * @version 1.0
 */
public class ContaCorrente extends Conta {
    /**
     * Método para imprimir dados da conta corrente.
     */
    @Override
    protected String imprimeExtrato(Conta conta) {
        return String.format("Imprimindo Extrato Conta Corrente {agencia=%d, conta=%d, saldo=%s}", conta.getAgencia(), conta.getConta(), conta.getSaldo());
    }


}
