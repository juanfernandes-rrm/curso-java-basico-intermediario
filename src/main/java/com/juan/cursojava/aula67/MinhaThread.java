/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula67;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juann
 */
public class MinhaThread extends Thread{
    private String nome;
    private int tempo;
    
    public MinhaThread(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        start();
    }
    
    //sobrescrevendo o método
    public void run(){
        for(int i =0;i<6;i++){
            System.out.println(nome+" contador "+tempo);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
