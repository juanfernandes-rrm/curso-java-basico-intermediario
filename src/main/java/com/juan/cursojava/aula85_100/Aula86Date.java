/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula85_100;

import java.util.Date;

/**
 *
 * @author juann
 */
public class Aula86Date {
    public static void main(String[] args) {
        Date hoje = new Date();
        System.out.println(hoje);
        
        System.out.println("Quantidade de milisegundos desde 1 jan 1970"+ hoje.getTime());
        System.out.println(hoje.getDay()); //retorna o dia do mês
    }
}
