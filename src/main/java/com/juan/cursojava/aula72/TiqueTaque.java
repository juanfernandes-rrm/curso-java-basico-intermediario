/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula72;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juann
 */
public class TiqueTaque {

    boolean tique;

    synchronized void tique(boolean estaExecutando) {
        if (!estaExecutando) {
            tique = true;
            notify();
            return;
        }
        System.out.print("Tique ");

        tique = true;
        notify();

        try {
            while (tique) {
                wait();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(TiqueTaque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    synchronized void taque(boolean estaExecutando) {
        if (!estaExecutando) {
            tique = false;
            notify();
            return;
        }
        System.out.print("Taque ");

        tique = false;
        notify();

        try {
            while (!tique) {
                wait();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(TiqueTaque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
