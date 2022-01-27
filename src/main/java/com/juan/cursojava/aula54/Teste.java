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
public class Teste {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.DOMINGO;
        
        System.out.println(dia.toString()+" - "+dia.getValor());
        
        Data data = new Data(1, 4, 2022, DiaSemana.SEXTA);
    }
}
