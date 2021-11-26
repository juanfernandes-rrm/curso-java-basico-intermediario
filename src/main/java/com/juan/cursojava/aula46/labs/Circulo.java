/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula46.labs;

/**
 *
 * @author juann
 */
public class Circulo extends Figura2D{
    private double raio;

    public Circulo() {
        super.setNome("Círculo");
    }
    
    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea() {
        double area = Math.PI*(raio*raio);
        return area;
    }
    
}
