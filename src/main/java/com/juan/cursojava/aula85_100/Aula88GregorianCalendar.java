/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula85_100;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author juann
 */
public class Aula88GregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar hoje = new GregorianCalendar();
        System.out.println(hoje);
        
        imprimirData(hoje);
        System.out.println(hoje.isLeapYear(2017));
        GregorianCalendar hoje2 = new GregorianCalendar(2017,0,25);
        imprimirData(hoje2);
    }
    
    private static void imprimirData(Calendar hoje){
        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);
        
        System.out.printf("Hoje é: %d/%02d/%d %02d:%02d:%02d",
                dia,(mes+1),ano,hora,minutos,segundos);
        System.out.println();
    }
}
