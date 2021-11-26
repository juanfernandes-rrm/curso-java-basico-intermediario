/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula35;

/**
 *
 * @author juann
 */
public class Calculadora {
    public static int fatorialNaoRecursivo(int num) {
        int total = 1;
        for (int i = num; i > 1; i--) {
            total *= i;
        }
        return total;
    }
    
    
    
    //Recursividade, método chamando ele mesmo
    // 5 * fatorial(4)
    // 4 * fatorial(3)
    // 3 * fatorial(2)
    // 2 * fatorial(1)
    // 1 * fatorial(0)
    // fatorial(0) = 1
    public static int fatorial(int num){
        
        //ponto de parada
        if(num == 0){
            return 1;
        }
        
        return num * fatorial(num-1);
    }
}
