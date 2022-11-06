package br.com.dio.desafiojava.excecoes;

/**
 * @author Kleilson dos Santos
 * @version 1.0
 */
public class ValorInferiorSaldo extends RuntimeException{

    private String mensagem;

    public ValorInferiorSaldo(String mensagem){
        super(mensagem);
    }
}
