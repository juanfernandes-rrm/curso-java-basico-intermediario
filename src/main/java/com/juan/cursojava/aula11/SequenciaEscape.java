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
public class SequenciaEscape {
    public static void main(String[] args) {
        //"Hello, World!"
        System.out.println("\"Hello, World!\"");
        //System.out.println(""); = System.out.println(""\n\r);
        
        //1\4
        System.out.println("1\\4");
    }
}
