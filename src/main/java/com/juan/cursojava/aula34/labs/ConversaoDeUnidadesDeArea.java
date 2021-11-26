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
public class ConversaoDeUnidadesDeArea {
    
    public static double converterMetrosPes(double metros){
        double conversao = metros * 10.76;
        return conversao;
    }
    
    public static double converterPesCentimetros(double pes){
        double conversao = pes * 929;
        return conversao;
    }
    
    public static double converterMilhasAcres(double milhas){
        double conversao = milhas * 640;
        return conversao;
    }
    
    public static double converterAcresPes(double acres){
        double conversao = acres * 43560;
        return conversao;
    }
}
