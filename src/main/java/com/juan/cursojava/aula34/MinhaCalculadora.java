/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula34;

/**
 *
 * @author juann
 */
public class MinhaCalculadora {
    public static int soma(int num1, int num2){
        return num1 + num2;
    }
    
    public static double soma(double num1, double num2){
        return num1 + num2;
    }
    
    public static int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    
    public static int soma(int[] vetorInteiros){
        int total = 0;
        
        for(int i=0; i<vetorInteiros.length; i++){
            total+= vetorInteiros[i];
        }
        return total;
    }
}
