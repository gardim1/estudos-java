package Desafio2;

public interface ConversaoFinanceira  {
    default double converterDolarParaReal(double valorDolar){
        return valorDolar * 5.91;
    }
}
