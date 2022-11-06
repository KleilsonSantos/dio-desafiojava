package br.com.dio.desafiojava.models;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author Kleilson dos Santos
 * @version 1.0
 */
@SuppressWarnings("ALL")
@Data
@ToString
public class Cliente extends Conta {

    private Conta clienteConta;
    private List<Conta> contaList;
    public Cliente() {
        this.clienteConta = clienteConta;
    }
}
