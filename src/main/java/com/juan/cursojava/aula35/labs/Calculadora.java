/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula35.labs;

/**
 *
 * @author juann
 */
public class Calculadora {
    public static int fibonacci(int n){
        if(n<2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
    public static int somaNumeros(int n){
        if(n==1){
            return 1;
        }
        return n + somaNumeros(n-1);
    }
}
