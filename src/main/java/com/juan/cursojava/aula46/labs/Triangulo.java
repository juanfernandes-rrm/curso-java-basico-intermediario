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
public class Triangulo extends Figura2D{
    private double base;
    private double altura;
    

    public Triangulo() {
        super.setNome("Triângulo");
    }
    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        double area = (base*altura)/2;
        return area;
    }
   
    
}
