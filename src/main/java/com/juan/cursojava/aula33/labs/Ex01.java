/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula33.labs;

/**
 *
 * @author juann
 */
public class Ex01 {
    //teste classe lampada
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        
        lampada.setTensao("110V");
        lampada.setPotencia(60);
        lampada.setCor("Branca");
        
        lampada.mudarEstado();
        lampada.verificarLampada();
        System.out.println(lampada.isLigada());
    }
}
