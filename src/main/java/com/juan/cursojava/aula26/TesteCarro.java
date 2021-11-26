/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula26;

/**
 *
 * @author juann
 */
public class TesteCarro {
    public static void main(String[] args) {      
        
        Carro fusca = new Carro();
        fusca.marca = "volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 5;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;
        
        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        
        fusca.exibirAutonomia();
        double autonomia = fusca.obterAutonomia();
        System.out.println("Autonomia é: "+autonomia);
    }
}
