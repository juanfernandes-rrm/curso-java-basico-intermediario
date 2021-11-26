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
public class Ex06 {
    public static void main(String[] args) {
        double converter = 4 ;
        double conversao;
        
        conversao = ConversaoDeUnidadesDeTempo.converterMinutosSegundos(converter);
        System.out.println(converter+" Minutos = "+conversao+" Segundos");
    
        conversao = ConversaoDeUnidadesDeTempo.converterHorasMinutos(converter);
        System.out.println(converter+" Horas = "+conversao+" Minutos");
        
        conversao = ConversaoDeUnidadesDeTempo.converterDiasHoras(converter);
        System.out.println(converter+" Dias = "+conversao+" Horas");
        
        conversao = ConversaoDeUnidadesDeTempo.converterSemanasDias(converter);
        System.out.println(converter+" Semanas = "+conversao+" Dias");
        
        conversao = ConversaoDeUnidadesDeTempo.converterMesesDias(converter);
        System.out.println(converter+" Meses = "+conversao+" Dias");
        
        conversao = ConversaoDeUnidadesDeTempo.converterAnosDias(converter);
        System.out.println(converter+" Anos = "+conversao+" Dias");
    }
}
