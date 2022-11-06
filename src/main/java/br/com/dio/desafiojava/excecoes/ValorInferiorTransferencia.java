package br.com.dio.desafiojava.excecoes;

/**
 * @author Kleilson dos Santos
 * @version 1.0
 */
public class ValorInferiorTransferencia extends RuntimeException{

    private String mensagem;

    public ValorInferiorTransferencia(String mensagem){
        super(mensagem);
    }
}
