/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula34.labs;

/**
 *
 * @author juann
 */
public class ConversaoDeUnidadesDeTempo {
    public static double converterMinutosSegundos(double minutos){
        double conversao = minutos * 60;
        return conversao;
    }
    
    public static double converterHorasMinutos(double horas){
        double conversao = horas * 60;
        return conversao;
    }
    
    public static double converterDiasHoras(double dias){
        double conversao = dias * 24;
        return conversao;
    }
    
    public static double converterSemanasDias(double semanas){
        double conversao = semanas * 7;
        return conversao;
    }
    
    public static double converterMesesDias(double meses){
        double conversao = meses * 30;
        return conversao;
    }
    
    public static double converterAnosDias(double anos){
        double conversao = anos * 365.25;
        conversao = Math.floor(conversao);
        return conversao;
    }
}
