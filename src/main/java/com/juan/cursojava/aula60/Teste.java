/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula60;

/**
 *
 * @author juann
 */
public class Teste {
    public static void main(String[] args) {
        EscopoVariaveis escopo = new EscopoVariaveis();
        escopo.setValor(10);
        
        System.out.println(escopo.getValor());
        System.out.println(escopo.calcularValor(20));
        System.out.println(escopo.getValor());
        
    }
}
