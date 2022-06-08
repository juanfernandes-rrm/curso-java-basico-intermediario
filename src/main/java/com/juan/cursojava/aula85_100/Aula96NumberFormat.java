/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula85_100;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/**
 *
 * @author juann
 */
public class Aula96NumberFormat {
    public static void main(String[] args) {
        //1.000,00 BR
        //1,000.00 US
        Locale en = new Locale("en","United Stated");
        NumberFormat nf = NumberFormat.getInstance(en);
        
        String num = nf.format(100.99);
        System.out.println(num); //100.99
        
        Locale br = new Locale("pt", "Brazil");
        num = nf.format(100.99);
        System.out.println(num); //100,99

        //Moeda
        NumberFormat moeda = NumberFormat.getCurrencyInstance(br);
        String valor = moeda.format(100.99);
        
        //Classe para auxiliar a manipulação de moedas
        Currency currency = moeda.getCurrency();
        System.out.println(currency); 
        
        //Porcentagem
        NumberFormat porcent = NumberFormat.getPercentInstance();
        String porcentagem =  porcent.format(98.978);
        System.out.println(porcentagem);//9.898%
    }
}
