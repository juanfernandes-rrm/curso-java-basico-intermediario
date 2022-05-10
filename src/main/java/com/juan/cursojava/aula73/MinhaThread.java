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
public class MinhaThread implements Runnable {

    private String nome;
    private boolean estaSuspenso;
    private boolean foiTerminada;
    
    public MinhaThread(String nome) {
        this.nome = nome;
        this.estaSuspenso = false;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println("Executando " + this.nome);
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread "+this.nome+", "+i);
                Thread.sleep(200);
                //sincronizar a thread
                synchronized(this){
                    while(estaSuspenso){
                        wait();
                    }
                    if(this.foiTerminada){
                        break;
                    }
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Thread " + this.nome + " terminada");
    }
    
    void suspend(){
        estaSuspenso = true;
    }
    
    synchronized void resume(){
        estaSuspenso = false;
        notify();
    }
    
    synchronized void stop(){
        foiTerminada = true;
        notify();
    }

}
