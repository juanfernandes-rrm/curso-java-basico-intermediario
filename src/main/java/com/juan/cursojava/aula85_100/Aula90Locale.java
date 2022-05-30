/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula85_100;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author juann
 */
public class Aula90Locale {
    public static void main(String[] args) {
        //dd/MM/yyyy
        //mm/dd/yyyy
        //1.000,02
        //1,000.02
        
        //pega o padrão da máquina
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        
        //mostra todos os padrões
        Locale[] locales = Locale.getAvailableLocales();
        for(Locale loc: locales){
            System.out.println("Nome: "+loc.getDisplayName());    
            System.out.println("Código da língua: "+loc.getLanguage());    
            System.out.println("Código do país"+loc.getDisplayLanguage());    
            System.out.println("Nome do país: "+loc.getDisplayCountry());
            System.out.println("----------- // -----------");
        }
        
        //Configurar para um determinado padrão
        Locale br = new Locale("pt","BR");
        Locale.setDefault(br);
        System.out.println(Locale.getDefault());
        
        
        //Usando o Locale para formatar numero
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(50000000000000d));
        System.out.println("------"); //R$ 50.000.000.000.000,00
        
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf1.format(50000000000000d)); //$50,000,000,000,000.00
        System.out.println("------");

    }
}
