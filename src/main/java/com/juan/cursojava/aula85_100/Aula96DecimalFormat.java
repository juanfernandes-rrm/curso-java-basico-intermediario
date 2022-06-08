/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula85_100;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author juann
 */
public class Aula96DecimalFormat {
    public static void main(String[] args) {
        String padrao = "###,###.##";
        DecimalFormat df = new DecimalFormat(padrao);
        
        System.out.println(df.format(12458654.152));//12.458.654,15
        
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt","Brazil"));
        dfs.setDecimalSeparator('.');//separador decimal
        dfs.setGroupingSeparator(',');//separador milhar
        
        String padrao2 = "###,###.##";
        df = new DecimalFormat(padrao2, dfs);
        System.out.println(df.format(12458654.152)); //12,458,654.15
        
        String padrao3 = "###,###.##";
        df = new DecimalFormat(padrao3, dfs);
        df.setGroupingSize(4);
        System.out.println(df.format(12458654.152)); //1245,8654.15
        
        String padrao4 = "###,###.00";
        df = new DecimalFormat(padrao4, dfs);
        System.out.println(df.format(12458654.1)); //12,458,654.10
    }
}
