/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula54;

/**
 *
 * @author juann
 */
public class Formulario {
    enum Genero{
        FEMININO('F'), MASCULINO('M');
    
        private char valor;
        
        Genero(char valor){
            this.valor = valor;
        }
    }
    
    private String nome;
    private Genero genero;
}
