/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula85_100;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author juann
 */
public class Aula92TimeZone {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        TimeZone tz = calendar.getTimeZone();
        System.out.println(tz); //America/Sao_Paulo
        
        /*
        String[] fusos = TimeZone.getAvailableIDs();
        for(String fuso: fusos){
            System.out.println(fuso);
        }
        */
        
        //Configurar fuso horário padrão
        TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");
        System.out.println(tzSP.getDisplayName());
        System.out.println(tzSP.getID());
        
        //converter data por fuso horário
        Calendar agora = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a z");
        System.out.println(sdf.format(agora.getTime()));
        
        Calendar agoraSP = Calendar.getInstance(tzSP); //só muda o ID, não a hora real
        System.out.println(sdf.format(agoraSP.getTime()));
        
        //converter hora por fuso horário - Versão legada ( < Java 8  )
        agoraSP.add(Calendar.HOUR_OF_DAY, tzSP.getOffset(System.currentTimeMillis())*(-1)/1000 /60 /60);
        System.out.println(sdf.format(agoraSP.getTime()));
    }
}
