/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula31;

/**
 *
 * @author juann
 */
public class Carro {
    public String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel;

    public Carro() {
    }
    
    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + "KM");
    }

    public double obterAutonomia() {
        return this.capCombustivel * this.consumoCombustivel;
    }

    private double divideKMPorConsumoCombustivel(double km){
        return km/this.consumoCombustivel;
    }
    
    public double calcularCombustivel(double km) {
        return this.divideKMPorConsumoCombustivel(km);
    }

}
