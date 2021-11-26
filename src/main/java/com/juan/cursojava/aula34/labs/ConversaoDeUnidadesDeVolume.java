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
public class ConversaoDeUnidadesDeVolume {
    public static double converterLitrosCentrimetros(double litros){
        double conversao = litros * 1000;
        return conversao;
    }
    
    public static double converterMetrosLitros(double metros){
        double conversao = metros * 1000;
        return conversao;
    }
    
    public static double converterMetrosPes(double metros){
        double conversao = metros * 35.32;
        return conversao;
    }
    
    public static double converterGalaoPolegadas(double galao){
        double conversao = galao * 231;
        return conversao;
    }
    
    public static double converterGalaoLitros(double galao){
        double conversao = galao * 3785;
        return conversao;
    }
}
