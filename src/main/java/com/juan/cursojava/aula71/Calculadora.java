/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula71;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juann
 */
public class Calculadora {
    private int soma;
    
    public synchronized int somaArray(int[] array){
        soma=0;
        
        for(int i=0; i<array.length; i++){
            soma+=array[i];
            //thread atual que está acessando o método
            System.out.println("Executando a soma "
            +Thread.currentThread().getName()+" somando o valor "
            +array[i]+" com o total de "+soma);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(
                Calculadora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return soma;
    }
}
