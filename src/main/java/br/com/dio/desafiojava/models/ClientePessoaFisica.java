package br.com.dio.desafiojava.models;

import br.com.dio.desafiojava.services.DateConvert;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

/**
 * @author Kleilson dos Santos
 * @version 1.0
 */
@SuppressWarnings("ALL")
@Data
@ToString
public class ClientePessoaFisica extends Cliente {

    private String clienteNome;
    private static String CLIENTE_CPF = null;
    private LocalDate clienteDataNascimento;
    private DateConvert dateConvert;

    public ClientePessoaFisica(String clienteNome,String CLIENTE_CPF, LocalDate clienteDataNascimento) {
        super();
        this.clienteNome = clienteNome;
        this.CLIENTE_CPF = CLIENTE_CPF;
        this.clienteDataNascimento = clienteDataNascimento;
    }

    @Override
    public String toString() {
        return "ClientePessoaFisica{" +
                       "clienteNome=" + clienteNome +
                       ", clienteDataNascimento=" + DateConvert.returnDate(clienteDataNascimento) +
                       ", agencia=" + agencia +
                       ", conta=" + conta +
                       ", saldo=" + saldo +
                       '}';
    }
}
