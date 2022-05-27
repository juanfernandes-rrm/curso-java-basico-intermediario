/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juann
 */
public class Aula89SimpleDateFormat {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
        //dd/MMM/y - 01-MAR-22
        //dd/MM/yyyy - 01-03-2022
        //dd/MM/yyyy HH:mm:ss - 01/03/2022 14:32:55
        Calendar data = new GregorianCalendar(2010,2,20,14,32,55);
        System.out.println(sdf.format(data.getTime()));
        
        
        
        Date hoje = new Date();
        System.out.println(sdf.format(hoje));//= String s = sdf.format(hoje)
        
        //transformar uma string em data
        //obs a string e o SimpleDateFormate precisam ter o mesmo formato
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yy");
        String minhaData = "20/02/2000";
        try {
            Date minhaDataEmDate = sdf1.parse(minhaData);
            System.out.println(minhaDataEmDate);
            System.out.println(sdf.format(minhaDataEmDate));
        } catch (ParseException ex) {
            //caso a string não esteja no formato do sdf
            Logger.getLogger(Aula89SimpleDateFormat.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
