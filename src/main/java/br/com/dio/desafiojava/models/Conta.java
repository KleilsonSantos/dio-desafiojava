package br.com.dio.desafiojava.models;

import br.com.dio.desafiojava.excecoes.ValorInferiorSaldo;
import br.com.dio.desafiojava.excecoes.ValorInferiorTransferencia;
import br.com.dio.desafiojava.interfaces.Transacoes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe base de atributos e métodos para as classes filhas.
 * @author Kleilson dos Santos
 * @version 1.0
 */
@Data
@AllArgsConstructor
@ToString
public abstract class Conta implements Transacoes {

    protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;
    protected int agencia;
    protected int conta;
    protected double saldo;
    private List<Conta> list = new ArrayList<>();
    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }

    /**
     * Método responsável em adicionar valores ao saldo da conta.
     */
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    /**
     * Método responsável em retirar valores ao saldo da conta.
     */
    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            throw new ValorInferiorSaldo("Valor solicitado e superior ao valor do saldo, saque não realizado");
        }
    }

    /**
     * Método responsável por transferir valores
     * de uma conta origem para uma conta destino.
     */
    @Override
    public void transferir(Conta contaDestino, double valor) {
        if (valor <= getSaldo()) {
            saldo -= valor;
            contaDestino.depositar(valor);
        } else {
            throw new ValorInferiorTransferencia("Valor solicitado e superior ao valor do saldo, transferência não realizada");
        }
    }

    public void cadastrarCliente(Cliente cliente){
        list.add(cliente);
    }

    public List<Conta> clienteList(){
        return list;
    }
    protected String imprimeExtrato(Conta origem) {
        return "Imprimindo Extrato{" +
                       "agencia=" + origem.getAgencia() +
                       ", conta=" + origem.getConta() +
                       ", saldo=" + String.format("%.2f",origem.getSaldo()) +
                       '}';
    }
}
