package Desafio2;

public class CalculadoraSalaRetangular implements CalculoGeometrico {


    @Override
    public double calcularArea(double altura, double largura) {
        return altura*largura;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        double perimetro = 2;
        return perimetro * (largura + altura);
    }
}
