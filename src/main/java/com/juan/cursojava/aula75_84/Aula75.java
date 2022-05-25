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
public class Aula75 {
    public static void main(String[] args) {
        //criando uma string
        String vazia = new String();
        
        String java = new String("JAVA");
        String java1 = new String(java);
        
        char[] charsJava = {'J','A','V','A'};
        String java2 = new String(charsJava);
        
        char[] abcdef = {'A','B','C','D','E','F'};
        String abc = new String(abcdef, 0, 2); //abc
        
        //tabela ascii
        byte[] ascii = {65, 66, 67, 68, 69};
        String abcde = new String(ascii);
        
        String java3 = "JAVA";
        String java4 = "JAVA";
    }
}
