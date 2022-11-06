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
public class ClientePessoaJuridica extends Cliente {

    private String clienteNome;
    private static String CLIENTE_CNPJ = null;

    private LocalDate clienteDataNascimento;

    private DateConvert dateConvert;
    public ClientePessoaJuridica(String clienteNome,String CLIENTE_CNPJ, LocalDate clienteDataNascimento) {
        super();
        this.clienteNome = clienteNome;
        this.CLIENTE_CNPJ = CLIENTE_CNPJ;
        this.clienteDataNascimento = clienteDataNascimento;
    }

    @Override
    public String toString() {
        return "ClientePessoaJuridica{" +
                       "clienteNome=" + clienteNome +
                       ", clienteDataNascimento=" + DateConvert.returnDate(clienteDataNascimento) +
                       ", agencia=" + agencia +
                       ", conta=" + conta +
                       ", saldo=" + saldo +
                       '}';
    }
}
