package Desafio4;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        try{
            int resultado = num1/num2; //era pra ser float mas ai no java ele retornaria infiny e nao iria cair no catch
            System.out.println(resultado);
        }catch(ArithmeticException e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
}
