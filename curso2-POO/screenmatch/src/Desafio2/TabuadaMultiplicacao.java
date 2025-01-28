package Desafio2;

public class TabuadaMultiplicacao implements Tabuada{

    int resultado;

    @Override
    public int mostrarTabuada(int numero) {

        for (int i = 0; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(resultado);
        }

        return resultado;
    }
}
