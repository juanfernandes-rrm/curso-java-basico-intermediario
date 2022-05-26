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
public class Aula83 {
    public static void main(String[] args) {
        String[] letras = {"B","C","D","E","F"};
        String alfabeto = "";
        
        StringBuffer sb = new StringBuffer();
        for(String letra:letras){
            sb.append(letra);
        }
        alfabeto = sb.toString();
        System.out.println(alfabeto); //BCDEF
        System.out.println(sb.reverse()); //FEDCB
        
        
        StringBuilder sb_ = new StringBuilder();
        for(String letra:letras){
            sb_.append(letra);
        }
        alfabeto = sb_.toString();
        System.out.println(alfabeto);
    }
}
