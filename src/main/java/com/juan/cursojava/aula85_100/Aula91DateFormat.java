/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula85_100;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juann
 */
public class Aula91DateFormat {
    public static void main(String[] args) {
        Date hoje = new Date();
        System.out.println(hoje);
        System.out.println(Locale.getDefault()); //pt_BR
        
        //Locale.setDefault(Locale.US);
        String hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(hojeFormatado); //29/05/22 21:54
        
        //formata somente a hora
        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(hojeFormatado); //21:54:05
        
        //formata somente a data do dia
        hojeFormatado = DateFormat.getDateInstance().format(hoje);
        System.out.println(hojeFormatado); //29/05/2022
        
        //outra maneira, passando uma constante da classe DateFormat
        hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado); //21:54
        
        //maneira misturada
        hojeFormatado = DateFormat.getDateTimeInstance(
                DateFormat.SHORT, DateFormat.MEDIUM).format(hoje);
        System.out.println(hojeFormatado); //29/05/22 21:54:05
        
        
        //String para data
        String data = "12/05/2022 22:56";
        try {
            //De String para Date
            Date dataDete = DateFormat.getInstance().parse(data);
            System.out.println(dataDete); //Thu May 12 22:56:00 BRT 2022
            
            //Date para Calendar
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(dataDete);
        } catch (ParseException ex) {
            Logger.getLogger(Aula91DateFormat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
