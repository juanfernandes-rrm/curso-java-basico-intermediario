/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula75_84;

/**
 *
 * @author juann
 */
public class Aula79 {
    public static void main(String[] args) {
        String banana = "banana";
        String ana = "ana";
        
        //retorna o indice do inicio da string procurada
        //ou -1 se nao existir
        System.out.println(banana.indexOf(ana));
        System.out.println(banana.indexOf("x"));
        
        //retorna o indice do ultimo lugar que a string aparace
        System.out.println(banana.lastIndexOf(ana));
        System.out.println(banana.lastIndexOf("x"));
        
        //retorna true ou false se contem determinada string
        System.out.println(banana.contains(ana));
    }
}
