/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula31alt;

import com.juan.cursojava.aula31.Carro;

/**
 *
 * @author juann
 */
public class TesteCarroAlt {

    public static void main(String[] args) {
        Carro carro = new Carro();
        // o  atributo marca tem o modificador public
        carro.marca = "Fiat";
        //Não funciona se o atributos não tiverem o public
        //carro.modelo = "Uno";
        
        //atributo private
        // carro.consumoCombustivel = 10;
    }
}
