package Desafio4;

public class Main {
    public static void main(String[] args) {
        try{
            Senha senha = new Senha();
        }catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }
    }
}
