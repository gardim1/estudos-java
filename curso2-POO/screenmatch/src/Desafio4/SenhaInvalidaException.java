package Desafio4;

public class SenhaInvalidaException extends RuntimeException{
    public SenhaInvalidaException(String mensagem){
        super(mensagem);
    }
}
