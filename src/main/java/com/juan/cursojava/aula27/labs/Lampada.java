/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula27.labs;

/**
 *
 * @author juann
 */

//ex001
public class Lampada {

    String tipo;
    String tensao;
    int potencia;
    String cor;
    double durabilidade;
    int garantiaMeses;
    boolean ligada;

    Lampada() {
        ligada = false;
    }
    
    void ligarLampada(){
        ligada = true;
    }
    
    void desligarLampada(){
        ligada = false;
    }

    void mudarEstado() {
        if(!ligada){
            ligarLampada();
        }else{
            desligarLampada();
        }
    }

    void verificarLampada() {
        if (ligada == true) {
            System.out.println("A lâmpada está ligada");
        } else {
            System.out.println("A lâmpada está desligada");
        }
    }
}
