/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula70;

import com.juan.cursojava.aula69.MinhaThreadRunnable;

/**
 *
 * @author juann
 */
public class Teste {
    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);
        
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        
        //valores entre 1-10. A prioridade é respeitada na maioria dos casos
        //t1.setPriority(Thread.MAX_PRIORITY); a classe Thread oferece constantes
        t1.setPriority(5); 
        t2.setPriority(3); 
        t3.setPriority(1); 
        
        t1.start();
        t2.start();
        t3.start();
        
        
        
    }
}
