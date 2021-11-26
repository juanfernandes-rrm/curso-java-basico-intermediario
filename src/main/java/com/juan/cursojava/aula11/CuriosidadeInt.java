/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula11;

/**
 *
 * @author juann
 */
public class CuriosidadeInt {
    public static void main(String[] args) {
        
        int var1 = 2147483647; //valor máximo para int
        // valor mínimo para int = -2.147.483.648  
        int var2 = 1;
        
        
        
        System.out.println(var1+var2);
        //O resultado é  -2.147.483.648, pois o int funciona como uma roleta
        //o próximo valor após o maior valor é o menor valor de int
        //Isso vale para qualquer tipo númerico no Java.
        
        
    }
}
