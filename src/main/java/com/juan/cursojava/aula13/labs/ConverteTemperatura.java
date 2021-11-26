/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula13.labs;

import java.util.Scanner;

/**
 *
 * @author juann
 */
//ex09 - Programa que converte a temperatura em farenheit para graus celsius
//ex10 - Programa que converte a temperatura em graus celsius para farenheit 
public class ConverteTemperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em Farenheit: ");
        double tempFar = scan.nextDouble();
        double tempCel = 5*(tempFar-32)/9;
        System.out.println(tempFar+" Farenheit = "+tempCel+" graus Celsius");
    
        System.out.println("Digite a temperatura em graus Celsius: ");
        tempCel = scan.nextDouble();
        tempFar = (tempCel*9/5)+32;
        System.out.println(tempCel+" graus Celsius = "+tempFar+" Farenheit");
    }
}
