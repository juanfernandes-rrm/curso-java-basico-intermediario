/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula58;

/**
 *
 * @author juann
 */
public class TesteAutoboxing {

    public static void main(String[] args) {
        //Autoboxing: atribuição diretamente
        Short num7 = 1;
        Byte num8 = 10;
        Integer num9 = 100;
        Long num10 = 10000l; //new Long(10000l);
        Float num11 = 3.5f;
        Double num12 = 3.5555;
        Boolean flag2 = true;
        //Character b = 'b';
        
        //Auto un-boxing: transformar um 
        //objeto de um wrapper em um tipo primitivo
        int num13 = num9;
        
        //autoboxing em expressões
        num9++;
        //auto un-boxing do num9 -> auto boxing num13/num9 -> num14
        Integer num14 = num13/num9;
        
        //mau uso
        //Não utilizar wrapper se for necessário muitas manipulações númericas
        Double a,b,c;
        a = 10.0;
        b = 12.2;
        c = 4.7;
        Double media = (a+b+c)/3;
        
        
    }
}
