/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula85_100;

import java.util.Calendar;

/**
 *
 * @author juann
 */
public class Aula87Calendar {
    public static void main(String[] args) {
        Calendar hoje = Calendar.getInstance(); //singleton
        
        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);
        
        System.out.printf("Hoje é: %d/%02d/%d %02d:%02d:%02d",
                dia,(mes+1),ano,hora,minutos,segundos);
        
        System.out.println();
        hoje.add(Calendar.DAY_OF_MONTH, 11); //+11dias
        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
    }
}
