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
public class Ex02 {
    public static void main(String[] args) {
        int soma = Calculadora.somar(3, 6);
        System.out.println("Soma "+soma);
        int subt = Calculadora.subtrair(6, 3);
        System.out.println("subt "+subt);
        int mult = Calculadora.multiplicar(3, 4);
        System.out.println("Mult "+mult);
        double div = Calculadora.dividir(12, 3);
        System.out.println("Div "+div);
        double pot = Calculadora.potencia(2, 3);
        System.out.println("Pot "+pot);
    }
}
