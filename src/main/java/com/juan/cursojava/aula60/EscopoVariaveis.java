/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula60;

/**
 *
 * @author juann
 */
public class EscopoVariaveis {
    
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public int calcularValor(int valor){
        valor = valor+10; //referência ao parâmetro (variável local)
        //this.valor //referência ao atributo
        return valor;
    }
    
    public int teste(){
        int valor = 5;
        if(true){
            valor--;
        }
        
        return valor;
    }
}
