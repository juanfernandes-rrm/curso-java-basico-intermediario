/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula55;

import com.juan.cursojava.aula54.DiaSemana;

/**
 *
 * @author juann
 */
public class TesteEnum {
    public static void main(String[] args) {
        //método que retorna todos os valores do enum
        DiaSemana[] dias = DiaSemana.values();
        
        for(int i=0;i<dias.length;i++){
            System.out.println(dias[i]);
        }
        
        for(DiaSemana dia:DiaSemana.values()){
            System.out.println(dia);
        }
    }
}
