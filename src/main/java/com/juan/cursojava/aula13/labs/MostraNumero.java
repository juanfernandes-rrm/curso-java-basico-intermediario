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
//ex02 - Programa que peça um número e mostre o número
//ex03 - Programa que mostre a soma de dois números inseridos
public class MostraNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número");
        int num = scan.nextInt();
        System.out.println("O número digitado é: "+num);
    
        System.out.println();
        System.out.println("Soma de dois números");
        System.out.println("Digite o primeiro número: ");
        int num1= scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2= scan.nextInt();
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
        
        
    }
}
