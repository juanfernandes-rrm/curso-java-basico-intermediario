/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula27.labs;

/**
 *
 * @author juann
 */
public class Ex01 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        
        lampada.ligarLampada();
        lampada.verificarLampada();
        
        lampada.desligarLampada();
        lampada.verificarLampada();

    }
}
