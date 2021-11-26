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
public class Ex05 {
    public static void main(String[] args) {
        double converter = 1;
        double conversao;
        conversao = ConversaoDeUnidadesDeVolume.converterLitrosCentrimetros(converter);
        System.out.println(converter+" Litros cúbicos = "+conversao+" Centímetros cúbicos");
        
        conversao = ConversaoDeUnidadesDeVolume.converterMetrosLitros(converter);
        System.out.println(converter+" Metros cúbicos = "+conversao+" Litros cúbicos");
    
        conversao = ConversaoDeUnidadesDeVolume.converterMetrosPes(converter);
        System.out.println(converter+" Metros cúbicos = "+conversao+" Pés cúbicos");
    
        conversao = ConversaoDeUnidadesDeVolume.converterGalaoPolegadas(converter);
        System.out.println(converter+" Galão cúbicos = "+conversao+" Polegadas cúbicos");
    
        conversao = ConversaoDeUnidadesDeVolume.converterGalaoLitros(converter);
        System.out.println(converter+" Galão cúbicos = "+conversao+" Litros cúbicos");
    }
}
