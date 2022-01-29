/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula66;

import com.juan.cursojava.aula61.Contato;

/**
 *
 * @author juann
 */
public class ColetorLixo {

    public static void main(String[] args) {
        Contato[] contatos = new Contato[10000];
        Contato contato;
        for (int i=0; i<contatos.length;i++) {
            contato = new Contato("Contato"+i,"99 9999-9999"+i,"contato"+i+"@email.com");
            contatos[i] = contato;
        }
        
        System.out.println("Contatos criados");
        obterMemoriaUsada();
        
        contatos = null;
        
        Runtime.getRuntime().runFinalization(); //marcando os objetos para serem recolhidos
        Runtime.getRuntime().gc(); //forçando o garbage collector
        
        System.out.println("Contatos removidos da memória");
        obterMemoriaUsada();
    }
    
    public static void obterMemoriaUsada(){
        final int MB = 1024*1024;
        
        Runtime runtime = Runtime.getRuntime(); //singleton
        System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);
    }
}
