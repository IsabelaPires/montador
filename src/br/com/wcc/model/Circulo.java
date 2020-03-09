package br.com.wcc.model;

/**
 * Circulo
 */
public class Circulo implements Shape{
    private final Double raio;

    public Circulo (Double raio) {
        this.raio = raio;

    }


    @Override
    public Double getArea() {
    
        return Math.PI * Math.pow (raio,2);
    }

    @Override
    public double getPerimetro() {

        return 2 * Math.PI * raio;
    }

    
}