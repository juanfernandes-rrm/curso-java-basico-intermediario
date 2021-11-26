/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula13;

/**
 *
 * @author juann
 */
public class CurtoCircuito {
    public static void main(String[] args) {
        boolean verdadeiro = true;
        boolean falso = false;
        //No AND, só é verdadeiro se os todas as sentenças forem verdadeiras
        
        boolean resultado1 = falso & 
                            verdadeiro;
        
        //como a primeira setença é falsa, 
        //as outras sentenças nem são consideradas (&&)
        boolean resultado2 = falso && 
                            verdadeiro; 
        
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
