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
public class Aula80 {
    public static void main(String[] args) {
        String teste = "Isso é um teste";
        
        System.out.println(teste);
        //substring - extrair pedaços da string
        //parametro indice de inicio
        System.out.println(teste.substring(10));
        //parametro indice de inicio e fim
        System.out.println(teste.substring(10,15));
    
        //concat - mesma coisa de concatenar com operador +
        String ola = "olá";
        String mundo = "mundo";
        String olaMundo = ola.concat(mundo); //ola + mundo
        System.out.println(olaMundo);
        
        //replace - substui um caractere por outro
        String espacos = "i s p a ç o";
        String semEspacos = espacos.replace('i','e');
        System.out.println(semEspacos);
        
        semEspacos.replaceAll(" ", "");
        System.out.println(semEspacos);
        
        //trim - retira espaço do começo e do fim de uma string
        String nome = " meu nome é: ";
        System.out.println(nome.trim());
        
    }
}
