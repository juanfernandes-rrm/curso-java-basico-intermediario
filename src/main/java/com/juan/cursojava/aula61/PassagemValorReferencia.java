/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula61;

/**
 *
 * @author juann
 */
public class PassagemValorReferencia {
    public static void main(String[] args) {
        Contato contato = new Contato("Contato 1","99 99999-9999","contato@email.com");
        int valor = 10;
        
        System.out.println(contato);
        System.out.println(valor);
        
        /*
        testePassagemValorReferencia(valor, contato);
        System.out.println(contato);
        System.out.println(valor);
        */

        testePassagemValorReferencia2(valor, contato);
        System.out.println(contato);
        System.out.println(valor);
        
    }
    
    private static void testePassagemValorReferencia(int valor, Contato contato){
        int novoValor = valor+10;
        valor = novoValor;
        
        contato = new Contato("Contato 2","88 88888-8888","contato2@email.com");
    }
    
    private static void testePassagemValorReferencia2(int valor, Contato contato){
        int novoValor = valor+10;
        valor = novoValor;
        
        contato.setNome("Contato"+novoValor);
    }
}
