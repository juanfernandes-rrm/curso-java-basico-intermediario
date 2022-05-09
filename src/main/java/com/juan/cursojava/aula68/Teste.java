/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula68;

/**
 *
 * @author juann
 */
public class Teste {
    public static void main(String[] args) {
        MinhaThreadRunnable thread = new MinhaThreadRunnable("Thread1",500); //ainda não é uma thread
        /* Feito no construtor de MinhaThreadRunnable
        Thread t1 = new Thread(thread); //transformado em thread
        t1.start();
        */
        
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread2",600); //ainda não é uma thread
        
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread3",800); //ainda não é uma thread
        
    }
}
