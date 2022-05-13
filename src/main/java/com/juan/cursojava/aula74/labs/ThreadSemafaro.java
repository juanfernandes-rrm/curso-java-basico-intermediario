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
public class ThreadSemafaro implements Runnable {

    private CorSemafaro cor;
    private boolean parar; //false
    private boolean corMudou; //false

    public ThreadSemafaro() {
        this.cor = CorSemafaro.VERMELHO;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!parar) {
            try {
                /*
                switch (this.cor) {
                    case VERMELHO:
                        Thread.sleep(2000);
                        break;
                    case AMARELO:
                        Thread.sleep(200);
                        break;
                    case VERDE:
                        Thread.sleep(1000);
                        break;
                    default:
                        break;
                }
                */
                Thread.sleep(this.cor.getTempoEspera());
                //mudar a cor
                this.mudarCor();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadSemafaro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private synchronized void mudarCor() {
        switch (this.cor) {
            case VERMELHO:
                this.cor = CorSemafaro.VERDE;
                break;
            case AMARELO:
                this.cor = CorSemafaro.VERMELHO;
                break;
            case VERDE:
                this.cor = CorSemafaro.AMARELO;
                break;
            default:
                break;
        }
        this.corMudou = true;   
        notify();
    }
    
    public synchronized void esperarCorMudar(){
        while(!corMudou){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadSemafaro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.corMudou = false;
    }
    
    public synchronized void desligarSemafaro(){
        this.parar = true;
    }

    public CorSemafaro getCor() {
        return cor;
    }
    
    
}
