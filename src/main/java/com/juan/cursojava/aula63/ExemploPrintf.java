/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula63;

/**
 *
 * @author juann
 */
public class ExemploPrintf {
    public static void main(String[] args) {
        System.out.printf("%s", "Olá Mundo!");
        System.out.println();
        System.out.printf("%S","Olá Mundo!");
        System.out.println();
        System.out.printf("%c",'c'); //character
        System.out.printf("%C",'c');
        System.out.printf("%n"); //nova linha
        
        int valor = 123456789;
        int valor2 = -123456789;
        System.out.printf("%d",valor); //número inteiro
        System.out.println();
        
        double pontoFlutuante = 3.14;
        System.out.printf("%f",pontoFlutuante); //ponto flutuante (arrendonda também)
        System.out.println("");
        System.out.printf("%.4f",pontoFlutuante); //4 casas decimais e arrendondado
        System.out.println("");
        System.out.printf("R$%10.2f",pontoFlutuante); //R$ com 10 casas decimais 
        System.out.println("");             //e precisão de 2 casas depois da virgula
        
        String olaMundo = "Olá, Mundo!";
        System.out.printf("%20s",olaMundo); //20 caracteres com alinhamento à direita
        System.out.println();
        
        System.out.printf("%-20s",olaMundo); //20 caracteres com alinhamento à esquerda
        System.out.println();
        
        System.out.printf("%+d",valor); //formata com sinal
        System.out.println();
        System.out.printf("%015d",valor); //15 digitos com complento de 0
        System.out.println();
        System.out.printf("%,d",valor); //separa milhares
        System.out.println();
        System.out.printf("% d",valor2); //exibi o sinal do número (-)
        
        teste();
        
    }
    
    private static void teste(){
        double[] precos = {1000, 125.3, 7548.3, 1, 4.658};
        
        for(int i=0; i<precos.length;i++){
            System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
        }
        
        //Este método não é tão utilizado.
        //A classe Java.util.Formater é mais utilizada
        
    }
}
