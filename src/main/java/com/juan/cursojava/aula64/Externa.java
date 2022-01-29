/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula63;

/**
 *
 * @author juann
 */
public class Externa {
    private String texto = "texto externo";
    
    public class Interna{
        private String texto = "texto interno";
        
        public void imprimeTexto(){
            //texto interno
            System.out.println(texto);
            
            //texto externo
            System.out.println(Externa.this.texto);
        }
        
    }
    
    public static void main(String[] args) {
        Externa externa = new Externa();
        Interna interna = externa.new Interna();
        
        interna.imprimeTexto();
    }
}
