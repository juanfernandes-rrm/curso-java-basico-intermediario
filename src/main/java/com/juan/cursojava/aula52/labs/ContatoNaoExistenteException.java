/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula52.labs;

/**
 *
 * @author juann
 */
public class ContatoNaoExistenteException extends Exception {
    private String nomeContato;
    
    public ContatoNaoExistenteException(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    @Override
    public String getMessage() {
        return "Contato "+nomeContato+" não existe na agenda";
    }
    
    
    
}
