/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula74;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juann
 */
public class Deadlock {
    public static void main(String[] args) {
        
        final String RECURSO01 = "Recurso 01";
        final String RECURSO02 = "Recurso 02";
        
        //classe anonima
        Thread t1 = new Thread(){
            public void run(){
                synchronized(RECURSO01){
                    try {
                        System.out.println("Thread #1: bloqueou o Recurso 1");
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Deadlock.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    System.out.println("Thread #1: tentando o acesso ao Recurso 2");
                    synchronized(RECURSO02){
                        System.out.println("Thread #1: bloqueou o Recurso 2");
                    }
                }
            }
        };
        
        Thread t2 = new Thread(){
            public void run(){
                synchronized(RECURSO02){
                    try {
                        System.out.println("Thread #2: bloqueou o Recurso 2");
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Deadlock.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    System.out.println("Thread #2: tentando o acesso ao Recurso 1");
                    synchronized(RECURSO01){
                        System.out.println("Thread #2: bloqueou o Recurso 1");
                    }
                }
            }
        };
        
        t1.start();
        t2.start();
    }
}
