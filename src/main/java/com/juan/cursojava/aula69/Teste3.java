/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula69;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juann
 */
public class Teste3 {
    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1",500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2",700);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3",800);
        
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        
        t1.start();
        t2.start();
        t3.start();
        
        
        try {
            //só executa o próximo código após o fim da execução da thread 
            //ou após um determinado tempo do inicio da execuçao da thread
            //t1.join(200); 
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Teste3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //executar esse código após as threads
        System.out.println("Programa finalizado");
        
        
    }
}
