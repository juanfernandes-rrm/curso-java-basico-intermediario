/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula74.labs;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juann
 */
public class SimuladorSemaforo {

    public static void main(String[] args) {
        ThreadSemafaro semafaro = new ThreadSemafaro();

        for (int i = 0; i < 10; i++) {
            System.out.println(semafaro.getCor());
            //Thread.sleep(500);
            semafaro.esperarCorMudar();
        }
        semafaro.desligarSemafaro();
    }
}
