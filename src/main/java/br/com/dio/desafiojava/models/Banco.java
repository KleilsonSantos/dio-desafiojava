package br.com.dio.desafiojava.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kleilson dos Santos
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Banco {
    private String bancoEndereco;
    private String bancoTelefone;
    private String bancoCNPJ;

    private List<Cliente> clienteList = new ArrayList<>();

    public Banco(String bancoEndereco, String bancoTelefone, String bancoCNPJ) {
        this.bancoEndereco = bancoEndereco;
        this.bancoTelefone = bancoTelefone;
        this.bancoCNPJ = bancoCNPJ;
    }

    public void cadastrarClientes(Cliente cliente){
        clienteList.add(cliente);
        retornaClientes();
    }

    public List<Cliente> retornaClientes(){
        return clienteList;
    }
}
