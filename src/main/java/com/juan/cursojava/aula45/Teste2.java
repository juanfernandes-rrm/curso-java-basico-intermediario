/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula45;

/**
 *
 * @author juann
 */
public class Teste2 {
    public static void main(String[] args) {
        
        Object obj1 = obterString();//faz referência à uma String 
        String s1 = (String) obj1; //donwCasting
        //funciona pq o obj1 tem uma string
        
        Object obj2 = "Minha String";//faz referência à uma String
        String s2 = (String) obj2; //donwCasting
        //funciona pq o obj2 tem uma string 
        
        Object obj3 = new Object();
        String s3 = (String) obj3; //não da erro de compilação,
        //mas falha em tempo de execução
        
        Object obj4 = obterInteiro();
        String s4 = (String) obj4; //Não funciona
        
    }
    
    public static String obterString(){
        return "minha String";
    }
    
    public static int obterInteiro(){
        return 1;
    }
}
