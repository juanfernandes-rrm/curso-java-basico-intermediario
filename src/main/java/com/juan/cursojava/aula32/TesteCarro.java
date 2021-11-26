/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula32;

/**
 *
 * @author juann
 */
public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        //atributos private
        //van.marca = "Fiat";
        
        van.setMarca("Fiat");
        System.out.println("Marca: "+van.getMarca());
    }
}
