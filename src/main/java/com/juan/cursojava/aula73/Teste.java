/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula73;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author juann
 */
public class Teste {
    public static void main(String[] args) {
        MinhaThread t1 = new MinhaThread("#1");
        MinhaThread t2 = new MinhaThread("#2");
        
        System.out.println("Suspendendo #1");
        t1.suspend();
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Suspendendo #2");
        t2.suspend();
        
        System.out.println("Resumindo #1");
        t1.resume();
        
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Resumindo #2");
        t2.resume();
        System.out.println("Terminando #2");
        t2.stop();
        
        
    }
}
