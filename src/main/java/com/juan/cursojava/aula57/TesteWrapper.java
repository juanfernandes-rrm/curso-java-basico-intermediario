/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula57;

/**
 *
 * @author juann
 */
public class TesteWrapper {
    public static void main(String[] args) {
        //Tipos primitivos do Java
    short num1 = 1;
    byte num2 = 2;
    int num3 = 3;
    long num4 = 10000l;
    float num5 = 3.5f;
    double num6 = 3.5555;
    boolean flag = true;
    char a = 'a';
    
    //Wrappers
    Short num7 = new Short((short)1);
    Byte num8 = new Byte((byte)10);
    Integer num9 = new Integer(100);
    Long num10 = new Long(10000l);
    Float num11 = new Float(3.5f);
    Double num12 = new Double(3.5555);
    Boolean flag2 = new Boolean(true);
    Character b = new Character('b');
    
    Integer num13 = new Integer("100");
    Double num14 = new Double("3.15");
    
    System.out.println(num13.intValue());
    Integer num16 = Integer.parseInt("1000");
    
    //transforma o int primitivo em uma instancia da classe Integer
    Integer num18 = Integer.valueOf(15478);
    
    //operador de igualdade não funciona, pois são objetos
    System.out.println(num9 == num13); //false
    
    }
}
