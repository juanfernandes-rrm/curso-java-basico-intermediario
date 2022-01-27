/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula56.labs;

/**
 *
 * @author juann
 */
public class Teste {
    public static void main(String[] args) {
        for(Calculadora operacao:Calculadora.values()){
            int num1 = 10;
            int num2 = 5;
            System.out.println((num1)+" "+operacao+" "+(num2)+" = "+operacao.executarOperacao(num1, num2));
        }
    }
}
