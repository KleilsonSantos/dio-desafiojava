package br.com.dio.desafiojava.aplicacaos;

import br.com.dio.desafiojava.models.Banco;
import br.com.dio.desafiojava.models.Cliente;
import br.com.dio.desafiojava.models.ClientePessoaFisica;
import lombok.val;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.MissingFormatArgumentException;

import static java.util.Locale.US;

/**
 * @author Kleilson dos Santos
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(US);
        List<Cliente> clienteList = new ArrayList<>();
        try {
            val banco = new Banco();
            clienteList.add(new ClientePessoaFisica("Jhon Mayes", "777856789-78", LocalDate.of(1981, 10, 21)));
            clienteList.add(new ClientePessoaFisica("Lucas Emanoel", "123321789-78", LocalDate.of(2011, 11, 8)));
            clienteList.add(new ClientePessoaFisica("Pedro André Mayes", "111222789-78", LocalDate.of(2015, 7, 8)));
            clienteList.add(new ClientePessoaFisica("Carla Dias", "654654789-78", LocalDate.of(2020, 2, 28)));
            clienteList.add(new ClientePessoaFisica("Jennifer Carla", "486654789-78", LocalDate.of(2021, 6, 15)));
            clienteList.forEach(banco::cadastrarClientes);
            List<Cliente> listarClientes = banco.retornaClientes();
            listarClientes.forEach(System.out::println);
        } catch (
                  MissingFormatArgumentException e) {
            System.out.printf("Erro de formatação -> %s%n", e.getMessage());
        }

    }
}
