 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula85_100;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

/**
 *
 * @author juann
 */
public class Aula93DatasJava8 {
    public static void main(String[] args) {
        //Data dd MM yyyy
        LocalDate agora = LocalDate.now();
        System.out.println(agora); //2022-06-02 padrão ISO
        
        //Instanciar
        System.out.println(LocalDate.of(2022, 6, 2));
        System.out.println(LocalDate.parse("2019-02-01")); //string em formato ISO
    
        //Manipular
        System.out.println(agora.plusDays(30));
        System.out.println(agora.minusDays(50));
        System.out.println(agora.minus(1, ChronoUnit.MONTHS)); //ChronoUnit é um enum
    
        System.out.println(agora.getDayOfWeek());
        System.out.println(agora.getDayOfMonth());
        System.out.println(agora.getDayOfYear());
        
        System.out.println(agora.isLeapYear());
        
        
        //Hora hh:mm:ss
        LocalTime hAgora = LocalTime.now();
        System.out.println(hAgora); //11:19:28.528 
        
        //Instanciar
        System.out.println(LocalTime.of(20, 22));
        System.out.println(LocalTime.parse("11:19"));
        
        //Manipular
        System.out.println(hAgora.plusMinutes(60));
        System.out.println(hAgora.minus(40, ChronoUnit.HOURS));
        
        System.out.println(hAgora.getHour());
        
        
        //Data + Hora
        LocalDateTime agoraCompleto = LocalDateTime.now();
        System.out.println(agoraCompleto);
        
        //instanciar
        System.out.println(LocalDateTime.of(2020, 2, 16, 8, 15));
        System.out.println(LocalDateTime.parse("2020-02-16T08:15"));
        
        //manipular
        System.out.println(agora.plusYears(20));
        
        //Fuso horário Java 8
        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);
        
        //set(JavaCollection) = arrays de objetos que nao se repetem
        Set<String> fusos = ZoneId.getAvailableZoneIds();
        for(String f:fusos){
            System.out.println(f);
        }
        
        //Fuso data hora
        ZoneId jp = ZoneId.of("Japan");
        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2020-02-16T08:15"), jp);
        System.out.println(zdt);
        
        //string para objeto
        System.out.println(ZonedDateTime.parse("2020-02-16T08:15+09:00[Japan]"));
    
        
        //Manipulando fuso
        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto,offset);
        System.out.println(offset);
        
        //Date e Calendar para a API
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), jp);
        System.out.println(ldtDate);
        LocalDateTime ldtCalendar = LocalDateTime.ofInstant(c.toInstant(), jp);
        System.out.println(ldtCalendar);
        
    }
}
