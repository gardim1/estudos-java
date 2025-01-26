package codigosCurso.Desafios1;

import java.util.Scanner;

public class Projeto {

    public static class Funcoes {
        public static double receberValor(double saldo, double valorRecebido) {
            return saldo += valorRecebido;
        }
        public static double transferirValor(double saldo, double valorTransferido){
            if (saldo <valorTransferido){
                System.out.println("Valor em saldo insuficiente ");
                return saldo;
            }
            return saldo -= valorTransferido;
        }
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double saldo = 2000;
        System.out.println("********************************************");
        System.out.println("Dono da conta: Vinicius");
        System.out.println("Saldo: "+ saldo);
        System.out.println("********************************************");
        int contador = 0;

        while(contador != 4){
            System.out.println("Selecione uma opcao \n1- Consultar Saldo\n2- Receber pagamento\n3- Fazer pagamento\n4- Sair");
            contador = leitor.nextInt();

            if(contador == 1){
                System.out.println("Seu saldo é de: " + saldo);
            }else if(contador == 2){
                System.out.println("Digite o valor do pagamento a ser recebido: ");
                double valorRecebido = leitor.nextDouble();
                saldo = Funcoes.receberValor(saldo, valorRecebido);
                System.out.println("Seu saldo agora é de: "+ saldo);
            }else if(contador ==3){
                System.out.println("Digite o valor da transferencia a ser realizada: ");
                double valorTransferido = leitor.nextDouble();
                saldo = Funcoes.transferirValor(saldo, valorTransferido);
                System.out.println("Seu saldo agora é de: "+ saldo);
            }else if (contador == 4){
                break;
            }else{
                System.out.println("OPERACAO INVALIDA!");
            }
        }

    }
}
