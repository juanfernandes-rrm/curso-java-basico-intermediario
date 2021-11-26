/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula13;

/**
 *
 * @author juann
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);
        
        resultado = resultado + 8;
        System.out.println(resultado);
        
        resultado = resultado % 7;
        System.out.println(resultado);
        
        
        String primeiroNome = "Esta é ";
        String segundoNome = "uma String concatenada.";
        String teceiroNome = primeiroNome + segundoNome;
        System.out.println(teceiroNome);
        
        resultado = resultado +1;
        System.out.println(resultado);
        
        resultado++;
        System.out.println(resultado); //5
        
        System.out.println(resultado++); 
        //Primeiro mostra a variável e depois incrementa -> 5
        //mesma coisa que
        /*
        System.out.println(resultado);
        resultado = resultado +1;
        */
        
       
        System.out.println(++resultado); 
        //Primeiro incrementa a variável e depois mostra -> 7
        //mesma coisa que
        /*
        resultado = resultado +1;
        System.out.println(resultado);
        */
        
        resultado--;
        System.out.println(resultado); //6
        
        System.out.println(resultado--);//mostra 6 variavel = 5
        System.out.println(--resultado);//mostra 4 variavel = 4
        
    }
}
