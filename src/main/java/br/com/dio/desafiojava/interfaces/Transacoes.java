package br.com.dio.desafiojava.interfaces;

import br.com.dio.desafiojava.models.Conta;

import java.util.List;


/**
 *  Interface que garante a obrigatoriedade da implementação
 *  das transações bancárias;
 *
 * @author Kleilson dos Santos
 * @version 1.0
 */
public interface Transacoes {

    /*
     * Método responsável por adicionar o valor
     * passada como parâmetro do valor que tem em conta.
     */
    void depositar(double valor);

    /*
     * Método responsável por retirar um valor
     * passado como parâmetro do valor que tem em conta.
     */
    void sacar(double valor);

    /*
     * Método responsável por transferir de uma conta
     * para outra, o valor passado como parâmetro.
     */
    void transferir(Conta contaDestino, double valor);

    List<Conta> clienteList();
}
