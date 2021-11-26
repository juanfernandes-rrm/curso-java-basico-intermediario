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
public class Ex04 {
    public static void main(String[] args) {
        double numConverter = 1;
        double conversao = ConversaoDeUnidadesDeArea.converterMetrosPes(numConverter);
        System.out.println(numConverter+" Metros = "+conversao+" Pés");
        
        conversao = ConversaoDeUnidadesDeArea.converterPesCentimetros(numConverter);
        System.out.println(numConverter+" Pés = "+conversao+" centímetros");
        
        conversao = ConversaoDeUnidadesDeArea.converterMilhasAcres(numConverter);
        System.out.println(numConverter+" Milhas = "+conversao+" Acres");
        
        conversao = ConversaoDeUnidadesDeArea.converterAcresPes(numConverter);
        System.out.println(numConverter+" Acres = "+conversao+" Pés");
    }
}
