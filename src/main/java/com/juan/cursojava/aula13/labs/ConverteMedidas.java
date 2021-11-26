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
//ex05 - Programa que converte metros para centrimetros
public class ConverteMedidas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a medida em metros: ");
        double metros = scan.nextDouble();
        double centimetros = metros*100;
        
        System.out.println(metros+" metros = "+centimetros+" centímetros");
        
    }
}
