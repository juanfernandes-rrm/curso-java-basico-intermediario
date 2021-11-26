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
public class Cilindro extends Figura3D{
    private double raioBase;
    private double altura;

    public Cilindro() {
        super.setNome("Cilindro");
    }

    public Cilindro(double raioBase, double altura) {
        this.raioBase = raioBase;
        this.altura = altura;
    }

    public double getRaioBase() {
        return raioBase;
    }

    public void setRaioBase(double raioBase) {
        this.raioBase = raioBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        double areaBase = Math.PI*raioBase*raioBase;
        double areaLateral = 2*Math.PI*raioBase*altura;
        double area = (2*areaBase) +areaLateral;
        return area;
    }

    @Override
    public double calcularVolume() {
        double volume = Math.PI*(raioBase*raioBase)*altura;
        return volume;
    }
    
}
