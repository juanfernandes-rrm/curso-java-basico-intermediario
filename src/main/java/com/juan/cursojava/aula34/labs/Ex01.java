/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula34.labs;

/**
 *
 * @author juann
 */
public class Ex01 {
    
    static void imprimirValor(){
        System.out.println("Valor "+Contador.getCont());
    }
    
    public static void main(String[] args) {
        imprimirValor();
        Contador.incrementar();
        imprimirValor();
        Contador.zerar();
        imprimirValor();
        
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
    }
}
