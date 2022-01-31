/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula67;

/**
 *
 * @author juann
 */
public class Teste {

    public static void main(String[] args) {
        MinhaThread thread = new MinhaThread("Thread #1",100);
        //thread.run(); -> executar dentro do construtor
        //multi threads
        MinhaThread thread2 = new MinhaThread("Thread #2",900);
        
        
    }
}
