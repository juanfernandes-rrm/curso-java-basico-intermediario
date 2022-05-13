/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula74.labs;

/**
 *
 * @author juann
 */
public enum CorSemafaro {
    VERDE(1000), AMARELO(200), VERMELHO(2000);
    
    private int tempoEspera;
    
    CorSemafaro(int tempoEspera){
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }    
    
}
