/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula55;

import com.juan.cursojava.aula53.DiaSemana;

/**
 *
 * @author juann
 */
public class TesteEnum2 {
    public static void main(String[] args) {
        DiaSemana dia;
        
        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
        
        //método valeuOf retorna um Enum
        dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
        System.out.println(dia);
        
    }
}
