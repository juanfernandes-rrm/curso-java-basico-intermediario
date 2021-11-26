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

//ex04 - Programa de calcule a média de 4 notas
public class NotasMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scan.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double nota4 = scan.nextDouble();
        
        double media = (nota1+nota2+nota3+nota4)/4;
        
        System.out.println("A média das notas é: "+media);
    
    }
}
