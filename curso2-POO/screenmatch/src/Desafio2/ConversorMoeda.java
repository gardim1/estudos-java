package Desafio2;

public class ConversorMoeda implements ConversaoFinanceira {
        private double taxaCambio;

        public ConversorMoeda(double taxaCambio){
                this.taxaCambio = taxaCambio;
        }

        @Override
        public double converterDolarParaReal(double valorEmDolar) {
                return valorEmDolar*taxaCambio;
        }
}
