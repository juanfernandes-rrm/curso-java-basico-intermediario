/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula64;

/**
 *
 * @author juann
 */
public class Anonima {

    public void imprimeTexto() {
        System.out.println("texto qualquer");
    }

    public static void main(String[] args) {
        Anonima anonima = new Anonima() {
            public void imprimeTexto() {
                System.out.println("texto qualquer que foi alterado");
            }
        };
        anonima.imprimeTexto();

        //Instanciando uma interface como classe anonima
        Texto texto = new Texto() {
            @Override
            public void imprimetexto() {
                System.out.println("qualquer texto - interface");
            }
        };
        texto.imprimetexto();
    }

}
