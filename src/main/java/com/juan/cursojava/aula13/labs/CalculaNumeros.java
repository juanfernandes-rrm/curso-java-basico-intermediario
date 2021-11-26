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
//ex11 - Programa que peça 2 números inteiros e 1 real
// a - produto do primeiro numero com metade do segundo
// b - soma do triplo do primeiro com o terceiro
// c - terceiro elevado ao cubo
public class CalculaNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro");
        int num = scan.nextInt();
        System.out.println("Digite o segundo número inteiro");
        int num1 = scan.nextInt();
        System.out.println("Digite o um número real");
        double num2 = scan.nextDouble();
        
        System.out.println(num+" X ("+num+" / 2) = "+(num*(num1/2)));
        System.out.println("3 X "+num+" + "+num2+" = "+(3*num+num2));
        System.out.println(num2+"^3 = "+num2*num2*num2);
        
        
    }
}
