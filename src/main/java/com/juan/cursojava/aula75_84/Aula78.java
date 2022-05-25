/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula75_84;

/**
 *
 * @author juann
 */
public class Aula78 {
    public static void main(String[] args) {
        String ola = "Olá";
        String ola2 = "OLÁ";
        String ola3 = "Olá";
        String ola4 = new String(ola); //cria um novo endereço de memória
        
        System.out.println("ola equals ola2 = "+ola.equals(ola2)); //false
        System.out.println("ola equals ola3 = "+ola.equals(ola3)); //true
        
        System.out.println("ola equals ola3 = "+ola.equalsIgnoreCase(ola2)); //true
        
        
        System.out.println("ola == ola2 "+(ola == ola2)); //false
        System.out.println("ola == ola3 "+(ola == ola3)); //true - ola e ola3 têm a mesma referência
        
        //compara endereço
        System.out.println("ola == ola4 "+(ola == ola4)); //false
        //compara valor
        System.out.println("ola equals ola4 "+(ola.equalsIgnoreCase(ola4))); //true
        
        
        
        String banana = "banana";
        String ana = "ana";
        String ban = "Ban";
        
        banana.regionMatches(1, ana, 0, 3); //true
        //1 - caracter que começa a verificação em bAnana
        //ana - a string que será comparada
        //0 - apartir de qual indice será comparada a string ana
        //3 - quantos caracteres de ana devem ser comparados
        banana.regionMatches(true,0, ban, 0, 3); //ignorecase ativado
        
        System.out.println(banana.endsWith(ana)); //true
        System.out.println(banana.startsWith(ban));
       
        
        String a = "a";
        String b = "b";
        String aMaiusculo = "A";
        
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo("a"));
        System.out.println(a.compareTo(aMaiusculo));
        //-1 quando a > b
        //0 quando a==b
        //1 ou >1 quando a<b
        
        //usado para ordenação de objetos
    }
}
