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
public class Cubo extends Figura3D{
    private double aresta;

    public Cubo() {
        super.setNome("Cubo");
    }

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
    
    @Override
    public double calcularArea() {
        double area = aresta*aresta*6;
        return area;
    }

    @Override
    public double calcularVolume() {
        double volume = aresta*aresta*aresta;
        return volume;
    }
    
}
