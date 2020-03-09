package br.com.wcc.model;

/**
 * Retangulo
 */
public class Retangulo implements Shape {
    private final Double base;
    private final double altura;
    


    public Retangulo(Double base, double altura) {
        this.base = base;
        this.altura = altura;
    }   


    @Override
    public Double getArea() {

        return base*altura;
    }

    @Override
    public double getPerimetro() {
        return (2 * base);
    }

    

}